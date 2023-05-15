package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Repository.UserRepository;
import com.ServerSep3.Server.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserModel> findAllEmployees() {
        return userRepository.findAll();
    }

    @Override
    public UserModel findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }

    @Override
    public UserModel updateUser(UserModel userModel) {
        deleteUser(Long.valueOf(userModel.getId()));
        return userRepository.save(userModel);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserModel findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
