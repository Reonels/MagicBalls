package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askButton    = (Button) findViewById(R.id.askButton);
        final ImageView magicBall = (ImageView) findViewById(R.id.imageMagicBall);
        final int [] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("Magic Balls","Yes You Click That Button !");

                Random randomBalls = new Random();
                int pic = randomBalls.nextInt(5);
                Log.d("Magic Balls","The Number You Pick Is : " + pic);

                magicBall.setImageResource(ballArray[pic]);
            }

        });

    }
}
