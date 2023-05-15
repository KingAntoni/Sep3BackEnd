package com.ServerSep3.Server.Service.Impl;
import com.ServerSep3.Server.Model.MatchModel;
import com.ServerSep3.Server.Repository.MatchRepository;
import com.ServerSep3.Server.Service.MatchService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private final MatchRepository matchRepository;

    public MatchServiceImpl(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public MatchModel findById(int id) {
        return matchRepository.findById(id);
    }

    @Override
    public MatchModel updateMatch(MatchModel matchModel) {
        matchRepository.deleteById(Long.valueOf(matchModel.getId()));
        return matchRepository.save(matchModel);
    }

    @Override
    public void deleteMatch(Long id) {
        matchRepository.deleteById(id);
    }

    @Override
    public List<MatchModel> findByUserId(int id) {
        List<MatchModel> list1=matchRepository.findByUserId1(id);
        List<MatchModel> list2=matchRepository.findByUserId2(id);
        List<MatchModel> resultList = new ArrayList<>();
        resultList.addAll(list1);
        resultList.addAll(list2);
        return resultList;
    }
}
