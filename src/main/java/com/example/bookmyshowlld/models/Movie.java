package com.example.bookmyshowlld.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "movie")
public class Movie extends BaseModel{
    @Column(unique = true)
    private String name;

    private int duration;
}