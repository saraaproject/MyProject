package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Activity2_3 extends AppCompatActivity {
    ImageView img ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_3);
        img=(ImageView)findViewById(R.id.imageView);
        img.setImageResource(R.drawable.fil);
    }
}
