package com.example.hf4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private final String[] currencyAcronyms = {
        "EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"
    };

    private final String[] currencyNames = {
        "EURO", "UNITED STATES DOLLAR", "GREAT BRITISH POUND", "AUSTRALIAN DOLLAR", "CANADIAN DOLLAR", "SWISS FRANC", "DANISH KRONE", "HUNGARIAN FORINT"
    };

    private final String[] buyPrices = {
            "4,4100", "3,9750", "6,1250", "2,9600", "3,0950", "4,2300", "0,5850", "0,0136"
    };

    private final String[] sellPrices = {
            "4,5500", "4,1450", "6,3550", "3,0600", "3,2650", "4,3300", "0,6150", "0,0146"
    };

    Integer[] images = {
            R.drawable.eu,
            R.drawable.us,
            R.drawable.gb,
            R.drawable.au,
            R.drawable.ca,
            R.drawable.ch,
            R.drawable.dk,
            R.drawable.hu,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.currencyListView);

        CustomAdapter customAdapter = new CustomAdapter(this, images, currencyAcronyms, currencyNames, buyPrices, sellPrices);

        list.setAdapter(customAdapter);
    }


}