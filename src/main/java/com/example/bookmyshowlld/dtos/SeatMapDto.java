package com.example.bookmyshowlld.dtos;


import com.example.bookmyshowlld.models.ShowSeat;
import lombok.Data;
import org.springframework.data.util.Pair;

import java.util.ArrayList;
import java.util.List;

@Data
public class SeatMapDto {
private List<SeatPositionDto> seats = new ArrayList<>() ;

public SeatMapDto(List<ShowSeat> showSeats)
{
    for (ShowSeat showSeat : showSeats)
    {
        seats.add(new SeatPositionDto(showSeat.getSeat().getRow(),showSeat.getSeat().getCol()));
    }
}
}
