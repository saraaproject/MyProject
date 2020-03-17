package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Activity10 extends AppCompatActivity {
    private int score ;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    ImageView img ;

    private ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        btn1=(Button)findViewById(R.id.rectangle_2);
        btn2=(Button)findViewById(R.id.rectangle_3);
        btn3=(Button)findViewById(R.id.rectangle_4);
        btn4=(Button)findViewById(R.id.rectangle_5);
        btn5=(Button)findViewById(R.id.rectangle_6);

        img=(ImageView)findViewById(R.id.imageView);
        img.setImageResource(R.drawable.appelrouge);


        progressBar = (ProgressBar) findViewById(R.id.progressBar1);

        Intent intent =getIntent();
        score = intent.getIntExtra("score",0);

        progressBar.setProgress(score*10);

    }
    public void buClick(View view) {
        final MediaPlayer mpclick = MediaPlayer.create(this,R.raw.click);
        final MediaPlayer mpFail = MediaPlayer.create(this,R.raw.fail);
        final MediaPlayer mpCorrect = MediaPlayer.create(this,R.raw.correct);
        Button buSeclect = (Button) view;


        switch (buSeclect.getId()){

            case R.id.rectangle_2 : btn1.setBackgroundColor(Color.RED);mpFail.start(); if(score >0){score--;}
                if(progressBar.getProgress()>0){progressBar.setProgress(progressBar.getProgress()-10);}
                progressBar.setBackgroundColor(Color.RED);
                btn2.setBackgroundColor(Color.GREEN);btn1.setClickable(false);btn2.setClickable(false);
                btn3.setClickable(false);btn4.setClickable(false); break;

            case R.id.rectangle_3 : btn2.setBackgroundColor(Color.GREEN); mpCorrect.start(); score++;
                btn1.setClickable(false);btn2.setClickable(false);btn3.setClickable(false);
                if(progressBar.getProgress()<100){progressBar.setProgress(progressBar.getProgress()+10);}
                btn4.setClickable(false);  break;

            case R.id.rectangle_4 : btn3.setBackgroundColor(Color.RED);mpFail.start();if(score >0){score--;}
                btn2.setBackgroundColor(Color.GREEN); btn1.setClickable(false);btn2.setClickable(false);
                if(progressBar.getProgress()>0){progressBar.setProgress(progressBar.getProgress()-10);}
                progressBar.setBackgroundColor(Color.RED);
                btn3.setClickable(false);btn4.setClickable(false); break;

            case R.id.rectangle_5 : btn4.setBackgroundColor(Color.RED);mpFail.start();if(score >0){score--;}
                btn2.setBackgroundColor(Color.GREEN); btn1.setClickable(false);btn2.setClickable(false);
                if(progressBar.getProgress()>0){progressBar.setProgress(progressBar.getProgress()-10);}
                progressBar.setBackgroundColor(Color.RED);
                btn3.setClickable(false);btn4.setClickable(false);break;


            case R.id.rectangle_6 :mpclick.start();
                Intent intent = new Intent(this,Activity11.class );
                intent.putExtra("score",score);
                startActivity(intent);
                break;





        }
    }
}
