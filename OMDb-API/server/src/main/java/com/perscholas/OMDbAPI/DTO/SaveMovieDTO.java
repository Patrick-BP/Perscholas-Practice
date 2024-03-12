package com.perscholas.OMDbAPI.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SaveMovieDTO {
    private String Title;
    private String Year;
    private String Rated;
    private String Released;
    private String Runtime;
    private String Genre;
    private String Director;
    private String Writer;
    private String Actors;
    private String Plot;
    private String Language;
    private String Poster;
    private String Type;
    private String Country;
    private String imdbRating;
    private String imdbID;
}
