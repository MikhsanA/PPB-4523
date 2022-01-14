package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class es_kelapa extends AppCompatActivity {
    int AngkaTambahkelapa = 0;
    TextView Textkelapa;
    int TotalHarga;
    int Hargakelapa = 8000;
    TextView HasilKalikelapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_es_kelapa);
        Textkelapa = findViewById(R.id.Jumlah7);
        HasilKalikelapa =findViewById(R.id.Totalkelapa);

    }

    public void Reset7(View view) {
        AngkaTambahkelapa = 0;
        Textkelapa.setText(Integer.toString(AngkaTambahkelapa));
    }

    public void Tambahkelapa(View view) {
        AngkaTambahkelapa = AngkaTambahkelapa+1;
        HasilKalikelapa.setText(Integer.toString(TotalHarga));
    }

    public void Jumlahkelapa(View view) {
        TotalHarga = AngkaTambahkelapa * Hargakelapa;
        HasilKalikelapa.setText(Integer.toString(TotalHarga));
    }

    public void back10(View view) {
        Intent intent = new Intent(es_kelapa.this,kategori_minuman.class);
        startActivity(intent);
    }

    public void next8(View view) {
        Intent intent = new Intent(es_kelapa.this,End_rumah.class);
        startActivity(intent);
    }
}