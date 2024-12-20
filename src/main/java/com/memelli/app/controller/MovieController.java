package com.memelli.app.controller;

import com.memelli.app.dto.MoveiMinDTO;
import com.memelli.app.dto.MovieDTO;
import com.memelli.app.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(value = "/{id}")
    public MovieDTO findById(@PathVariable Long id) {
        MovieDTO movieDTO = movieService.findById(id);
        return movieDTO;
    }

    @GetMapping
    public List<MoveiMinDTO> findAll(){
        return movieService.findAll();
    }

}
