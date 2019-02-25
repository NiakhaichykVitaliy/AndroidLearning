package com.example.androidlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button algorithmicsActivityButton;
    private Button movieActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieActivityButton = findViewById(R.id.movie_activity_button);
        movieActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMoviesActivity();
            }
        });

        algorithmicsActivityButton = findViewById(R.id.algorithmics_activity_button);
        algorithmicsActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlgorithmicsActivity();
            }
        });
    }

    public void openMoviesActivity() {
        MoviesActivity.openActivity(this);
    }

    public void openAlgorithmicsActivity() {
        AlgorithmicsActivity.openActivity(this);
    }
}