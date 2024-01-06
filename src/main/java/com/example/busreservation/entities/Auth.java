package com.example.busreservation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Auth {
    private  int statusCode;
    private  String message;
    private  String accessToken;
    private  Integer logInTime;
    private  Integer expirationDuration;
}
