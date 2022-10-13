package com.g11.reto3.Service;

import com.g11.reto3.Entetities.Motorbike;
import com.g11.reto3.repository.MotorbikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class MotorbikeService {


    @Autowired
    private MotorbikeRepository motorbikeRepository;

    public List<Motorbike> getAll() {
        return motorbikeRepository.getAll();
    }

    public Optional<Motorbike> getMotorbike(int id) {
        return motorbikeRepository.getMotorbike(id);
    }

    public Motorbike save(Motorbike p) {
        if (p.getId() == null) {
            return motorbikeRepository.save(p);
        } else {
            Optional<Motorbike> e=motorbikeRepository.getMotorbike(p.getId());
            if(e.isPresent()){
                return motorbikeRepository.save(p);
            }else{
                return p;

            }
        }
    }
}