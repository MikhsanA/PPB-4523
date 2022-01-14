package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class soto_ayam extends AppCompatActivity {
    int AngkaTambahsoto = 0;
    TextView Textsoto;
    int TotalHarga;
    int Hargasoto = 20000;
    TextView HasilKalisoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soto_ayam);
        Textsoto = findViewById(R.id.Jumlah3);
        HasilKalisoto =findViewById(R.id.Totalsoto);
    }

    public void Reset3(View view) {
        AngkaTambahsoto = 0;
        Textsoto.setText(Integer.toString(AngkaTambahsoto));
    }

    public void Tambahsoto(View view) {
        AngkaTambahsoto = AngkaTambahsoto+1;
        Textsoto.setText(Integer.toString(AngkaTambahsoto));
    }

    public void Jumlahsoto(View view) {
        TotalHarga = AngkaTambahsoto * Hargasoto;
        HasilKalisoto.setText(Integer.toString(TotalHarga));
    }

    public void back6(View view) {
        Intent intent = new Intent(soto_ayam.this,kategori_makanan.class);
        startActivity(intent);

    }

    public void next4(View view) {
        Intent intent = new Intent(soto_ayam.this,End_rumah.class);
        startActivity(intent);
    }
}