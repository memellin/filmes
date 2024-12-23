package com.memelli.app.dto;

import com.memelli.app.model.Movie;
import com.memelli.app.projections.MovieMinProjection;

public class MoveiMinDTO {

    private Long id;
    private String title;
    private Integer movieYear;
    private String filmMaker;
    private String imgUrl;
    private String shortDescription;

    public MoveiMinDTO(){

    }

    public MoveiMinDTO(Movie movie) {
        id = movie.getId();
        title = movie.getTitle();
        movieYear = movie.getYear();
        filmMaker = movie.getFilmMaker();
        imgUrl = movie.getImgUrl();
        shortDescription = movie.getShortDescription();
    }

    public MoveiMinDTO(MovieMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        movieYear = projection.getYear();
        filmMaker = projection.getFilmMaker();
        imgUrl = projection.getImgUrl();
        shortDescription = projection.getShortDescription();
    }


    public Long getId() {
        return id;
    }



    public String getTitle() {
        return title;
    }


    public Integer getMovieYear() {
        return movieYear;
    }


    public String getFilmMaker() {
        return filmMaker;
    }


    public String getImgUrl() {
        return imgUrl;
    }



    public String getShortDescription() {
        return shortDescription;
    }

}
