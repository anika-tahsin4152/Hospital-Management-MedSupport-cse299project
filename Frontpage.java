package com.medsupport.med;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Frontpage extends AppCompatActivity {
    Button b1;
    TextView signup;
    EditText mEmail,mPassword;
    Button mcreateBtn;
    TextView mLoginBtn;
    ProgressBar progressBar;
    FirebaseAuth fAuth;

    //TextView log;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontpage);


        mEmail = findViewById(R.id.email);
        mPassword = findViewById(R.id.pass);
        mcreateBtn = findViewById(R.id.createButton);
        mLoginBtn = findViewById(R.id.Login);
        fAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar);


        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mEmail.getText().toString().trim();
                String password = mPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email))

                {
                    mEmail.setError("email is required.");
                    return;
                }
                if (TextUtils.isEmpty(password))
                {
                    mPassword.setError("password is required.");
                    return;
                }

                if(password.length() < 6)
                {
                    mPassword.setError(("Password must be at least 8 characters"));
                }

                progressBar.setVisibility(view.VISIBLE);

                fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Frontpage.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), Dashboard.class));
                        }
                        else{
                            Toast.makeText(Frontpage.this, "Error !", Toast.LENGTH_SHORT).show();

                        }
                    }
                });

            }
        });
        b1 = findViewById(R.id.Loginbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Dashboard.class);
                startActivity(i);
            }
        });

        //textview connection
        signup = findViewById(R.id.sign);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ic = new Intent(getApplicationContext(), Pdsignup.class);
                startActivity(ic);
                Toast.makeText(Frontpage.this, "Create Your Account Here", Toast.LENGTH_LONG).show();
            }
        });



    }


}

