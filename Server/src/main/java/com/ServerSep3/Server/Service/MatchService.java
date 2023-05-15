package com.ServerSep3.Server.Service;

import com.ServerSep3.Server.Model.EventModel;
import com.ServerSep3.Server.Model.MatchModel;
import com.ServerSep3.Server.Model.Message;

import java.util.List;

public interface MatchService {
    MatchModel findById(int id);
    MatchModel updateMatch(MatchModel matchModel);
    void deleteMatch(Long id);
    List<MatchModel> findByUserId(int id);

    boolean isMatch(MatchModel matchModel);
}
