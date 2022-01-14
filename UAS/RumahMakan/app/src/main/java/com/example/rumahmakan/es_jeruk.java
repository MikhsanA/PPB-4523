package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class es_jeruk  extends AppCompatActivity {
    int AngkaTambahjeruk = 0;
    TextView Textjeruk;
    int TotalHarga;
    int Hargajeruk = 8000;
    TextView HasilKalijeruk;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_es_jeruk);
        Textjeruk = findViewById(R.id.Jumlah8);
        HasilKalijeruk =findViewById(R.id.Totaljeruk);
        reference = FirebaseDatabase.getInstance().getReference().child("Esjeruk");
    }

    public void Reset8(View view) {
        AngkaTambahjeruk = 0;
        Textjeruk.setText(Integer.toString(AngkaTambahjeruk));
    }

    public void Tambahjeruk(View view) {
        AngkaTambahjeruk = AngkaTambahjeruk+1;
        Textjeruk.setText(Integer.toString(AngkaTambahjeruk));

    }

    public void Jumlahjeruk(View view) {
        TotalHarga = AngkaTambahjeruk* Hargajeruk;
        HasilKalijeruk.setText(Integer.toString(TotalHarga));
    }


    public void back11(View view) {
        Intent intent = new Intent(es_jeruk.this, kategori_minuman.class);
        startActivity(intent);

    }

    public void next9(View view) {
        Intent intent = new Intent(es_jeruk.this,End_rumah.class);
        startActivity(intent);
    }
}