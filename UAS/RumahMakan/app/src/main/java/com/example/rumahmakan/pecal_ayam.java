package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pecal_ayam extends AppCompatActivity {
    int AngkaTambahayam = 0;
    TextView Textayam;
    int TotalHarga;
    int HargaPecal = 25000;
    TextView HasilKalilayam;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pecal_ayam);
        Textayam = findViewById(R.id.Jumlah1);
        HasilKalilayam =findViewById(R.id.Totalayam);

    }

    public void back4(View view) {
        Intent intent = new Intent(pecal_ayam.this,kategori_makanan.class);
        startActivity(intent);
    }

    public void next2(View view) {
        Intent intent = new Intent(pecal_ayam.this,End_rumah.class);
        startActivity(intent);

    }

    public void Jumlahayam(View view) {
        TotalHarga = AngkaTambahayam * HargaPecal;
        HasilKalilayam.setText(Integer.toString(TotalHarga));
    }

    public void Tambahayam(View view) {
        AngkaTambahayam = AngkaTambahayam+1;
        Textayam.setText(Integer.toString(AngkaTambahayam));
    }

    public void Reset1(View view) {
        AngkaTambahayam = 0;
        Textayam.setText(Integer.toString(AngkaTambahayam));
    }
}