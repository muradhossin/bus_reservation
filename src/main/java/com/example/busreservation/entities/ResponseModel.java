package com.example.busreservation.entities;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseModel {
    private  String responseStatus;
    private  Integer statusCode;
    private  String message;
    private Map<String, StdKeySerializers.Dynamic> object;
}
