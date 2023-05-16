package com.ServerSep3.Server.Controller;

import com.ServerSep3.Server.Model.Message;
import com.ServerSep3.Server.Service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/findAll/{id}")
    public List<Message> findAllMessagesForAChat(@PathVariable("id")int id){
        return messageService.findAllMessagesForAChat(id);
    }

    @GetMapping("/{id}")
    public Message findById(@PathVariable("id")int id){
        return messageService.findById(id);
    }

    @PostMapping("/save")
    public Message save(@RequestBody Message message){
        return messageService.saveMessage(message);
    }

    @GetMapping("/delete/{id}")
    public void deleteMessage(@PathVariable("id")long id){
        messageService.deleteMessage(id);
    }

}
