package com.memelli.app.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private MovieList movieList;

    public BelongingPK(){

    }

    public BelongingPK(Movie movie, MovieList movieList){
        this.movie = movie;
        this.movieList = movieList;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public MovieList getMovieList() {
        return movieList;
    }
    public void setMovieList(MovieList movieList) {
        this.movieList = movieList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(movie, that.movie) && Objects.equals(movieList, that.movieList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, movieList);
    }
}
