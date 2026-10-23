package com.example.bookmyshowlld.service;

import com.example.bookmyshowlld.exceptions.SeatsAlreadyBookedExp;
import com.example.bookmyshowlld.models.Booking;
import com.example.bookmyshowlld.models.ShowSeat;
import com.example.bookmyshowlld.models.ShowSeatStatus;
import com.example.bookmyshowlld.repository.BookingRepository;
import com.example.bookmyshowlld.repository.ShowSeatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
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

    /*
        1.Fetch the seat from the db.
        2.Verify the Status of the seats as Available;
        3.Change staus of seats to block and allow user some time to make payment.
        4.Finally create a Booking Object;


     */
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookTicket(List<Long> showSeatsList)
    {
        List<ShowSeat> showSeats = showSeatRepository.findAllById(showSeatsList);

        if(showSeats.isEmpty() || showSeats.size() != showSeatsList.size())
        {
            throw new IllegalArgumentException("Invalid Show Seats");
        }

        double totalAmount = 0;
        //For every showSeat check if the seat was available and then change the status to reserved.
        for(ShowSeat showSeat: showSeats)
        {
            if(!showSeat.getShowSeatStatus().equals(ShowSeatStatus.FREE)) {
                throw new SeatsAlreadyBookedExp();
            }

            showSeat.setShowSeatStatus(ShowSeatStatus.RESERVED);
            totalAmount += showSeat.getPrice();

        }


        //TODO: build the bookin object
        Booking booking = Booking.builder()
                .show(showSeats.get(0).getShow())
                .show_seats(showSeats)
                .booked_at(LocalDateTime.now())
                .total_price(totalAmount)
                .build();
        showSeatRepository.saveAll(showSeats);
        booking = bookingRepository.save(booking);
        return  booking;
    }
}
