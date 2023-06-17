package com.userService.service.serviceImp;

import com.userService.entity.Hotel;
import com.userService.entity.Rating;
import com.userService.entity.User;
import com.userService.exceptions.ResourceNotFoundException;
import com.userService.external.services.HotelService;
import com.userService.external.services.RatingService;
import com.userService.repository.UserRepository;
import com.userService.service.UserService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HotelService hotelService;
    @Autowired
    private RatingService ratingService;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String id) {

        User user= userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User Not found in this id !!"));

//        List<Rating> ratings = restTemplate.exchange("http://RATING-SERVICE/getRatingByUserId?id=" + id,
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<Rating>>() {}).getBody();
        List<Rating> ratings = ratingService.getRatingByUserId(id);

        for (int i = 0; i < ratings.size(); i++) {
            Rating rating = ratings.get(i);
            //Hotel hotel = restTemplate.getForObject("http://HOTEL-SERVICE/getHotel?id=" + rating.getHotelId(), Hotel.class);
            Hotel hotel=hotelService.getHotel(rating.getHotelId());
            rating.setHotel(hotel);
            ratings.set(i, rating);
        }

        // Add the ratings to the user object
        user.setRatingList(ratings);

        // Return the user object
        return user;
    }

    @Override
    public String deleteUser(String id) {
         userRepository.deleteById(id);
         return "done";
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
