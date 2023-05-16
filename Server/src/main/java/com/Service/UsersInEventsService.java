package com.Service;
import com.Model.UserModel;
import com.Model.UsersInEvents;

import java.util.List;

public interface UsersInEventsService {
    List<UserModel> findAllUserForOneEvent(int id);
    UsersInEvents saveUserInEvent(UsersInEvents usersInEvents);
    void deleteUser(UsersInEvents usersInEvents);
}
