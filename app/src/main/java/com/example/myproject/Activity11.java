package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity11 extends AppCompatActivity {

    TextView txt2;
    TextView txt3;
    TextView txt4;
    private int score ;
   private MediaPlayer win,loser,click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11);
         win = MediaPlayer.create(this,R.raw.win);
       loser = MediaPlayer.create(this,R.raw.loser);
        click= MediaPlayer.create(this,R.raw.click);
        txt2= (TextView)findViewById(R.id.textView2);
        txt3= (TextView)findViewById(R.id.textView3);
        txt4= (TextView)findViewById(R.id.textView4);

        Intent intent =getIntent();
        score = intent.getIntExtra("score",0);


        if(score < 5){
            txt4.setText("دون المتوسط");
            loser.start();
        }else
        if(score == 5){
            txt4.setText("متوسط");
            loser.start();
        }else
        if(score > 5 && score <=7){
            txt4.setText("جيد");
            win.start();
        }else
        if(score == 8 || score == 9){
            txt4.setText("جيد جدا");
            win.start();
        }else
        if(score == 10){
            txt4.setText("ممتاز أحسنت");
            win.start();
        }

        txt2.setText(txt2.getText()+" "+score);
        txt3.setText(txt3.getText()+" "+(10-score));
    }
    public void buClick(View view) {
        loser.stop();
        win.stop();
       click.start();
        Intent intent = new Intent(this,Main2Activity.class );
        startActivity(intent);


    }
}