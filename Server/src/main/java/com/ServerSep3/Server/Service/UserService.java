package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> findAllEmployees();
    UserModel findById(int id);
    UserModel saveUser(UserModel userModel);
    UserModel updateUser(UserModel userModel);
    void deleteUser(Long id);
}
