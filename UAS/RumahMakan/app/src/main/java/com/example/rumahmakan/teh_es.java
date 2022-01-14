package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class teh_es extends AppCompatActivity {
    int AngkaTambahteh = 0;
    TextView Textteh;
    int TotalHarga;
    int Hargateh = 5000;
    TextView HasilKaliteh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teh_es);
        Textteh = findViewById(R.id.Jumlah5);
        HasilKaliteh =findViewById(R.id.Totalteh);
    }

    public void Reset5(View view) {
        AngkaTambahteh = 0;
        Textteh.setText(Integer.toString(AngkaTambahteh));
    }

    public void Tambahteh(View view) {
        AngkaTambahteh = AngkaTambahteh+1;
        Textteh.setText(Integer.toString(AngkaTambahteh));
    }

    public void Jumlahteh(View view) {
        TotalHarga = AngkaTambahteh * Hargateh;
        HasilKaliteh.setText(Integer.toString(TotalHarga));
    }


    public void next6(View view) {
        Intent intent = new Intent(teh_es.this,End_rumah.class);
        startActivity(intent);
    }


    public void back8(View view) {
        Intent intent = new Intent(teh_es.this,kategori_minuman.class);
        startActivity(intent);
    }
}