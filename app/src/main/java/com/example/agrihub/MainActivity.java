package com.example.agrihub;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this is pointing to the correct XML layout

        // Find the Spinner by its ID
        Spinner cropSpinner = findViewById(R.id.cropSpinner);

        // Create an adapter for the crop spinner
        ArrayAdapter<CharSequence> cropAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.crops, // Referring to the new string-array in resources for crops
                android.R.layout.simple_spinner_item
        );
//this is laxmiprasanna
        // Set the dropdown style for the spinner
        cropAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Set the adapter for the spinner
        cropSpinner.setAdapter(cropAdapter);

        // Find the Quantity Spinner
        Spinner quantitySpinner = findViewById(R.id.quantitySpinner);

        // Create the adapter using the string array defined in resources
        ArrayAdapter<CharSequence> quantityAdapter = ArrayAdapter.createFromResource(
                this,
                R.array.quantity_options, // Referring to the string-array in resources for quantities
                android.R.layout.simple_spinner_item
        );

        // Set the dropdown style for the spinner
        quantityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Set the adapter for the quantity spinner
        quantitySpinner.setAdapter(quantityAdapter);
    }
}
