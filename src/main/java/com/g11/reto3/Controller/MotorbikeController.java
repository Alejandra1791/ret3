package com.g11.reto3.Controller;


import com.g11.reto3.Entetities.Motorbike;
import com.g11.reto3.Service.MotorbikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Motorbike")

public class MotorbikeController {
        @Autowired
        private MotorbikeService motorbikeService;

        @GetMapping("all")
        public List<Motorbike> getMotorbikes(){
                return motorbikeService.getAll();
        }
        @GetMapping("/{id}")
        public Optional<Motorbike> getMotorbike(@PathVariable("id")int motorbikeId){
                return motorbikeService.getMotorbike(motorbikeId);
        }
        @PostMapping("/save")
        @ResponseStatus (HttpStatus.CREATED)
        public Motorbike save(@RequestBody Motorbike motorbike){
                return motorbikeService.save(motorbike);
        }
}