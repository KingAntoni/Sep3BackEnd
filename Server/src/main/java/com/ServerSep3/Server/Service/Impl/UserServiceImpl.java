package com.ServerSep3.Server.Service.Impl;

import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Repository.UserRepository;
import com.ServerSep3.Server.Service.MatchService;
import com.ServerSep3.Server.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    MatchService matchService;



    @Override
    public List<UserModel> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserModel findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public UserModel saveUser(UserModel user) {
        matchService.CreateMatchForUser(user);
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

    @Override
    public List<UserModel> findByGender(String gender) {
        return userRepository.findByGender(gender);
    }
}
