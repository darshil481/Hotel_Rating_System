package com.userService.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    @JsonProperty("ratingId")
    private String ratingId;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("hotelId")
    private String hotelId;
    @JsonProperty("rating")
    private int rating ;
    @JsonProperty("feedback")
    private String feedback;
    @JsonProperty("hotel")
    private Hotel hotel;


}
