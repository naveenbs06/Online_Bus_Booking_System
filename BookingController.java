package com.busbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.busbooking.entity.Booking;
import com.busbooking.repository.BookingRepository;

@RestController
@RequestMapping("/booking")
@CrossOrigin
public class BookingController {

    @Autowired
    private BookingRepository repo;

    @PostMapping("/save")
    public Booking saveBooking(@RequestBody Booking booking){
        return repo.save(booking);
    }

}