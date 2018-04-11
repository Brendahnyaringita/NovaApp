package com.nyaringitab.novaapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
//import android.support.annotation.NonNull;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class Home extends AppCompatActivity {

    private static final String TAG = "MesMessages";
    private Button join;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Log.i(TAG, "onCreate");
        mAuth=FirebaseAuth.getInstance();

        join=findViewById(R.id.btn_join);
        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this, LoginActivity.class));

            }
        });
    }

   /* private void updateUI() {
        Intent loginIntent= new Intent(Home.this,LoginActivity.class);
        startActivity(loginIntent);
        finish();
        return;

    }*/

    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser currentUser=mAuth.getCurrentUser();
        if (currentUser==null){
            //Goes to the LoginActivity
            Intent loginIntent = new Intent(Home.this,LoginActivity.class);
            startActivity(loginIntent);
            finish();
        }

        /*else{
            AlertDialog.Builder builder=new AlertDialog.Builder(Home.this);
            builder.setMessage(currentUser.toString()).show();
        }*/

    }
}
