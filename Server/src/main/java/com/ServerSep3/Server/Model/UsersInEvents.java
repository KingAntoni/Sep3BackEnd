package com.ServerSep3.Server.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "userInEvents")
public class UsersInEvents {

    @Id
    private int id;
    @Column
    private int userid;


}
