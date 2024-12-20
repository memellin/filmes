package com.memelli.app.dto;

import com.memelli.app.model.Movie;
import org.springframework.beans.BeanUtils;

public class MovieDTO {

    private Long id;
    private String title;
    private Integer movieYear;
    private String filmMaker;
    private String genre;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public MovieDTO() {

    }

    public MovieDTO(Movie movie) {
        BeanUtils.copyProperties(movie, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(Integer movieYear) {
        this.movieYear = movieYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFilmMaker() {
        return filmMaker;
    }

    public void setFilmMaker(String filmMaker) {
        this.filmMaker = filmMaker;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
