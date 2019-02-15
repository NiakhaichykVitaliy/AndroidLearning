package com.example.androidlearning;

import android.content.Intent;
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

        movieActivityButton = findViewById(R.id.movieActivityButton);
        movieActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMoviesActivity();
            }
        });

        algorithmicsActivityButton = findViewById(R.id.algorithmicsActivityButton);
        algorithmicsActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlgorithmicsActivity();
            }
        });
    }

    public void openMoviesActivity() {
        Intent intent = new Intent(this, MoviesActivity.class);
        startActivity(intent);
    }

    public void openAlgorithmicsActivity() {
        Intent intent = new Intent(this, AlgorithmicsActivity.class);
        startActivity(intent);
    }
}