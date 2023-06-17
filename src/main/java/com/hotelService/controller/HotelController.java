package com.hotelService.controller;

import com.hotelService.entity.Hotel;
import com.hotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    private HotelService hotelService;
    @PostMapping("/saveHotel")
    Hotel saveUser(@RequestBody Hotel user){
        return hotelService.saveHotel(user);
    }
    @GetMapping("/getAllHotel")
    List<Hotel> getAllUser(){
        return hotelService.getAllHotel();
    }
    @GetMapping("/getHotel")
    Hotel getUser(@RequestParam String id){
        return hotelService.getHotel(id);
    }
    @GetMapping("/deleteHotel/{id}")
    String deleteUser(String id){
        return hotelService.deleteHotel(id);
    }
    @PostMapping("/updateUser")
    Hotel updateHotel(Hotel hotel){
        return hotelService.updateHotel(hotel);
    }
}
