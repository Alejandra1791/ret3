package com.g11.reto3.Controller;


import com.g11.reto3.Entetities.Reservation;
import com.g11.reto3.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation>getReservations(){
        return reservationService.getAll();
}
    @GetMapping("{id}")
    public Optional<Reservation> getReservation(@PathVariable("id")int reservationId){
        return reservationService.getReservation(reservationId);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation reservation){
        return reservationService.save(reservation);
    }

}


