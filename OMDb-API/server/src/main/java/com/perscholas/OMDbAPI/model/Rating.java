package com.perscholas.OMDbAPI.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class Rating {
    @JsonProperty("Source")
    private String source;
    @JsonProperty("Value")
    private String value;


}
