package com.example.androidlearning;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private List<Movie> movies = new ArrayList<>();

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        holder.bind(movies.get(position));
    }

    @Override
    public int getItemCount() {
       return movies == null ? 0 : movies.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {

        private TextView movieTitleTextView;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            movieTitleTextView = itemView.findViewById(R.id.movie_title_view);
        }

        public void bind(Movie text) {
            movieTitleTextView.setText(text.getName());
        }
    }
}