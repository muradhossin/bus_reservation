package com.example.busreservation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReservationExpansionBody {
    private  Customer customer;
    private  Integer totalSeatBooked;
    private  String seatNumbers;
    private  Double totalPrice;
}
