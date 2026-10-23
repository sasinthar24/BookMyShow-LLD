package com.example.bookmyshowlld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    @ManyToOne
    private Seat seat;

    @ManyToOne
    private Show show;

    private double price;
    private ShowSeatStatus showSeatStatus;
}
