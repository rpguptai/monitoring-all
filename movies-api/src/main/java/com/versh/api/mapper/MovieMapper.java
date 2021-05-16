package com.versh.api.mapper;

import org.mapstruct.Mapper;

import com.versh.api.model.Movie;
import com.versh.api.rest.dto.CreateMovieDto;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    Movie toMovie(CreateMovieDto createMovieDto);

}
