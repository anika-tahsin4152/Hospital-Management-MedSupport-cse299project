package com.medsupport.med;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Pdsignup extends AppCompatActivity {
    Button Dr;
    Button Pr;
    TextView Login2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdsignup);

        /*Dr = findViewById(R.id.drBtn);
        Dr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(getApplicationContext(), Drsignup.class);
                startActivity(d);
            }
        });

        Pr = findViewById(R.id.Ptbtn);
        Pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(getApplicationContext(),CreateAccount.class);
                startActivity(p);
            }
        });
        Login2 = findViewById(R.id.login2);
        Login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(getApplicationContext(), Frontpage.class);
                startActivity(l);
            }
        });*/

    }}
