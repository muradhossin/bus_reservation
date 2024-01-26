package com.example.busreservation.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bus_reservation")
public class BusReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long busReservationId;
    @OneToOne
    @JoinColumn(name = "customer_id")
    public  Customer customer;
    @OneToOne
    @JoinColumn(name = "bus_schedule_id")
    private  BusSchedule busSchedule;
    private  Long timestamp;
    private  String departureDate;
    private  Integer totalSeatBooked;
    private  String seatNumbers;
    private  String reservationStatus;
    private  Double totalPrice;
}
