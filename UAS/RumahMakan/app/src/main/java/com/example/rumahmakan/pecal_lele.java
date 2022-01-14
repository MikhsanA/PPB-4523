package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class pecal_lele extends AppCompatActivity {
    int AngkaTambahalele = 0;
    TextView Textlele;
    int TotalHarga;
    int Hargalele = 25000;
    TextView HasilKalilele;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pecal_lele);
        Textlele = findViewById(R.id.Jumlah2);
        HasilKalilele =findViewById(R.id.Totallele);

    }


    public void back5(View view) {
        Intent intent = new Intent(pecal_lele.this,kategori_makanan.class);
        startActivity(intent);
    }

    public void next3(View view) {
        Intent intent = new Intent(pecal_lele.this,End_rumah.class);
        startActivity(intent);

    }

    public void Jumlahlele(View view) {
        TotalHarga = AngkaTambahalele * Hargalele;
        HasilKalilele.setText(Integer.toString(TotalHarga));
    }

    public void Tambahlele(View view) {
        AngkaTambahalele = AngkaTambahalele+1;
        Textlele.setText(Integer.toString(AngkaTambahalele));
    }

    public void Reset2(View view) {
        AngkaTambahalele = 0;
        Textlele.setText(Integer.toString(AngkaTambahalele));
    }
}