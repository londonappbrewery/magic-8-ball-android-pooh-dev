package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final List<Integer> BALLS = Arrays.asList(
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5);
    private static final int BALLS_QUANTITY = BALLS.size();
    private static final Random RANDOM_NUMBER_GENERATOR = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askButton = findViewById(R.id.askButton);
        final ImageView imageBall = findViewById(R.id.imageBall);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageBall.setImageResource(BALLS.get(getRandomBallNumber()));
            }
        });
    }

    private int getRandomBallNumber() {
        return RANDOM_NUMBER_GENERATOR.nextInt(BALLS_QUANTITY);
    }
}
