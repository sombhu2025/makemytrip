package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotels {
    @GetMapping("/hotels")
    public String getData() {return  "please book your hotels from Make my Trip kindly book ticket for primium hotels in Delhi" ; }
}
