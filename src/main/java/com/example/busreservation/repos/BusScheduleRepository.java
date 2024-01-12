package com.example.busreservation.repos;

import com.example.busreservation.entities.Bus;
import com.example.busreservation.entities.BusRoute;
import com.example.busreservation.entities.BusSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BusScheduleRepository extends JpaRepository<BusScheduleRepository, Long> {
    Optional<BusSchedule> findByBusRoute(BusRoute busRoute);
    Boolean existsByBusAndBusRouteAndDepartureTime(Bus bus, BusRoute busRoute, String date);
}
