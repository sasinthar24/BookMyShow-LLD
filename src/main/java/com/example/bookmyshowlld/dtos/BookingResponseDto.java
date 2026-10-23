package com.example.bookmyshowlld.dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class BookingResponseDto {
    Long id;
    LocalDateTime bookedAt;
    double totalPrice;
    List<Long> showSeatIds;
    String movieName;
    String theaterName;
    LocalDateTime showStartTime;
}
