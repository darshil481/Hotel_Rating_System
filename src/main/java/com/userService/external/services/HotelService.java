package com.userService.external.services;

import com.userService.entity.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="HOTEL-SERVICE")
public interface HotelService {

    @GetMapping("/getHotel")
    Hotel getHotel(@RequestParam String id);
}
