package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.Message;
import GrpcClasses.MessagesGrpc;
import com.ServerSep3.Server.Model.MessageModel;
import com.ServerSep3.Server.Service.Impl.MessageServiceImpl;
import com.ServerSep3.Server.Service.MessageService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class MessageGrpcImpl extends MessagesGrpc.MessagesImplBase {

    @Autowired
    MessageService service;

    @Override
    public void findById(Message.MessageIdRequested request, StreamObserver<Message.MessageModel> responseObserver) {
        MessageModel messageModel = service.findById(request.getId());
        Message.MessageModel response = Message.MessageModel.newBuilder()
                .setId(messageModel.getId())
                .setMessage(messageModel.getMessage())
                .setChatId(messageModel.getChatId())
                .setDate(messageModel.getDate())
                .setUserSentId(messageModel.getUserSentId())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void findAllMessagesForAChat(Message.ChatIdRequested request, StreamObserver<Message.MessageModel> responseObserver) {
        super.findAllMessagesForAChat(request, responseObserver);
    }

    @Override
    public void saveMessage(Message.MessageModel request, StreamObserver<Message.MessageModel> responseObserver) {
        super.saveMessage(request, responseObserver);
    }

    @Override
    public void deleteMessage(Message.MessageIdRequested request, StreamObserver<Message.MessageDeleted> responseObserver) {
        super.deleteMessage(request, responseObserver);
    }
}
