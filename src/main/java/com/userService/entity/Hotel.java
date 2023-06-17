package com.userService.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hotel {
    @JsonProperty("id")
    int hotelId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("location")
    private String location;
    @JsonProperty("about")
    private String about;
}
