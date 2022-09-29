package com.example.hf1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button additionButton = findViewById(R.id.additionButton);
        Button substractionButton = findViewById(R.id.substractionButton);
        Button multiplicationButton = findViewById(R.id.multiplicationButton);
        Button divisionButton = findViewById(R.id.divisionButton);

        additionButton.setOnClickListener(this);
        substractionButton.setOnClickListener(this);
        multiplicationButton.setOnClickListener(this);
        divisionButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        EditText number1EditText = findViewById(R.id.editTextUpper);
        EditText number2EditText = findViewById(R.id.editTextLower);
        TextView resultTextView = findViewById(R.id.resultTextView);

        double elsoSzam = 0;
        try {
            elsoSzam = Double.parseDouble(number1EditText.getText().toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            Toast toast = Toast.makeText(getApplicationContext(), "Írd be az első számot!", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }

        double masodikSzam = 0;
        try {
            masodikSzam = Double.parseDouble(number2EditText.getText().toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            Toast toast = Toast.makeText(getApplicationContext(), "Írd be a második számot!", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }

        double result = 0;

        switch (view.getId()) {
            case R.id.additionButton:
                result = elsoSzam + masodikSzam;
                resultTextView.setText("" + result);
                break;
            case R.id.substractionButton:
                result = elsoSzam - masodikSzam;
                resultTextView.setText("" + result);
                break;
            case R.id.multiplicationButton:
                result = elsoSzam * masodikSzam;
                resultTextView.setText("" + result);
                break;
            case R.id.divisionButton:
                result = elsoSzam / masodikSzam;
                resultTextView.setText("" + result);
                break;
        }
    }
}