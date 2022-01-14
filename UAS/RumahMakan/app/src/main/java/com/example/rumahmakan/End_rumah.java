package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class End_rumah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_rumah);
    }

    public void home(View view) {
        Intent intent = new Intent(End_rumah.this,Kategori.class);
        startActivity(intent);
    }
}