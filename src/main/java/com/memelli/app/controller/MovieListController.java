package com.memelli.app.controller;

import com.memelli.app.dto.MovieListDTO;
import com.memelli.app.model.MovieList;
import com.memelli.app.service.MovieListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class MovieListController {

    @Autowired
    private MovieListService movieListService;

    @GetMapping
    public List<MovieListDTO> list() {
        List<MovieListDTO> list = movieListService.findAll();
        return list;
    }
}
