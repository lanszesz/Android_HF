package com.example.hf1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText number1EditText = findViewById(R.id.editTextUpper);
        EditText number2EditText = findViewById(R.id.editTextLower);

        Button additionButton = findViewById(R.id.additionButton);
        Button substractionButton = findViewById(R.id.substractionButton);
        Button multiplicationButton = findViewById(R.id.multiplicationButton);
        Button divisionButton = findViewById(R.id.divisionButton);

        TextView resultTextView = findViewById(R.id.resultTextView);

        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Integer.parseInt(number1EditText.getText().toString()) + Integer.parseInt(number2EditText.getText().toString());
                resultTextView.setText("" + result);
            }
        });

        substractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Integer.parseInt(number1EditText.getText().toString()) - Integer.parseInt(number2EditText.getText().toString());
                resultTextView.setText("" + result);
            }
        });

        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Integer.parseInt(number1EditText.getText().toString()) * Integer.parseInt(number2EditText.getText().toString());
                resultTextView.setText("" + result);
            }
        });

        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = Integer.parseInt(number1EditText.getText().toString()) / Integer.parseInt(number2EditText.getText().toString());
                resultTextView.setText("" + result);
            }
        });
    }
}