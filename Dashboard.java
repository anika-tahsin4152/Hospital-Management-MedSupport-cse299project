package com.medsupport.med;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {
    ImageView userimage;
    ImageView img2;
    ImageView m;
    ImageView am;
    ImageView n;
    ImageView b;
    //ImageView am;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        userimage = findViewById(R.id.userpic);
        userimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(getApplicationContext(), Logout.class);
                startActivity(i3);
            }
        });
        img2 = findViewById(R.id.d);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent im = new Intent(getApplicationContext(), DoctorHome.class);
                startActivity(im);
            }
        });
        m = findViewById(R.id.m);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(getApplicationContext(), Medicine.class);
                startActivity(m);
            }
        });
        am = findViewById(R.id.am);
        am.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent am = new Intent(getApplicationContext(),Ambulance.class);
                startActivity(am);
            }
        });
        n = findViewById(R.id.n);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(getApplicationContext(),Ambulance.class);
                startActivity(n);
            }
        });
        b= findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(getApplicationContext(),Ambulance.class);
                startActivity(b);
            }
        });

    }
}