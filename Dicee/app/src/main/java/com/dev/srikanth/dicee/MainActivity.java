package com.dev.srikanth.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
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
        //Button button;
        Button button=(Button)findViewById(R.id.button);

        final ImageView leftDice=(ImageView)findViewById(R.id.image_leftdice);

        final ImageView rightDice=(ImageView)findViewById(R.id.image_rightdice);
        final int[] diceArray={R.mipmap.dice1,
                R.mipmap.dice2,
                R.mipmap.dice3,
                R.mipmap.dice4,
                R.mipmap.dice5,
                R.mipmap.dice6};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "The button has been pressed!");
                Random randomNumberGenerator=new Random();
                int number = randomNumberGenerator.nextInt(6);
                Log.d("Dicee", "The random number is "+number);
                leftDice.setImageResource(diceArray[number]);
                number = randomNumberGenerator.nextInt(6);
                Log.d("Dicee", "The random number is "+number);
                rightDice.setImageResource(diceArray[number]);
            }
        });

    }
}
