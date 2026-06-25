package com.busbooking.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/bus")
public class BusController {

    @GetMapping("/test")
    public String test(){
        return "Bus Booking API Working!";
    }

}