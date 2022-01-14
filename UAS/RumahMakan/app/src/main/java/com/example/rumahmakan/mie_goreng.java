package com.example.rumahmakan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class mie_goreng extends AppCompatActivity {
    int AngkaTambahmie = 0;
    TextView Textmie;
    int TotalHarga;
    int Hargamie = 20000;
    TextView HasilKalimie;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mie_goreng);
        Textmie = findViewById(R.id.Jumlah4);
        HasilKalimie =findViewById(R.id.Totalmie);
        myRef.setValue(Hargamie,TotalHarga);

    }

    public void Reset4(View view) {
        AngkaTambahmie = 0;
        Textmie.setText(Integer.toString(AngkaTambahmie));
    }

    public void Tambahmie(View view) {
        AngkaTambahmie = AngkaTambahmie+1;
        Textmie.setText(Integer.toString(AngkaTambahmie));

    }

    public void Jumlahmie(View view) {
        TotalHarga = AngkaTambahmie * Hargamie;
        HasilKalimie.setText(Integer.toString(TotalHarga));
    }

    public void back7(View view) {
        Intent intent = new Intent(mie_goreng.this,kategori_makanan.class);
        startActivity(intent);
    }

    public void next5(View view) {
        Intent intent = new Intent(mie_goreng.this,End_rumah.class);
        startActivity(intent);
    }
}