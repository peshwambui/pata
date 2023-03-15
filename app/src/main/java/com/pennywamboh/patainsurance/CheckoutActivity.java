package com.pennywamboh.patainsurance;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CheckoutActivity extends AppCompatActivity {

    Button btnPurchase;
    EditText etfullName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        btnPurchase = findViewById(R.id.btnPurchase);
        etfullName = findViewById(R.id.etfullName);

        btnPurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirmPurchase();
            }
        });
    }

    private void confirmPurchase() {
        String name = etfullName.getText().toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Policy Purchase");
        builder.setMessage("Dear "+name+",\nThank you for insuring with us. Please wait to enter Mpesa Pin to complete your order.");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Action to be performed when OK button is clicked
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();

    }
}

