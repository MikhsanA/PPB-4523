package com.example.rumahmakan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {
    private EditText emailet,passwordet;
    private Button signinbutton;
    private TextView signuptv;
    private ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = firebaseAuth.getInstance();
        emailet = findViewById(R.id.usrname);
        passwordet = findViewById(R.id.pswrd);


        signinbutton = findViewById(R.id.lgin);
        progressDialog = new ProgressDialog(this);
        signuptv= findViewById(R.id.signin1);
        signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                masuk();
            }


        });
        signuptv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,signup.class);
                startActivity(intent);
                finish();

            }
        });
    }
    private void masuk(){
        String user=emailet.getText().toString();
        String Passwordd = passwordet.getText().toString();

        if(TextUtils.isEmpty(user)){
            emailet.setError("Enter your Username");
            return;
        }

        else if (TextUtils.isEmpty(Passwordd)){
            passwordet.setError("Enter your password");
        }
        progressDialog.setMessage("Tunggu Sebentar......");
        progressDialog.show();
        progressDialog.setCanceledOnTouchOutside(false);
        firebaseAuth.signInWithEmailAndPassword(user,Passwordd).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Login.this,"Berhasil Masuk",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Login.this,Kategori.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(Login.this,"Gagal Masuk",Toast.LENGTH_LONG).show();

                }
                progressDialog.dismiss();
            }
        });



    }


}




