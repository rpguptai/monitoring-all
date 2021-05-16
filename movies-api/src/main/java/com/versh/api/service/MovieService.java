package com.versh.api.service;

import java.util.List;

import com.versh.api.model.Movie;

public interface MovieService {

    Movie validateAndGetMovie(String imdb);

    List<Movie> getMovies();

    Movie createMovie(Movie movie);

    void deleteMovie(Movie movie);

}
