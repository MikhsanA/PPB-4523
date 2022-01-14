package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kategori extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
    }

    public void back1(View view) {
        Intent intent = new Intent(Kategori.this,MainActivity.class);
        startActivity(intent);
    }

    public void MakananAksi(View view) {
        Intent intent = new Intent(Kategori.this,kategori_makanan.class);
        startActivity(intent);


    }

    public void MinumanAksi(View view) {
        Intent intent = new Intent(Kategori.this,kategori_minuman.class);
        startActivity(intent);
    }
}