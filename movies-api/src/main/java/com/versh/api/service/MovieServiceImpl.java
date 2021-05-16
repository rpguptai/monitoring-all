package com.versh.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.versh.api.exception.MovieNotFoundException;
import com.versh.api.model.Movie;
import com.versh.api.repository.MovieRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie validateAndGetMovie(String imdb) {
        return movieRepository.findById(imdb).orElseThrow(() -> new MovieNotFoundException(imdb));
    }

    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(Movie movie) {
        movieRepository.delete(movie);
    }

}
