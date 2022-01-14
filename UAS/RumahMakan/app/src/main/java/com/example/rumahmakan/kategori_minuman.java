package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

public class kategori_minuman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_minuman);
    }

    public void mineral(View view) {
        Intent intent = new Intent(kategori_minuman.this,Mineral.class);
        startActivity(intent);
    }

    public void tetes(View view) {
        Intent intent = new Intent(kategori_minuman.this,teh_es.class);
        startActivity(intent);
    }

    public void kelapases(View view) {
        Intent intent = new Intent(kategori_minuman.this,es_kelapa.class);
        startActivity(intent);
    }

    public void jerukes(View view) {
        Intent intent = new Intent(kategori_minuman.this,es_jeruk.class);
        startActivity(intent);
    }

    public void backd(View view) {
        Intent intent = new Intent(kategori_minuman.this,Kategori.class);
        startActivity(intent);
    }

}