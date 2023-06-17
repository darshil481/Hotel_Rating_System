package com.ratingService.service;

import com.ratingService.entity.Rating;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RatingService {
    Rating saveRating(Rating rating);
    List<Rating> getRating();
    List<Rating> getRatingByUserId(String id);
    List<Rating> getRatingByHotelId(String id);
}
