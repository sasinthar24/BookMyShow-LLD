package com.example.bookmyshowlld.controllers;

import com.example.bookmyshowlld.dtos.SeatMapDto;
import com.example.bookmyshowlld.service.ShowSeatService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seats")
public class ShowSeatController {


    ShowSeatService showSeatService;
    public ShowSeatController(ShowSeatService showSeatService)
    {
        this.showSeatService = showSeatService;
    }

    @GetMapping("/{show_id}")
    public SeatMapDto getSeatMap(@PathVariable(name = "show_id") Long show_id)
    {
        return new SeatMapDto(showSeatService.findShowSeatsByShowId(show_id));

    }
}
