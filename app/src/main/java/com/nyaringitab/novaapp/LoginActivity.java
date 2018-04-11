package com.nyaringitab.novaapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
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

public class LoginActivity extends AppCompatActivity {

    private TextView SignIn;
    private Button Login;
    private EditText email,password;
    private FirebaseAuth auth ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        auth=FirebaseAuth.getInstance();
        /*if (auth.getCurrentUser() != null) {
            startActivity(new Intent LoginActivity);
            finish();
        }*/

        SignIn=findViewById(R.id.textView4);
        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MenteeProfile.class));
            }
        });


        email=findViewById(R.id.editText);
        password=findViewById(R.id.editText2);
        Login=findViewById(R.id.btn_login);

        final String gottenEmail = email.getText().toString();
        final String gottenPassword = password.getText().toString();

        //String gottenEmail=email.getText().toString();
        //String gottenPassword=password.getText().toString();

        /*Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gottenEmail = email.getText().toString();
                final String gottenPassword = password.getText().toString();

                if (TextUtils.isEmpty(gottenEmail)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(gottenPassword)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }
    }});*/
    }


    private void LoginUser(final String gottenEmail,final String gottenPass){
        auth.signInWithEmailAndPassword(gottenEmail, gottenPass).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    //Update the UI with the signed-in user's info
                    Log.d("Finally","Login with Email:success");
                    FirebaseUser user=auth.getCurrentUser();
                    Intent loginintent = new Intent(LoginActivity.this, MenteeProfile.class);
                    startActivity(loginintent);
                }
                else{
                    //If Login fails, display a message to user
                    Log.w("Failed", "signInWithEmail:failure", task.getException());
                    Log.d("failure", "createUserWithEmail:failure" + gottenEmail + gottenPass);
                    Toast.makeText(LoginActivity.this,"Authentication failed", Toast.LENGTH_SHORT).show();
                    //return(LoginActivity);

                }
            }
        });
    }}
   /* public void SignIn(View view)
    {
      Intent intent=new Intent(this,MenteeActivity.class);
      startActivity(intent);*/
   /* }
    public void Login(View view){
        Intent intent =new Intent(this,MenteeProfile.class);
        startActivity(intent);
    }*/