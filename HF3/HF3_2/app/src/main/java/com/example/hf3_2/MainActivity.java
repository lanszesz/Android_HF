package com.example.hf3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Product> productList = new ArrayList<>();

        EditText codeInput = findViewById(R.id.productCodeInput);
        EditText nameInput = findViewById(R.id.productNameInput);
        EditText priceInput = findViewById(R.id.productPriceInput);

        Button addProductButton = findViewById(R.id.addButton);
        Button cancelButton = findViewById(R.id.cancelButton);
        Button showButton = findViewById(R.id.showButton);

        TextView showProductsText = findViewById(R.id.showProductsText);

        addProductButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(codeInput.getText()) || TextUtils.isEmpty(nameInput.getText()) || TextUtils.isEmpty(priceInput.getText())) {
                    Toast error = Toast.makeText(getApplicationContext(), "Hiba!", Toast.LENGTH_SHORT);
                    error.show();
                    return;
                }

                String productCode = codeInput.getText().toString();
                String productName = nameInput.getText().toString();
                Double productPrice = Double.parseDouble(priceInput.getText().toString());

                productList.add(new Product(productCode, productName, productPrice));
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                codeInput.getText().clear();
                nameInput.getText().clear();
                priceInput.getText().clear();
            }
        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "";

                for (Product product :
                        productList) {
                    text += product.toString();
                }

                showProductsText.setText(text);
                showProductsText.setVisibility(View.VISIBLE);
            }
        });
    }
}