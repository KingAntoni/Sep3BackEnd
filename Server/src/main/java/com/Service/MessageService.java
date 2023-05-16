package com.Service;

import com.Model.Message;

import java.util.List;

public interface MessageService {
    List<Message> findAllMessagesForAChat(int id);
    Message findById(int id);
    Message saveMessage(Message message);
    void deleteMessage(Long id);
}
