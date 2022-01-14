package com.example.rumahmakan;

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

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


import java.util.regex.Pattern;

import kotlin.contracts.Returns;

public class signup extends AppCompatActivity  {
    private EditText useret,passwordet1,passwordet2;
    private Button signupbutton;
    private TextView signintv;
    private ProgressDialog progressDialog;
    FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        firebaseAuth = firebaseAuth.getInstance();
        useret = findViewById(R.id.usrname);
        passwordet1 = findViewById(R.id.pswrd2);
        passwordet2 = findViewById(R.id.pswrd3);
        signupbutton = findViewById(R.id.register);
        progressDialog = new ProgressDialog(this);
        signintv = findViewById(R.id.backsign);
        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Register();
            }


        });
        signintv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup.this,Login.class);
                startActivity(intent);
                finish();

            }
        });
    }
    private void Register(){
        String user=useret.getText().toString();
        String Passwordd1 = passwordet1.getText().toString();
        String Passwordd2 = passwordet2.getText().toString();
        if(TextUtils.isEmpty(user)){
            useret.setError("Enter your Username");
            return;
        }
        else if (TextUtils.isEmpty(Passwordd1)){
            passwordet1.setError("Enter your password");
            return;
        }
        else if (!Passwordd1.equals(Passwordd2)){
            passwordet2.setError(" password berbeda");
            return;
        }
        else if (Passwordd1.length()<4){
            passwordet1.setError("Password harus leih dari 4 kata");
        }
        else if (!isVallidUser(user)){
            useret.setError("Username Salah");
        }
        progressDialog.setMessage("Tunggu Sebentar......");
        progressDialog.show();
        progressDialog.setCanceledOnTouchOutside(false);
        firebaseAuth.createUserWithEmailAndPassword(user,Passwordd1).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(signup.this,"Berhasil Registrasi",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(signup.this,Login.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(signup.this,"Gagal Registrasi",Toast.LENGTH_LONG).show();

                }
                progressDialog.dismiss();
            }
        });



    }
    private Boolean isVallidUser(CharSequence target){
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

}
