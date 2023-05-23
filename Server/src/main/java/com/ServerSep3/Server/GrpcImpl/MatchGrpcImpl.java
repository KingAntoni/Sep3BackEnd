package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Match;
import GrpcClasses.MatchesGrpc;
import com.ServerSep3.Server.Model.MatchModel;
import com.ServerSep3.Server.Service.MatchService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class MatchGrpcImpl extends MatchesGrpc.MatchesImplBase {

    @Autowired
    MatchService service;

    @Override
    public void findById(Match.MatchIdRequest request, StreamObserver<Match.MatchModel> responseObserver) {
        System.out.println("Finding match");
        MatchModel matchModel = service.findById(request.getId());
        Match.MatchModel response = Match.MatchModel.newBuilder()
            .setMatch(matchModel.getMatch())
            .setId(matchModel.getId())
            .setMatchUser1(matchModel.getMatchUser1())
            .setMatchUser2(matchModel.getMatchUser2())
            .setUserId1(matchModel.getUserId1())
            .setUserId2(matchModel.getUserId2())
            .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        System.out.println("Match find");
    }

    @Override
    public void updateMatch(Match.MatchModel request, StreamObserver<Match.Empty> responseObserver) {
        System.out.println("Update match");
        service.updateMatch(new MatchModel(request.getId(), request.getUserId1(), request.getMatchUser1(), request.getUserId2(), request.getMatchUser2(), request.getMatch()));
        responseObserver.onCompleted();
        System.out.println("Match updated");
    }

    @Override
    public void deleteMatch(Match.MatchIdRequest request, StreamObserver<Match.Empty> responseObserver) {
        System.out.println("Delete match");
        service.deleteMatch((long)request.getId());
        responseObserver.onCompleted();
        System.out.println("Match deleted");
    }

    @Override
    public void findByUserId(Match.UserIdRequest request, StreamObserver<Match.MatchModel> responseObserver) {
        System.out.println("find by user id");


        responseObserver.onCompleted();
        System.out.println("all matches sent");
    }

    @Override
    public void createMatch(Match.MatchModel request, StreamObserver<Match.Empty> responseObserver) {
        System.out.println("Creating match");
        service.createMatch(new MatchModel(request.getId(), request.getUserId1(), request.getMatchUser1(),
            request.getUserId2(), request.getMatchUser2(), request.getMatch()));
        responseObserver.onCompleted();
        System.out.println("Match created");
    }
}
