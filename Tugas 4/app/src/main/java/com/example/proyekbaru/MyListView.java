package com.example.proyekbaru;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MyListView extends AppCompatActivity {
    ListView listView;
    public String bhs_program[] = {"prolog","C++","Pascal","Cobol","Perl","Algo L","Java","PHP","Python","HTMl","CSS","JavaScript};

    Spinner combo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.listdata);
        combo=(Spinner) findViewById(R.id.combodata);

        ArrayAdapter adapter = new ArrayAdapter( MyListView.this, R.layout.support_simple_spinner_dropdown_item,bhs_program);
        listView.setAdapter(adapter);
        combo.setAdapter(adapter);
    }
}
