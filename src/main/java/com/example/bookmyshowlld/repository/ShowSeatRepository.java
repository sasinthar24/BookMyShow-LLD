package com.example.bookmyshowlld.repository;

import com.example.bookmyshowlld.models.Show;
import com.example.bookmyshowlld.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatRepository extends JpaRepository<ShowSeat,Long> {

    public  List<ShowSeat>findAllByShow(Show show);

}
