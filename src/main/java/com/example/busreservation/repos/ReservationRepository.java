package com.example.busreservation.repos;

import com.example.busreservation.entities.BusReservation;
import com.example.busreservation.entities.BusSchedule;
import com.example.busreservation.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ReservationRepository extends JpaRepository<BusReservation, Long> {
    Optional<List<BusReservation>> findByCustomer(Customer customer);
    Optional<List<BusReservation>> findByBusScheduleAndDepartureDate(BusSchedule busSchedule, String departureDate);


}
