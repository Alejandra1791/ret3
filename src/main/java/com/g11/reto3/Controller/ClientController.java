package com.g11.reto3.Controller;


import com.g11.reto3.Entetities.Client;
import com.g11.reto3.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Client")
    public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client> getclients(){
        return clientService.getAll();
    }

    @GetMapping ({"/id"})
    public Optional<Client>geClient(@PathVariable("id")int clientId){
        return clientService.getClient(clientId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client client){
        return clientService.save(client);
    }

    }

