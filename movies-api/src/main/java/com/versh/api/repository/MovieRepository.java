package com.versh.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.versh.api.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, String> {
}
