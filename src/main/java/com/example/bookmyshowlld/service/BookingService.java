package com.example.bookmyshowlld.service;

import com.example.bookmyshowlld.models.Booking;
import com.example.bookmyshowlld.models.ShowSeat;
import com.example.bookmyshowlld.repository.BookingRepository;
import com.example.bookmyshowlld.repository.ShowSeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingService {

    BookingRepository bookingRepository;
    ShowSeatRepository showSeatRepository;


    public BookingService (BookingRepository bookingRepository,ShowSeatRepository showSeatRepository)
    {
        this.bookingRepository = bookingRepository;
        this.showSeatRepository = showSeatRepository;
    }



    public Booking bookTicket(List<Long> showSeatsList)
    {
        List<ShowSeat> showSeats = showSeatRepository.findAllById(List.of(1L,2L));

        if(showSeats.size() == 0)
        {
            System.out.println("Invalid  Show Seats");
        }

        System.out.println(showSeats.get(0));
        return  null;
    }
}
