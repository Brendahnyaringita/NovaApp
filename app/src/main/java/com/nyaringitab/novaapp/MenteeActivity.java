package com.nyaringitab.novaapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MenteeActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    private EditText name,email,password,company,confirmPassword,occupation;
    private Button SignIn_Mentee;

    private TextView dataTextView;

    private DatabaseReference root;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentee);
        auth=FirebaseAuth.getInstance();
        //creates a Firebase database object
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("message");

        root = FirebaseDatabase.getInstance().getReference();
        dataTextView = findViewById(R.id.textView3);



        //myRef.setValue("Welcome to RiskIt!");
        //Read from thew database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //This method is called once with the initial value and again
                // whenever data at this location is updated
                String value =dataSnapshot.getValue(String.class);
                dataTextView.setText(value);
                //Log.d("Anything","Value is"+value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                //Failed to read value
                dataTextView.setText("Error " + databaseError.toString());
            }
        });

       //Log.d("findme", "onCreate: ");

        //String type = getIntent().getStringExtra("type");
        name=findViewById(R.id.edt_mentee_name);
        email=findViewById(R.id.edt_mentee_email);
        password=findViewById(R.id.edt_mentee_password);
        confirmPassword=findViewById(R.id.edt_confirm_pass);
        company=findViewById(R.id.edt_organization);
        occupation=findViewById(R.id.edt_occupation);


        SignIn_Mentee=findViewById(R.id.btn_sign_in);
        SignIn_Mentee.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                String gottenName = name.getText().toString();
                String gottenEmail = email.getText().toString();
                String gottenPass = password.getText().toString();
                String gottenCompany = company.getText().toString();
                String gottenConfirmPass=confirmPassword.getText().toString();
                String gottenOccupation=occupation.getText().toString();

                Toast.makeText(MenteeActivity.this, "Authenticating", Toast.LENGTH_LONG).show();

                Log.d("register_button", "onClick: " + gottenEmail + gottenPass);

                if (gottenPass.equals(gottenConfirmPass)) {

                    registerUser(gottenEmail, gottenPass, gottenName, gottenCompany, gottenOccupation);
                    Log.d("register_button_if", "onClick: " + gottenEmail + gottenPass);
                }
                //Write a message to the database
                //myRef.setValue("Hello, World!");
            }
        });

    }

    private void registerUser(final String gottenEmail, final String gottenPass, final String gottenName,final String gottenCompany, final String gottenOccupation) {

        auth.createUserWithEmailAndPassword(gottenEmail, gottenPass).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    //shows that sign in was a success and update UI with new info
                    Log.d("qwerty", "createUserWithEmail:success");
                    FirebaseUser user = auth.getCurrentUser();

                    String uid = user.getUid();
                    //String company = user.getgo
                    //String name=user.getDisplayName();
                    //String email=user.getEmail();


                    DatabaseReference userDB = root.child("Users").child(uid);

                    userDB.child("name").setValue(gottenName);
                    userDB.child("email").setValue(gottenEmail);
                    userDB.child("company").setValue(gottenCompany);
                    userDB.child("occupation").setValue(gottenOccupation);

                    Toast.makeText(MenteeActivity.this, "Authentication Successful", Toast.LENGTH_LONG).show();

                    Intent signintent = new Intent(MenteeActivity.this, MenteeProfile.class);
                    startActivity(signintent);
                } else {
                    //Sign in Failure case, displays message to user
                    //Log.w(TAG, "CreateUserWithEmail:failure",task.getException());
                    Log.d("failure", "createUserWithEmail:failure", task.getException());
                    Log.d("failure", "createUserWithEmail:failure" + gottenEmail + gottenPass);
                    Toast.makeText(MenteeActivity.this, "Authentication failed", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
