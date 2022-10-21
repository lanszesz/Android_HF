package com.example.hf05;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listData = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView todoList = findViewById(R.id.todoList);

        listData.add("Elvinni a szemetet");
        listData.add("Államvizsga");
        listData.add("Reggeli");
        listData.add("Android 5. házi");
        listData.add("Android 6. házi");
        listData.add("Megnézni a Remény Rabjait");

        registerForContextMenu(todoList);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listData);
        todoList.setAdapter(adapter);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        AdapterView.AdapterContextMenuInfo listItem = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();

        switch (item.getItemId()) {
            case R.id.conMenuRed:
                listItem.targetView.setBackgroundColor(Color.RED);
                return true;
            case R.id.conMenuGreen:
                listItem.targetView.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.conMenuYellow:
                listItem.targetView.setBackgroundColor(Color.YELLOW);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.optionSort:
                Toast.makeText(MainActivity.this, "Lista ABC sorrendbe rendezve", Toast.LENGTH_SHORT).show();
                Collections.sort(listData);
                adapter.notifyDataSetChanged();
                return true;
            case R.id.optionDelete:
                Toast.makeText(MainActivity.this, "Lista törölve", Toast.LENGTH_SHORT).show();
                listData.clear();
                adapter.notifyDataSetChanged();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}