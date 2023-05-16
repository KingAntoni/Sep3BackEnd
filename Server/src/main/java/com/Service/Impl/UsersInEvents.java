package com.Service.Impl;

import com.Model.UserModel;
import com.Repository.UsersInEventRepository;
import com.Service.UsersInEventsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersInEvents implements UsersInEventsService {

    private final UsersInEventRepository usersInEventRepository;

    public UsersInEvents(UsersInEventRepository usersInEventRepository) {
        this.usersInEventRepository = usersInEventRepository;
    }

    @Override
    public List<UserModel> findAllUserForOneEvent(int id) {
        return usersInEventRepository.findByEventId(id);
    }

    @Override
    public com.Model.UsersInEvents saveUserInEvent(com.Model.UsersInEvents usersInEvents) {
        return usersInEventRepository.save(usersInEvents);
    }

    @Override
    public void deleteUser(com.Model.UsersInEvents usersInEvents) {
        usersInEventRepository.delete(usersInEvents);
    }
}
