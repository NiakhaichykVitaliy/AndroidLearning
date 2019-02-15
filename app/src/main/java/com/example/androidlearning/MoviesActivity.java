package com.example.androidlearning;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);


        RecyclerView recyclerView = findViewById(R.id.rvMovies);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        MovieAdapter movieAdapter = new MovieAdapter();
        recyclerView.setAdapter(movieAdapter);

        List<String> movieList = new ArrayList<>();
        movieList.add("one");
        movieList.add("1");
        movieList.add("two");
        movieList.add("2");
        movieList.add("three");
        movieList.add("3");
        movieList.add("meduza");
        movieList.add("meduza meduza");
        movieList.add("meduZAAAAAA");
        movieList.add("meduza");
        movieList.add("meduza");

        List<String> scrollMovieList = new ArrayList<>();
        scrollMovieList.addAll(movieList);
        scrollMovieList.addAll(movieList);

        movieAdapter.setmItems(scrollMovieList);
    }
}