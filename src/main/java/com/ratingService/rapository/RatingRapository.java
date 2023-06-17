package com.ratingService.rapository;

import com.ratingService.entity.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RatingRapository extends MongoRepository<Rating,String>{
    List<Rating> findByUserId(String id);
    List<Rating> findByHotelId(String id);
}
