package com.g11.reto3.Controller;


import com.g11.reto3.Entetities.Motorbike;
import com.g11.reto3.Service.MotorbikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Motorbike")

public class MotorbikeController {
        @Autowired
        private MotorbikeService motorbikeService;

        @GetMapping("all")
        public List<Motorbike> getAll(){
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