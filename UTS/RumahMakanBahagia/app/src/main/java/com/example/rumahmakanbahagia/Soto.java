package com.example.rumahmakanbahagia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Soto extends AppCompatActivity {
    int Tambah = 0;
    TextView TextJumlah;
    int Harga = 12000;
    TextView TextHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soto);
        TextJumlah = findViewById(R.id.Jumlah);
        TextHarga = findViewById(R.id.Harga);
    }

    public void reset(View view) {
        Tambah = 0;
        TextJumlah.setText(Integer.toString(Tambah));
    }

    public void jumlah(View view) {
        Tambah = Tambah+1;
        TextJumlah.setText(Integer.toString(Tambah));
    }

    public void Total(View view) {
        Harga = Harga*Tambah;
        TextHarga.setText(Integer.toString(Harga));
    }

    public void next2(View view) {
        startActivity(new Intent(Soto.this,MainActivity.class));
        Toast.makeText(  this,"Pesanan sedang di proses", Toast.LENGTH_SHORT).show();
    }
}
