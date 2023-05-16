package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserModel,Long> {
    UserModel findById(int id);
    UserModel findByUsername(String username);
    List<UserModel> findByGender(String gender);
}
