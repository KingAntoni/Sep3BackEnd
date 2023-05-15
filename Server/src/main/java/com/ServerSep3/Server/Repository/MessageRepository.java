package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.Message;
import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message,Long> {
    Message findById(int id);
    List<Message> findByChatId(int id);
}
