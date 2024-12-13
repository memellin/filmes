package com.memelli.app.service;

import com.memelli.app.dto.MoveiMinDTO;
import com.memelli.app.model.Movie;
import com.memelli.app.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<MoveiMinDTO> findAll() {
        List<Movie> movie = movieRepository.findAll();
        List<MoveiMinDTO> dto = movie.stream().map(x -> new MoveiMinDTO(x)).toList();
        return dto;
    }

}
