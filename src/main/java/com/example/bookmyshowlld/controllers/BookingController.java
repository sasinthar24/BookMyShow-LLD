package com.example.bookmyshowlld.controllers;

import com.example.bookmyshowlld.dtos.CreateBookingDto;
import com.example.bookmyshowlld.models.Booking;
import com.example.bookmyshowlld.service.BookingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {
    BookingService bookingService;

    public BookingController(BookingService bookingService)
    {
        this.bookingService = bookingService;
    }

    @PostMapping("/create")
    public Booking createBooking(@RequestBody CreateBookingDto createBookingdto)
    {

        return bookingService.bookTicket(null);
    }

}
