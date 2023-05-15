package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Model.UsersInEvents;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersInEventRepository extends JpaRepository<UsersInEvents,Long> {
    UsersInEvents findById(int id);
    List<UserModel> findByEventId(int id);
}
