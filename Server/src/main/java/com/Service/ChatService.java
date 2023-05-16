package com.Service;

import com.Model.ChatModel;

import java.util.List;

public interface ChatService {
    ChatModel findById(int id);
    ChatModel saveChat(ChatModel chatModel);
    void deleteChat(Long id);
    List<ChatModel> findByUserId(int id);
}
