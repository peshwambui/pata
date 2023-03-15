package com.pennywamboh.patainsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuoteActivity extends AppCompatActivity {

    Button btnBuyPolicy1, btnBuyPolicy2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);

        initializeObjects();
    }

    private void initializeObjects() {
        btnBuyPolicy1 = findViewById(R.id.btnBuyPolicy1);
        btnBuyPolicy2 = findViewById(R.id.btnBuyPolicy2);

        btnBuyPolicy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buyPolicy(53574);
            }
        });

        btnBuyPolicy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buyPolicy(58700);
            }
        });
    }

    private void buyPolicy(int i) {
        Intent intent = new Intent(QuoteActivity.this, CheckoutActivity.class);
        startActivity(intent);
    }
}