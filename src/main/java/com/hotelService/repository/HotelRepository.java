package com.hotelService.repository;

import com.hotelService.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,String> {
}
