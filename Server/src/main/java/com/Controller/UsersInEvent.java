package com.Controller;


import com.Model.UserModel;
import com.Model.UsersInEvents;
import com.Service.UsersInEventsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usersInEvents")
public class UsersInEvent {

    private final UsersInEventsService usersInEventsService;

    public UsersInEvent(UsersInEventsService usersInEventsService) {
        this.usersInEventsService = usersInEventsService;
    }

    @GetMapping("/findAll/{id}")
    public List<UserModel> findAllUserForOneEvent(@PathVariable("id")int id){
        return usersInEventsService.findAllUserForOneEvent(id);
    }

    @PostMapping("/save")
    public UsersInEvents save(UsersInEvents usersInEvents){
        return usersInEventsService.saveUserInEvent(usersInEvents);
    }

    @GetMapping("/delete/{id}")
    public void deleteUserFromEvent(UsersInEvents usersInEvents){
        usersInEventsService.deleteUser(usersInEvents);
    }
}
