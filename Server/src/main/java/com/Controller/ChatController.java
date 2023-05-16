package com.Controller;

import com.Model.ChatModel;
import com.Service.ChatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/{id}")
    public ChatModel findById(@PathVariable("id")int id) {
        return chatService.findById(id);
    }

    @PostMapping("/save")
    public ChatModel saveChat(@RequestBody ChatModel chatModel){
        return chatService.saveChat(chatModel);
    }

    @GetMapping("/delete")
    public void deleteUser(@RequestBody long id){
        chatService.deleteChat(id);
    }

    @GetMapping("/getUser/{id}")
    public List<ChatModel> findByUserId1(@PathVariable("id")int id){
        return chatService.findByUserId(id);
    }
}
