package com.hotelService.service.ServiceImp;

import com.hotelService.Exceptions.ResourceNotFoundException;
import com.hotelService.entity.Hotel;
import com.hotelService.repository.HotelRepository;
import com.hotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImp implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new  ResourceNotFoundException("this id not available !!"));
    }

    @Override
    public String deleteHotel(String id) {
        hotelRepository.deleteById(id);
        return "done";
    }

    @Override
    public Hotel updateHotel(Hotel user) {
        return hotelRepository.save(user);
    }
}
