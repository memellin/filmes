package com.memelli.app.dto;

import com.memelli.app.model.MovieList;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
