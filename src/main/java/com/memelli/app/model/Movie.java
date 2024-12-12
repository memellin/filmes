package com.memelli.app.model;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
@Table(name = "tb_movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
 //   @Column(name = "movie_year")  year é palavra reservada do banco de dados
    private Integer movieYear;
    private String filmMaker;
    private String genre;
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Movie() {

    }

    public Movie(Long id, String title,Integer movieYear, String filmMaker, String genre, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.movieYear = movieYear;
        this.filmMaker = filmMaker;
        this.genre = genre;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
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

    public Integer getYear() {
        return movieYear;
    }

    public void setYear(Integer movieYear) {
        this.movieYear = movieYear;
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

    public String getlongDescription() {
        return longDescription;
    }

    public void setlongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
