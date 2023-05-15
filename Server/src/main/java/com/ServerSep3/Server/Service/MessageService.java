package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.EventModel;
import com.ServerSep3.Server.Model.Message;
import com.ServerSep3.Server.Model.UsersInEvents;

import java.util.List;

public interface MessageService {
    List<Message> findAllMessagesForAChat(int id);
    Message findById(int id);
    Message saveMessage(Message message);
    void deleteMessage(Long id);
}
