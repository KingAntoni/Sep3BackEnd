package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Match;
import GrpcClasses.MatchesGrpc;
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
        super.findById(request, responseObserver);
    }

    @Override
    public void updateMatch(Match.MatchModel request, StreamObserver<Match.Empty> responseObserver) {
        super.updateMatch(request, responseObserver);
    }

    @Override
    public void deleteMatch(Match.MatchIdRequest request, StreamObserver<Match.Empty> responseObserver) {
        super.deleteMatch(request, responseObserver);
    }

    @Override
    public void findByUserId(Match.UserIdRequest request, StreamObserver<Match.MatchModel> responseObserver) {
        super.findByUserId(request, responseObserver);
    }

    @Override
    public void createMatch(Match.MatchModel request, StreamObserver<Match.Empty> responseObserver) {
        super.createMatch(request, responseObserver);
    }
}
