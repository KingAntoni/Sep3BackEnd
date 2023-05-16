package com.Service;

import com.Model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> findAllEmployees();
    UserModel findById(int id);
    UserModel saveUser(UserModel userModel);
    UserModel updateUser(UserModel userModel);
    void deleteUser(Long id);
    UserModel findByUsername(String username);
}
