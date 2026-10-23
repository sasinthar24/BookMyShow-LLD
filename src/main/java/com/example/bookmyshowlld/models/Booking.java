package com.example.bookmyshowlld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "booking")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Booking extends BaseModel {
    @OneToMany
    private List<ShowSeat> show_seats;

    private double total_price;

    private LocalDateTime booked_at;

    @ManyToOne
    private Show show;

}
