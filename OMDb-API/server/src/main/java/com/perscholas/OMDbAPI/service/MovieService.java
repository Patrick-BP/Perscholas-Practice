package com.perscholas.OMDbAPI.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.perscholas.OMDbAPI.DTO.SaveMovieDTO;
import com.perscholas.OMDbAPI.Repository.MovieRepository;
import com.perscholas.OMDbAPI.Response.OmdbApiResponse;
import com.perscholas.OMDbAPI.Response.OmdbMovie;
import com.perscholas.OMDbAPI.Response.OmdbMovieDetails;
import com.perscholas.OMDbAPI.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    private final String OMDB_API_URL = "https://www.omdbapi.com/";
    private final String API_KEY = "b79fdda2";

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public MovieService(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    public List<OmdbMovie> getMovies(String title, String year) {

            String url = OMDB_API_URL + "?apikey=" + API_KEY + "&s=" + title + "&y=" + year + "&plot=full";

                ResponseEntity<String> jsonResponse = restTemplate.getForEntity(url, String.class);

        try {
            ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            OmdbApiResponse movieSearchResult = objectMapper.readValue(jsonResponse.getBody(), OmdbApiResponse.class);

            List<OmdbMovie> movies = movieSearchResult.getSearch();
            return movies;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }



    }
    public OmdbMovieDetails getMovieDetails(String title) {

        String url = OMDB_API_URL + "?apikey=" + API_KEY + "&t=" + title ;

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        try {
            ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            OmdbMovieDetails movieSearchResult = objectMapper.readValue(response.getBody(), OmdbMovieDetails.class);

            return movieSearchResult;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }



    }

    public void saveMovie(SaveMovieDTO movie){
        Movie newMovie = new Movie();
        newMovie.setTitle(movie.getTitle());
        newMovie.setPlot(movie.getPlot());
        newMovie.setGenre(movie.getGenre());
        newMovie.setActors(movie.getActors());
        newMovie.setLanguage(movie.getLanguage());
        newMovie.setDirector(movie.getDirector());
        newMovie.setPoster(movie.getPoster());
        newMovie.setRated(movie.getRated());
        newMovie.setYear(movie.getYear());
        newMovie.setRuntime(movie.getRuntime());
        newMovie.setReleased(movie.getReleased());
        newMovie.setWriter(movie.getWriter());
        newMovie.setType(movie.getType());
        newMovie.setCountry(movie.getCountry());
        newMovie.setImdbRating(movie.getImdbRating());
        newMovie.setImdbID(movie.getImdbID());

        movieRepository.save(newMovie);
    }
    public void deleteMovie(Long id){
        movieRepository.deleteById(id);
    }
    public Optional<Movie> getMovie(String imdbid){
       return movieRepository.findMovieByImdbID(imdbid);
    }
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

}
