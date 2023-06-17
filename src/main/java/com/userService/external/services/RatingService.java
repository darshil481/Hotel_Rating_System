package com.userService.external.services;

import com.userService.entity.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="RATING-SERVICE")
public interface RatingService {
    @GetMapping("/getRatingByUserId")
    List<Rating> getRatingByUserId(@RequestParam String id);

}
