package com.memelli.app.service;

import com.memelli.app.dto.MoveiMinDTO;
import com.memelli.app.dto.MovieDTO;
import com.memelli.app.model.Movie;
import com.memelli.app.projections.MovieMinProjection;
import com.memelli.app.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Transactional(readOnly = true)
    public MovieDTO findById(Long id) {
        Movie movie = movieRepository.findById(id).get(); //ta buscando year nulo
        return new MovieDTO(movie);
    }

    @Transactional(readOnly = true)
    public List<MoveiMinDTO> findAll() {
        List<Movie> movie = movieRepository.findAll();
        List<MoveiMinDTO> dto = movie.stream().map(x -> new MoveiMinDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<MoveiMinDTO> findByList(Long listId) {
        List<MovieMinProjection> movie = movieRepository.searchByList(listId);
        List<MoveiMinDTO> dto = movie.stream().map(x -> new MoveiMinDTO(x)).toList();
        return dto;
    }

}
