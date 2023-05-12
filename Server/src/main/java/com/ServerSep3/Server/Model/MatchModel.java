package com.ServerSep3.Server.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "match")
public class MatchModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;
    @Column
    private int userId1;
    @Column
    private boolean matchUser1;
    @Column
    private int userId2;
    @Column
    private boolean matchUser2;
    @Column
    private boolean match;

    public MatchModel(int matchId, int userId1, boolean matchUser1, int userId2, boolean matchUser2, boolean match) {
        this.matchId = matchId;
        this.userId1 = userId1;
        this.matchUser1 = matchUser1;
        this.userId2 = userId2;
        this.matchUser2 = matchUser2;
        this.match = match;
    }

    public MatchModel() {
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getUserId1() {
        return userId1;
    }

    public void setUserId1(int userId1) {
        this.userId1 = userId1;
    }

    public boolean isMatchUser1() {
        return matchUser1;
    }

    public void setMatchUser1(boolean matchUser1) {
        this.matchUser1 = matchUser1;
    }

    public int getUserId2() {
        return userId2;
    }

    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }

    public boolean isMatchUser2() {
        return matchUser2;
    }

    public void setMatchUser2(boolean matchUser2) {
        this.matchUser2 = matchUser2;
    }

    public boolean isMatch() {
        return match;
    }

    public void setMatch(boolean match) {
        this.match = match;
    }
}
