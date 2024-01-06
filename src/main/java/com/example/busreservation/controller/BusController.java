package com.example.busreservation.controller;

import com.example.busreservation.entities.Bus;
import com.example.busreservation.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bus")
public class BusController {
    @Autowired
    private BusService busService;

    @PostMapping("/add")
    public String addBus(@RequestBody Bus bus) {
        busService.addBus(bus);
        return  "Bus saved successfully";
    }

    @GetMapping("/all")
    public List<Bus> getAllBus() {
        return busService.getAllBus();
    }
}
