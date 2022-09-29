package com.example.labor2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView clickOnMe;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("clickOnMeText", clickOnMe.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String clickOnMeText = savedInstanceState.getString("clickOnMeText", "Katt ide");
        clickOnMe.setText(clickOnMeText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activityButton = findViewById(R.id.button);

        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });

        clickOnMe = findViewById(R.id.clickOnMe);

        clickOnMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = clickOnMe.getText() + "\nHello";
                clickOnMe.setText(text);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity", "On Destroy!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity", "On Restart!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity", "On Resume!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity", "On Pause!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity", "On Start!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity", "On Stop!");
    }
}