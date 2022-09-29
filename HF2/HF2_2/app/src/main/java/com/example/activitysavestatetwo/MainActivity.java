package com.example.activitysavestatetwo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    EditText editText;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("checkBox", checkBox.isChecked());
        outState.putString("editText", editText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        boolean checkboxState = savedInstanceState.getBoolean("checkBox");
        String editTextText = savedInstanceState.getString("editText");

        checkBox.setChecked(checkboxState);
        editText.setText(editTextText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.checkBox);
        editText = findViewById(R.id.editTextBankPin);
    }
}