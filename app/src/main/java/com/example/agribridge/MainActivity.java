package com.example.agribridge;

//package com.example.zomatologin;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText phoneNumberInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        phoneNumberInput = findViewById(R.id.phoneNumberInput);
        Button continueButton = findViewById(R.id.continueButton);

        // Set click listener on the Continue button
        continueButton.setOnClickListener(view -> {
            String phoneNumber = phoneNumberInput.getText().toString().trim();

            // Validate phone number
            if (isValidPhoneNumber(phoneNumber)) {
                Toast.makeText(MainActivity.this, "Phone number is valid!", Toast.LENGTH_SHORT).show();
                // Proceed with the login/signup process
            } else {
                Toast.makeText(MainActivity.this, "Please enter a valid phone number!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /**
     * Validates the phone number.
     * @param phoneNumber The phone number entered by the user.
     * @return True if the phone number is valid, false otherwise.
     */
    private boolean isValidPhoneNumber(String phoneNumber) {
        // Check if the phone number is not empty and has exactly 10 digits
        return !TextUtils.isEmpty(phoneNumber) && phoneNumber.matches("\\d{10}");
    }
}
