package com.example.busreservation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationExpansionHeader {
    private  Long reservationId;
    private  String departureDate;
    private  BusSchedule busSchedule;
    private  Integer timestamp;
    private  String reservationStatus;
}
