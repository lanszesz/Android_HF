package com.example.labor2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity3", "On Destroy!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity3", "On Restart!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity3", "On Resume!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity3", "On Pause!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity3", "On Start!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity3", "On Stop!");
    }
}