package com.ratingService.service.serviceImp;

import com.ratingService.entity.Rating;
import com.ratingService.rapository.RatingRapository;
import com.ratingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImp implements RatingService {
    @Autowired
    private RatingRapository ratingRapository;
    @Override
    public Rating saveRating(Rating rating) {
        return ratingRapository.save(rating);
    }
    public List<Rating> getRating(){
        return ratingRapository.findAll();
    }
    @Override
    public List<Rating> getRatingByUserId(String id) {
        return ratingRapository.findByUserId(id);
    }
    @Override
    public List<Rating> getRatingByHotelId(String id) {
        return ratingRapository.findByHotelId(id);
    }
}
