package com.example.homeworkweek1day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvFirstName;
    TextView tvLastName;
    TextView tvAddress;
    TextView tvCity;
    TextView tvState;
    TextView tvPostalCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvFirstName = findViewById(R.id.tvFirstNameDisplay);
        tvLastName = findViewById(R.id.tvLastNameDisplay);
        tvAddress = findViewById(R.id.tvAddressDisplay);
        tvCity = findViewById(R.id.tvCityDisplay);
        tvState = findViewById(R.id.tvStateDisplay);
        tvPostalCode = findViewById(R.id.tvPostalCodeDisplay);

        //get the current intent
        Intent currentIntent = getIntent();

        //get the attached extras from the intent
        //we should use the same key as we used to attach the data.
        String firstName = currentIntent.getStringExtra("FIRST_NAME");
        String lastName = currentIntent.getStringExtra("LAST_NAME");
        String address = currentIntent.getStringExtra("ADDRESS");
        String city = currentIntent.getStringExtra("CITY");
        String state = currentIntent.getStringExtra("STATE");
        String postalCode = currentIntent.getStringExtra("POSTAL_CODE");

        //set the text for the text viewers
        tvFirstName.setText(firstName);
        tvLastName.setText(lastName);
        tvAddress.setText(address);
        tvCity.setText(city);
        tvState.setText(state);
        tvPostalCode.setText(postalCode);
    }
}
