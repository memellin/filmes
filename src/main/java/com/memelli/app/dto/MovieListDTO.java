package com.memelli.app.dto;

import com.memelli.app.model.MovieList;


public class MovieListDTO {
    private Long id;
    private String title;

    public MovieListDTO() {

    }
    public MovieListDTO(MovieList movieList) {
        this.id = movieList.getId();
        this.title = movieList.getTitle();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
