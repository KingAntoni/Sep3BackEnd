package com.ServerSep3.Server.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "event")
public class EventModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String description;
    @Column
    private String title;

    public EventModel(int id, String description, String title) {
        this.id = id;
        this.description = description;
        this.title = title;
    }

    public EventModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
