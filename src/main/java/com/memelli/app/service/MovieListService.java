package com.memelli.app.service;

import com.memelli.app.dto.MovieListDTO;
import com.memelli.app.model.MovieList;
import com.memelli.app.repository.MovieListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieListService {
    @Autowired
    private MovieListRepository movieRepository;


    @Transactional(readOnly = true)
    public List<MovieListDTO> findAll() {
        List<MovieList> movie = movieRepository.findAll();
        List<MovieListDTO> dto = movie.stream().map(x -> new MovieListDTO(x)).toList();
        return dto;
    }
}