package com.perscholas.OMDbAPI.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;


@Getter
@Setter
@Data
public class OmdbApiResponse {
    @JsonProperty("Search")
    private List<OmdbMovie> search;

}
