package com.Service;

import com.Model.EventModel;

import java.util.List;

public interface EventService {
    List<EventModel> findAllEvents();
    EventModel findById(int id);
    EventModel saveEvent(EventModel eventModel);
    EventModel updateEvent(EventModel eventModel);
    void deleteUser(Long id);
}
