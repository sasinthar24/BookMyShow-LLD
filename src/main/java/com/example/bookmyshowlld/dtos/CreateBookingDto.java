package com.example.bookmyshowlld.dtos;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class CreateBookingDto {

    List<Long> seatIds;


    public List<Long> getSeatIds()
    {
        return seatIds;
    }

    public CreateBookingDto setSeatIds(List<Long> seatIds)
    {
            this.seatIds = seatIds;
            return this;
    }

}
