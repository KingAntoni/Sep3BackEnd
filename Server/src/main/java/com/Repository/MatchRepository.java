package com.Repository;

import com.Model.MatchModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRepository extends JpaRepository<MatchModel,Long> {
    MatchModel findById(int id);
    List<MatchModel> findByUserId1(int id);
    List<MatchModel> findByUserId2(int id);
}
