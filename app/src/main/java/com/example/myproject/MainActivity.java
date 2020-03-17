package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
 private MediaPlayer mpstart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mpstart= MediaPlayer.create(this,R.raw.start);
        mpstart.start();


    }

    public void buClick(View view) {
        mpstart.stop();


           Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);





        }
    }




