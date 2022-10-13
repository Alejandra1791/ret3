package com.g11.reto3.repository;

import com.g11.reto3.Entetities.Client;
import com.g11.reto3.repository.crudRepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;
    public List<Client>getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
    public Optional<Client>getClient(int id){
    return clientCrudRepository.findById(id);
    }
    public Client save (Client client){
        return clientCrudRepository.save(client);
    }
}
