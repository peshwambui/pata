package com.pennywamboh.patainsurance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MotorActivity extends AppCompatActivity {

    Spinner spinnerCoverTypes, spinnerUsage, spinnerModel, spinnerCarMake;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motor);

        initializeObjects();
    }

    private void initializeObjects() {
        spinnerCoverTypes = findViewById(R.id.spinnerCoverTypes);
        spinnerUsage = findViewById(R.id.spinnerUsage);
        spinnerModel = findViewById(R.id.spinnerModel);
        spinnerCarMake = findViewById(R.id.spinnerCarMake);



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.cover_types, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCoverTypes.setAdapter(adapter);

        adapter = ArrayAdapter.createFromResource(this,
                R.array.vehicle_usage, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerUsage.setAdapter(adapter);

        adapter = ArrayAdapter.createFromResource(this,
                R.array.vehicle_makes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCarMake.setAdapter(adapter);

        spinnerCarMake.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                String selectedText = parent.getItemAtPosition(position).toString();
                inflateCarModel(selectedText);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
    }

    private void inflateCarModel(String selectedText) {
       int models =  R.array.toyota_models;
        switch (selectedText){
            case "Nissan":
                models =  R.array.nissan_models;
                break;
            case "Subaru":
                models = R.array.subaru_models;
                break;
            case "Mitsubishi":
                models = R.array.mitsubishi_models;
                break;
            case "Honda":
                models = R.array.honda_models;
                break;
            case "Isuzu":
                models = R.array.isuzu_models;
                break;
            case "Mazda":
                models = R.array.mazda_models;
                break;
            case "Suzuki":
                models = R.array.suzuki_models;
                break;
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                models, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerModel.setAdapter(adapter);
    }
}