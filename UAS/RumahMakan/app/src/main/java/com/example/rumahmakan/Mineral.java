package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Mineral extends AppCompatActivity {
    int AngkaTambahair = 0;
    TextView Textair;
    int TotalHarga;
    int Hargaair = 5000;
    TextView HasilKaliair;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mineral);

        Textair = findViewById(R.id.Jumlah6);
        HasilKaliair =findViewById(R.id.Totalair);
        myRef.setValue("Hello, World!");
    }

    public void Reset6(View view) {
        AngkaTambahair = 0;
        Textair.setText(Integer.toString(AngkaTambahair));
    }

    public void Jumlahair(View view) {
        TotalHarga = AngkaTambahair * Hargaair;
        HasilKaliair.setText(Integer.toString(TotalHarga));

    }

    public void Tambahair(View view) {
        AngkaTambahair = AngkaTambahair+1;
        Textair.setText(Integer.toString(AngkaTambahair));
    }

    public void back9(View view) {
    }

    public void next7(View view) {
    }
}