package com.g11.reto3.repository;

import com.g11.reto3.Entetities.Reservation;
import com.g11.reto3.repository.crudRepository.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired //spring inicializa mediante Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();

    }

    public Optional<Reservation> getReservation(int id){ // se usa optional en caso de que no hayan datos
        return reservationCrudRepository.findById(id);
    }

    public Reservation save (Reservation reservation){
        return reservationCrudRepository.save(reservation);
    }


    }
