package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText angk1,angk2;
    TextView hasilnya;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angk1=(EditText) findViewById(R.id.angka1);
        angk2=(EditText) findViewById(R.id.angka2);
        hasilnya=(TextView) findViewById(R.id.hasilhitun);
    }

    public void hitung(View view) {
        int a1=Integer.parseInt(angk1.getText().toString());
        int a2=Integer.parseInt(angk2.getText().toString());
        Integer hasil=a1+a2;
        hasilnya.setText(hasil.toString());
    }
    public void kurang(View view) {
        int a1=Integer.parseInt(angk1.getText().toString());
        int a2=Integer.parseInt(angk2.getText().toString());
        Integer hasil=a1-a2;
        hasilnya.setText(hasil.toString());
<<<<<<< HEAD

    }
    public  void Bagi(View view){
        int a1=Integer.parseInt(angk1.getText().toString());
        int a2=Integer.parseInt(angk2.getText().toString());
        Integer hasil=a1/a2;
        hasilnya.setText(hasil.toString());
    }
}
=======
    }
}
>>>>>>> a5a90cc518e405ec27efba0c7af9fdba299338b8
