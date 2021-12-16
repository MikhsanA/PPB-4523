package com.example.tugas8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayDeque;

public class MainActivity extends AppCompatActivity {
    EditText nimsiswa,namasiswa;
    Button tbsave,tbview;
    DatabaseReference reference;
    Mahasiswa mahasiswa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nimsiswa=findViewById(R.id.nimmhs);
        namasiswa=findViewById(R.id.nmmhs);
        tbsave = findViewById(R.id.tblSave);
        tbview=findViewById(R.id.tblView);
        mahasiswa = new Mahasiswa();

        reference= FirebaseDatabase.getInstance().getReference().child("Siswa");

        tbsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mahasiswa.setNim(nimsiswa.getText().toString().trim());
                mahasiswa.setNama(namasiswa.getText().toString().trim());
                ArrayDeque<Object> refrence;
                reference.push().setValue(mahasiswa);
                Toast.makeText(MainActivity.this, "Data Tersimpan", Toast.LENGTH_LONG).show();
            }
        });

        tbview.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TampilSemuaData.class);
                startActivity(intent);
            }
        }));
    }
}