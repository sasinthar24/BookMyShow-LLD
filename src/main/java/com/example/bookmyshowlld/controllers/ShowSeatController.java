package com.example.bookmyshowlld.controllers;

import com.example.bookmyshowlld.dtos.SeatMapDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class ShowSeatController {
    @GetMapping("/{show_id}")
    public SeatMapDto getSeatMap(@PathVariable(name = "show_id") int show_id)
    {
        return null;

    }
}
