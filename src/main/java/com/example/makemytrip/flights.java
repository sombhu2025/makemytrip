package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flights {
    @GetMapping("/flights")
    public String getData() {return  "Please Book your flight from Indigo Nation. Kindly book ticket for new Purandar Airport to anywhere in India as well as abroad." ; }
    }