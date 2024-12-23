package com.memelli.app.controller;

import com.memelli.app.dto.MoveiMinDTO;
import com.memelli.app.dto.MovieListDTO;
import com.memelli.app.service.MovieListService;
import com.memelli.app.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class MovieListController {

    @Autowired
    private MovieListService movieListService;

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieListDTO> list() {
        List<MovieListDTO> list = movieListService.findAll();
        return list;
    }

    @GetMapping(value = "/{listId}/movies")
    public List<MoveiMinDTO> findByList(@PathVariable Long  listId) {
        List<MoveiMinDTO> list = movieService.findByList(listId);
        return list;
    }
}
