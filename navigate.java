package com.medsupport.med;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class navigate extends AppCompatActivity {
    DrawerLayout drlay ;
    NavigationView nvd;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigate);

        drlay = findViewById(R.id.drlay);
        nvd = findViewById(R.id.nvd);
        toolbar = findViewById(R.id.toolbar);

        //step 1

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drlay,toolbar,R.string.OpenDrawer,R.string.CloseDrawer);
        drlay.addDrawerListener(toggle);
        toggle.syncState();

        nvd.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id==R.id.opthis )
                {


                }
                else if (id==R.id.optHome)
                {

                }
                else {

                }



                return true;







            }
        });

    }
}