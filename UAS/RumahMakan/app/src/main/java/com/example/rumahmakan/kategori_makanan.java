package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class kategori_makanan extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_makanan);
    }

    public void back2(View view) {
        Intent intent = new Intent(kategori_makanan.this,Kategori.class);
        startActivity(intent);
    }

    public void miegrg(View view) {
        Intent intent = new Intent(kategori_makanan.this,mie_goreng.class);
        startActivity(intent);
    }

    public void sotoaym(View view) {
        Intent intent = new Intent(kategori_makanan.this,soto_ayam.class);
        startActivity(intent);
    }

    public void pecalle(View view) {
        Intent intent = new Intent(kategori_makanan.this,pecal_lele.class);
        startActivity(intent);
    }

    public void pecalyam(View view) {
        Intent intent = new Intent(kategori_makanan.this,pecal_ayam.class);
        startActivity(intent);
    }
}