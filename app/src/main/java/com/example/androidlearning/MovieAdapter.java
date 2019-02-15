package com.example.androidlearning;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter {

    private List<String> mItems = new ArrayList<>();

    public void setmItems(List<String> items) {
        mItems = items;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0)
            return MovieViewHolder.inflete(parent);
        else
            return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MovieViewHolder) {
            ((MovieViewHolder) holder).bind(mItems.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }


    public static class MovieViewHolder extends RecyclerView.ViewHolder {

        private TextView movieView;

        public static MovieViewHolder inflete(ViewGroup parent) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_row, parent, false);
            return new MovieViewHolder(view);
        }

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            movieView = itemView.findViewById(R.id.tvMovieName);
        }

        public void bind(String text) {
            movieView.setText(text);
        }
    }
}