package com.memelli.app.projections;

public interface MovieMinProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    String getFilmMaker();
    Integer getPosition();
}
