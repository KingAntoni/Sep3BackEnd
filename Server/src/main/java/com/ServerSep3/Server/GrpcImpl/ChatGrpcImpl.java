package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Chat;
import GrpcClasses.ChatsGrpc;
import com.ServerSep3.Server.Service.ChatService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class ChatGrpcImpl extends ChatsGrpc.ChatsImplBase {

    @Autowired
    ChatService service;

    @Override
    public void findById(Chat.lookUpById request, StreamObserver<Chat.ChatModel> responseObserver) {
        super.findById(request, responseObserver);
    }



    @Override
    public void deleteChat(Chat.lookUpById request, StreamObserver<Chat.Empty> responseObserver) {
        super.deleteChat(request, responseObserver);
    }

    @Override
    public void findByUserId(Chat.lookUpByUserId request, StreamObserver<Chat.ChatModel> responseObserver) {
        super.findByUserId(request, responseObserver);
    }
}
