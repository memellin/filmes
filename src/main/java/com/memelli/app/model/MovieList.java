package com.memelli.app.model;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.Objects;

@Entity
@Table(name = "tb_movie_list")
public class MovieList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    public MovieList() {
    }

    public MovieList(Long id, String title) {
        this.id = id;
        this.title = title;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MovieList movieList = (MovieList) o;
        return Objects.equals(id, movieList.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
