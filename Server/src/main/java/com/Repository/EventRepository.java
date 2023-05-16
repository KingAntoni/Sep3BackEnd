package com.Repository;

import com.Model.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventModel,Long> {
    EventModel findById(int id);
}
