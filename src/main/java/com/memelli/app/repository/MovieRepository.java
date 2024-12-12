package com.memelli.app.repository;

import com.memelli.app.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    // Métodos adicionais, se necessário
}
