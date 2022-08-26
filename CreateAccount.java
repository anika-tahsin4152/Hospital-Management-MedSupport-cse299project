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

public class CreateAccount extends AppCompatActivity {

    EditText mFullname,mEmail,mPassword,mPhone;
    Button mRegisterBtn;
    TextView mLoginBtn;
    ProgressBar progressBar;
    FirebaseAuth fAuth;
    TextView log;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createaccount);



        //VARIABLE CONNECTED TO THE XML RESOURCES

        mFullname = findViewById(R.id.fname);
        mEmail = findViewById(R.id.email);
        mPassword = findViewById(R.id.pass);
        mPhone = findViewById(R.id.phone);
        mRegisterBtn = findViewById(R.id.createButton);
        mLoginBtn = findViewById(R.id.Login);

        fAuth = FirebaseAuth.getInstance();
        progressBar = findViewById(R.id.progressBar);

        if(fAuth.getCurrentUser() != null){
            startActivity(new Intent(getApplicationContext(), Frontpage.class));
            finish();
        }

        mRegisterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
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

                //REGISTER USER

               fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>()
                {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task)
                    {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(CreateAccount.this, "user created", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), Frontpage.class));

                        }
                        else
                        {
                            Toast.makeText(CreateAccount.this, "Error Found " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }

                });
            };


        });
        log =findViewById(R.id.Login);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4= new Intent(getApplicationContext(),Frontpage.class);
                startActivity(i4);

            }
        });





    }
}
