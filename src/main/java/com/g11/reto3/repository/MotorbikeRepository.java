package com.g11.reto3.repository;
import com.g11.reto3.Entetities.Motorbike;
import com.g11.reto3.repository.crudRepository.MotorbikeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MotorbikeRepository {

    @Autowired
    private MotorbikeCrudRepository motorbikeCrudRepository;

    public List<Motorbike> getAll(){
        return (List<Motorbike>) motorbikeCrudRepository.findAll();
    }

    public Optional<Motorbike> getMotorbike(int id){
        return motorbikeCrudRepository.findById(id);
    }

    public Motorbike save (Motorbike motorbike){
        return motorbikeCrudRepository.save(motorbike);
    }

    }

