package com.Service.Impl;
import com.Model.MatchModel;
import com.Repository.MatchRepository;
import com.Service.MatchService;
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
        if(isMatch(matchModel)){
            matchModel.setMatch(true);
        }
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

    @Override
    public boolean isMatch(MatchModel matchModel) {
        Boolean match1= matchModel.getMatchUser1();
        Boolean match2= matchModel.getMatchUser2();
        if(match1 & match2){
            return true;
        }
        return false;
    }

}
