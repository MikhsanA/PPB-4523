package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView angkakounter;
    int angka=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkakounter=findViewById(R.id.kounter);

    }

    public void toastklik(View view) {
        Toast.makeText(  this,"ini adalah toast", Toast.LENGTH_SHORT).show();
    }

    public void countklik(View view) {
        angka=angka+1;
        angkakounter.setText(Integer.toString(angka));
    }
}