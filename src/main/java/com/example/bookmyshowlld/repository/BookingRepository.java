package com.example.bookmyshowlld.repository;
import com.example.bookmyshowlld.models.Booking;
import com.example.bookmyshowlld.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking,Long> {
    Booking save (Booking entity);

    @Override
    Optional<Booking> findById(Long aLong);

    List<Booking> findTop190AllByShow(Show show);

    List<Booking> custom(Show show);
}
