package com.ulhaq.apps.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulatorr extends AppCompatActivity implements View.OnClickListener {

    EditText angka1;
    EditText angka2;
    String user;
    double number1, number2;
    String angkake1, angkake2;
    Button buttonke1;
    Button buttonke2;
    Button buttonke3;
    Button buttonke4;
    TextView untukhasil;
    TextView tvuser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link all
        angka1 = findViewById(R.id.inputangkake1);
        angka2 = findViewById(R.id.inputangkake2);
        buttonke1 = findViewById(R.id.buttonke1);
        buttonke2 = findViewById(R.id.buttonke2);
        buttonke3 = findViewById(R.id.buttonke3);
        buttonke4 = findViewById(R.id.buttonke4);
        untukhasil = findViewById(R.id.untukhasil);
        tvuser = findViewById(R.id.tvuser);
        buttonke1.setOnClickListener(this);
        buttonke2.setOnClickListener(this);
        buttonke3.setOnClickListener(this);
        buttonke4.setOnClickListener(this);


        String username;
        Bundle extras = getIntent().getExtras();
        if (extras == null){
            username = "Kosong";
        }else{
            username = extras.getString("username");
        }
        tvuser.setText("User : "+username);
    }

    @Override
    public void onClick(View v){





        try {
            switch (v.getId()){
                case R.id.buttonke1:
                    angkake1=angka1.getText().toString();
                    angkake2=angka2.getText().toString();
                    number1=Integer.parseInt(angkake1);
                    number2=Integer.parseInt(angkake2);
                    untukhasil.setText("Hasil = "+(number1+number2));
                    break;
                case R.id.buttonke2:
                    angkake1=angka1.getText().toString();
                    angkake2=angka2.getText().toString();
                    number1=Integer.parseInt(angkake1);
                    number2=Integer.parseInt(angkake2);
                    untukhasil.setText("Hasil = "+(number1-number2));
                    break;

                case R.id.buttonke3:
                    angkake1=angka1.getText().toString();
                    angkake2=angka2.getText().toString();
                    number1=Integer.parseInt(angkake1);
                    number2=Integer.parseInt(angkake2);
                    untukhasil.setText("Hasil = "+(number1*number2));
                    break;

                case R.id.buttonke4:
                    angkake1=angka1.getText().toString();
                    angkake2=angka2.getText().toString();
                    number1=Integer.parseInt(angkake1);
                    number2=Integer.parseInt(angkake2);
                    untukhasil.setText("Hasil = "+(number1/number2));
                    break;
            }
        }catch (Exception e){
            Toast.makeText(this, "Angka tidak boleh kosong!!", Toast.LENGTH_SHORT).show();
        }

    }
}