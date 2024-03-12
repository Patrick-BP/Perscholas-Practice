package com.perscholas.OMDbAPI.controller;

import com.perscholas.OMDbAPI.DTO.SaveMovieDTO;
import com.perscholas.OMDbAPI.Response.OmdbApiResponse;
import com.perscholas.OMDbAPI.Response.OmdbMovie;
import com.perscholas.OMDbAPI.Response.OmdbMovieDetails;
import com.perscholas.OMDbAPI.exceptions.ResourceNotFoundException;
import com.perscholas.OMDbAPI.model.Movie;
import com.perscholas.OMDbAPI.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movie")
    public List<OmdbMovie> getMovie(@RequestParam String title , String year) {

        return movieService.getMovies(title , year);
    }
    @GetMapping("/moviedetails")
    public OmdbMovieDetails getMovieDetails(@RequestParam String title ) {

        return movieService.getMovieDetails(title);
    }


    @PostMapping("/movie/add")
    public void saveToDB(@RequestBody SaveMovieDTO movie){
        System.out.println(movie.getImdbID());
        Optional<Movie> findMovie = movieService.getMovie(movie.getImdbID());
        if(findMovie.isPresent()){

        }else{
            movieService.saveMovie(movie);
        }

    }

    @DeleteMapping("/movie/del/{id}")
    public void deleteMovie(@PathVariable Long id){
        movieService.deleteMovie(id);
    }

    @GetMapping("/movie/all")
    public List<Movie> getmovies(){
        return movieService.getAllMovies();
    }
    @GetMapping("/movie/{imdbid}")
    public Optional<Movie> getmovie(@PathVariable String imdbid){
        return movieService.getMovie(imdbid);
    }
}
