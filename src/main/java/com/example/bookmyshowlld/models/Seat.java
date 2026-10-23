package com.example.bookmyshowlld.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "seat")
public class Seat extends BaseModel {

    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;
    @Column(name = "hall_row")
    private int row;
    @Column(name = "hall_col")
    private int col;

    @Enumerated
    private SeatType seatType;

}