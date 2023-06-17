package com.ratingService.controller;

import com.ratingService.entity.Rating;
import com.ratingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping("/save")
    public Rating save(@RequestBody Rating rating){
        return ratingService.saveRating(rating);
    }
    @GetMapping("/allRating")
    public List<Rating> getRating(){
        return ratingService.getRating();
    }
    @GetMapping("/getRatingByUserId")
    public List<Rating> getRatingByUserId(@RequestParam String id){
        return ratingService.getRatingByUserId(id);
    }
    @GetMapping("/getRatingByHotelId")
    public List<Rating> getRatingByHotelId(@RequestParam String id){
        return ratingService.getRatingByHotelId(id);
    }


}
