package com.medsupport.med;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DoctorHome extends AppCompatActivity {
    Button gtbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctorhome);

        /*gtbtn= findViewById(R.id.getbtn);
        gtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dr = new Intent(getApplicationContext(), Doctors.class);
                startActivity(dr);
            }
        });*/

    }
}