package com.Repository;

import com.Model.UserModel;
import com.Model.UsersInEvents;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersInEventRepository extends JpaRepository<UsersInEvents,Long> {
    UsersInEvents findById(int id);
    List<UserModel> findByEventId(int id);
}
