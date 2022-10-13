package com.g11.reto3.Service;


import com.g11.reto3.Entetities.Message;
import com.g11.reto3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;
        import java.util.Optional;
        @Service
        public class MessageService {

                @Autowired
                private MessageRepository messageRepository;

                public List<Message> getAll(){
                        return messageRepository.getAll();
                }

                public Optional<Message> getMessage(int messageId){
                        return messageRepository.getMessage(messageId);
                }

                public Message save(Message message){
                        if(message.getIdMessage()==null){
                                return messageRepository.save(message);
                        }else{
                                Optional<Message> e= messageRepository.getMessage(message.getIdMessage());
                                if(e.isPresent()){
                                        return messageRepository.save(message);
                                }else {
                                        return message;
                                }
                        }
                }
        }