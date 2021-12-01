package com.example.tugas6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Update_data extends AppCompatActivity {
    EditText idne;
    EditText edbuah, nama_buah, kodehasil;
    private String nama,noid;
    Button saveEd, viewlis;
    DBhelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data);

        db= new DBhelper(this);

        idne=(EditText) findViewById(R.id.nobuah);
        edbuah=(EditText) findViewById(R.id.editbuah);
        nama_buah=findViewById(R.id.hasiledit);
        kodehasil=findViewById(R.id.kodehasil);

        Bundle extras = getIntent().getExtras();

        idne.setText(extras.getString("data1"));
        edbuah.setText(extras.getString("data2"));

        saveEd=(Button) findViewById(R.id.tblsave);
        viewlis=(Button) findViewById(R.id.tblview);

        viewlis.setOnClickListener((v)->{
            Intent intent=new Intent(Update_data.this,MainActivity.class);
            startActivity(intent);
        });

        saveEd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kodehasil.setText(idne.getText().toString());
                nama_buah.setText(edbuah.getText().toString());

                boolean hasile=db.updateData(edbuah.getText().toString(),idne.getText().toString());
                if (hasile==true){
                    Toast.makeText(Update_data.this, "Update Success", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(Update_data.this, "Update Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}