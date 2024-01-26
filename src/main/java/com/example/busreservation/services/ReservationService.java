package com.example.busreservation.services;

import com.example.busreservation.entities.BusReservation;

import java.util.List;

public interface ReservationService {
    BusReservation addReservation(BusReservation busReservation);
    List<BusReservation> getAllReservation();
    List<BusReservation> getReservationByScheduleAndDepartureDate(Long scheduleId, String departureDate);
    List<BusReservation> getReservationByMobile(String mobile);
}
