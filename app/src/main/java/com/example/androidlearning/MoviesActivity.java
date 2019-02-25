package com.example.androidlearning;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MoviesActivity extends AppCompatActivity {

    public static void openActivity(Context context) {
        Intent intent = new Intent(context, MoviesActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        RecyclerView recyclerView = findViewById(R.id.movies_recycler_view);

        MovieAdapter movieAdapter = new MovieAdapter();
        recyclerView.setAdapter(movieAdapter);
        movieAdapter.setMovies(getMovies());
    }

    private List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("one"));
        movies.add(new Movie("one1"));
        movies.add(new Movie("one2"));
        movies.add(new Movie("one3"));
        movies.add(new Movie("one4"));
        movies.add(new Movie("one5"));
        movies.add(new Movie("one6"));
        movies.addAll(movies);
        movies.addAll(movies);
        return movies;
    }
}