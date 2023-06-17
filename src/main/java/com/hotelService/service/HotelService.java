package com.hotelService.service;

import com.hotelService.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface HotelService {
    Hotel saveHotel(Hotel Hotel);
    List<Hotel> getAllHotel();
    Hotel getHotel(String id);
    String deleteHotel(String id);
    Hotel updateHotel(Hotel user);
}
