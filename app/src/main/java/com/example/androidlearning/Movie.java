package com.example.androidlearning;

class Movie {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Movie(String name) {
        this.name = name;
    }
}