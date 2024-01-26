package com.example.busreservation.services.impl;

import com.example.busreservation.entities.BusReservation;
import com.example.busreservation.entities.BusSchedule;
import com.example.busreservation.entities.Customer;
import com.example.busreservation.models.ReservationApiException;
import com.example.busreservation.repos.BusScheduleRepository;
import com.example.busreservation.repos.CustomerRepository;
import com.example.busreservation.repos.ReservationRepository;
import com.example.busreservation.services.BusService;
import com.example.busreservation.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private BusScheduleRepository busScheduleRepository;

    @Override
    public BusReservation addReservation(BusReservation busReservation) {
        final Customer customer;
        final  boolean doesCustomerExist = customerRepository.existsByMobileOrEmail(
                busReservation.getCustomer().getMobile(), busReservation.getCustomer().getEmail()
        );
        if(doesCustomerExist) {
            customer = customerRepository.findByMobileOrEmail(busReservation.getCustomer().getMobile(), busReservation.getCustomer().getEmail());
        }else{
            customer = customerRepository.save(busReservation.getCustomer());
        }
        busReservation.setCustomer(customer);
        return reservationRepository.save(busReservation);
    }

    @Override
    public List<BusReservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public List<BusReservation> getReservationByScheduleAndDepartureDate(Long scheduleId, String departureDate) {
        final BusSchedule schedule = busScheduleRepository.findById(scheduleId).orElseThrow(() -> new ReservationApiException(HttpStatus.BAD_REQUEST, "Schedule not found"));
        return reservationRepository.findByBusScheduleAndDepartureDate(schedule, departureDate).orElseThrow(
                () -> new ReservationApiException(HttpStatus.BAD_REQUEST, "Reservation not found")
        );
    }

    @Override
    public List<BusReservation> getReservationByMobile(String mobile) {
        final  Customer customer = customerRepository.findByMobile(mobile).orElseThrow(
                () -> new ReservationApiException(HttpStatus.BAD_REQUEST, "No record found")
        );
        return reservationRepository.findByCustomer(customer).orElseThrow(
                () -> new ReservationApiException(HttpStatus.BAD_REQUEST, "No record found")
        );
    }
}
