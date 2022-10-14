package com.example.hf4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter {

    private final Activity context;

    private final Integer[] imageIDS;

    private final String[] currencyAcronyms;

    private final String[] currencyNames;

    private final String[] buyPrices;

    private final String[] sellPrices;

    private final String priceCurrency;

    public CustomAdapter(Activity context, Integer[] imageIDS, String[] currencyAcronyms, String[] currencyNames, String[] buyPrices, String[] sellPrices) {
        super(context, R.layout.listitem, currencyNames);
        this.context = context;
        this.imageIDS = imageIDS;
        this.currencyAcronyms = currencyAcronyms;
        this.currencyNames = currencyNames;
        this.buyPrices = buyPrices;
        this.sellPrices = sellPrices;
        this.priceCurrency = " RON";
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View rowView = inflater.inflate(R.layout.listitem, null, true);

        ImageView kep = rowView.findViewById(R.id.flag);
        TextView currencyAcronym = rowView.findViewById(R.id.currencyAcronym);
        TextView currencyName = rowView.findViewById(R.id.currencyName);
        TextView buyPrice = rowView.findViewById(R.id.buyPrice);
        TextView sellPrice = rowView.findViewById(R.id.sellPrice);

        kep.setImageResource(imageIDS[position]);
        currencyAcronym.setText(currencyAcronyms[position]);
        currencyName.setText(currencyNames[position]);
        buyPrice.setText(buyPrices[position] + priceCurrency);
        sellPrice.setText(sellPrices[position] + priceCurrency);

        return rowView;
    }
}
