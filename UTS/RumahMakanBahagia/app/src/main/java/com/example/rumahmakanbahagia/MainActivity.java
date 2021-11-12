package com.example.rumahmakanbahagia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = findViewById(R.id.listMakanan);
        List<String> list = new ArrayList<>();
        list.add("Nasi Goreng                                         Rp 15.000");
        list.add("Mie Goreng                                          Rp 15.000");
        list.add("Soto Ayam                                           Rp 12.000");
        list.add("Bubur Ayam                                         Rp 12.000");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    startActivity(new Intent(MainActivity.this, NasiGoreng.class));
                } else if (position == 1) {
                    startActivity(new Intent(MainActivity.this, mie_goreng.class));
                } else if (position == 2) {
                    startActivity(new Intent(MainActivity.this, Soto.class));
                } else if (position == 3){
                    startActivity(new Intent(MainActivity.this, Bubur.class));
                }
            }
        });

    }
}
