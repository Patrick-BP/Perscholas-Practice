package com.perscholas.OMDbAPI.Repository;

import com.perscholas.OMDbAPI.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

   Optional<Movie> findMovieByImdbID(String imdbid);
}