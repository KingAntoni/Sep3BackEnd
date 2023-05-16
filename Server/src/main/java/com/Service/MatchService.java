package com.Service;

import com.Model.MatchModel;

import java.util.List;

public interface MatchService {
    MatchModel findById(int id);
    MatchModel updateMatch(MatchModel matchModel);
    void deleteMatch(Long id);
    List<MatchModel> findByUserId(int id);

    boolean isMatch(MatchModel matchModel);
}
