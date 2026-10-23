package com.example.bookmyshowlld.service;

import com.example.bookmyshowlld.exceptions.ShowNotFoundExp;
import com.example.bookmyshowlld.models.Show;
import com.example.bookmyshowlld.models.ShowSeat;
import com.example.bookmyshowlld.repository.ShowRepository;
import com.example.bookmyshowlld.repository.ShowSeatRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ShowSeatService {
    private final ShowRepository showRepository;
    private final ShowSeatRepository showSeatRepository;

    public ShowSeatService(ShowRepository showRepository, ShowSeatRepository showSeatRepository)
    {
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
    }
    public List<ShowSeat> findShowSeatsByShowId(Long showId)
    {
        Optional<Show> showOptional = showRepository.findById(showId);
        if(!showOptional.isPresent())
        {
            throw new ShowNotFoundExp();

        }

        return showSeatRepository.findAllByShow(showOptional.get());

    }
}
