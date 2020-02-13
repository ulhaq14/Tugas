package com.ulhaq.apps.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread background = new Thread() {
          public void run(){
              try {
                  sleep(3*1000);
                  Intent i = new Intent(getBaseContext(), ControlClass.class);
                  startActivity(i);
              }catch (Exception e){
                  Toast.makeText(SplashScreen.this, "Ada yang salah!", Toast.LENGTH_SHORT).show();
              }
          }
        };

        background.start();

    }
}

