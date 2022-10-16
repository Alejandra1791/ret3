package com.g11.reto3.repository;

import com.g11.reto3.Entetities.Message;
import com.g11.reto3.repository.crudRepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll() {
        return (List<Message>) messageCrudRepository.findAll();

    }

    public Optional<Message> getMessage(int id) { // se usa optional en caso de que no hayan datos
        return messageCrudRepository.findById(id);
    }

    public Message save(Message message) {
            return messageCrudRepository.save(message);

        }
    }


