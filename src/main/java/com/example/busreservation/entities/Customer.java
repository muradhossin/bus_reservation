package com.example.busreservation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private  Long customerId;
    private  String customerName;
    private  String mobile;
    private  String email;
}
