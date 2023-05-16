package com.Service.Impl;

import com.Model.Message;
import com.Repository.MessageRepository;
import com.Service.MessageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public List<Message> findAllMessagesForAChat(int id) {
        return messageRepository.findByChatId(id);
    }

    @Override
    public Message findById(int id) {
        return messageRepository.findById(id);
    }

    @Override
    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }
}
