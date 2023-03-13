package com.pennywamboh.patainsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    LinearLayout btnPersonalIns,btnMotorInsurance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeObjects();
    }

    private void initializeObjects() {
        btnPersonalIns = findViewById(R.id.btnPersonalIns);
        btnMotorInsurance = findViewById(R.id.btnMotorInsurance);

        btnMotorInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MotorActivity.class);
                startActivity(i);
            }
        });

        btnPersonalIns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view, "Coming Soon!", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
    }
}