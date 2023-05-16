package com.Repository;

import com.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel,Long> {
    UserModel findById(int id);
    UserModel findByUsername(String username);
}
