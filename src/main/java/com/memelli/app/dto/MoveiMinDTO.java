package com.memelli.app.dto;

import com.memelli.app.model.Movie;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(Integer movieYear) {
        this.movieYear = movieYear;
    }

    public String getFilmMaker() {
        return filmMaker;
    }

    public void setFilmMaker(String filmMaker) {
        this.filmMaker = filmMaker;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
}