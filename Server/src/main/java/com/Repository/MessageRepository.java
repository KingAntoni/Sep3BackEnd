package com.Repository;

import com.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message,Long> {
    Message findById(int id);
    List<Message> findByChatId(int id);
}
