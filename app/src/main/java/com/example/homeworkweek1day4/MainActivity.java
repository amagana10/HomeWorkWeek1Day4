package com.example.homeworkweek1day4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFirstName;
    EditText etLastName;
    EditText etAddress;
    EditText etCity;
    EditText etState;
    EditText etPostalCode;
    Button btnSend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstName = findViewById(R.id.etFirstNameInput);
        etLastName = findViewById(R.id.etLastNameInput);
        etAddress = findViewById(R.id.etAddressInput);
        etCity = findViewById(R.id.etCityInput);
        etState = findViewById(R.id.etStateInput);
        etPostalCode = findViewById(R.id.etPostalCodeInput);
    }

    public void onButtonClickHandler(View view) {
        String firstName = etFirstName.getText() != null ? etFirstName.getText().toString(): "";
        String lastName = etLastName.getText() != null ? etLastName.getText().toString():"";
        String address = etAddress.getText() != null ? etAddress.getText().toString(): "";
        String city = etCity.getText() != null ? etCity.getText().toString():"";
        String state = etState.getText() != null ? etState.getText().toString(): "";
        String postalCode = etPostalCode.getText() != null ? etPostalCode.getText().toString():"";

        //creating intent
        Intent secondActivityIntent = new Intent(this, SecondActivity.class);

        //sending info through putExtra
        secondActivityIntent.putExtra("FIRST_NAME", firstName);
        secondActivityIntent.putExtra("LAST_NAME", lastName);
        secondActivityIntent.putExtra("ADDRESS", address);
        secondActivityIntent.putExtra("CITY", city);
        secondActivityIntent.putExtra("STATE", state);
        secondActivityIntent.putExtra("POSTAL_CODE", postalCode);

        startActivity(secondActivityIntent);

        startActivityForResult(secondActivityIntent, 777);
    }
}
