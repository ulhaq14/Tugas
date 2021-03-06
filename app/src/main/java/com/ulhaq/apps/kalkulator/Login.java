package com.ulhaq.apps.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText txtuser;
    EditText txtpassword;
    Button btnlogin;

    SharedPreferences pref;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtuser = findViewById(R.id.txtemail);
        txtpassword = findViewById(R.id.txtpassword);
        btnlogin = findViewById(R.id.btnlogin);
        pref = getSharedPreferences("login", MODE_PRIVATE);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtuser.getText().toString().equalsIgnoreCase("haq@gmail.com") ||
                txtpassword.getText().toString().equalsIgnoreCase("111")){
                    Toast.makeText(Login.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(Login.this, Kalkulatorr.class);
                    in.putExtra("username", txtuser.getText().toString());
                    startActivity(in);

                    editor = pref.edit();
                    editor.putString("userid", txtuser.getText().toString());
                    editor.apply();
                    finish();
                }else{
                    Toast.makeText(Login.this, "Email atau Password anda salah!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}