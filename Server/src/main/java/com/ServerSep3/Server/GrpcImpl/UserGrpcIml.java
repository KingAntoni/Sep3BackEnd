package com.ServerSep3.Server.GrpcImpl;

import GrpcClasses.User;
import GrpcClasses.UserGrpcGrpc;
import com.ServerSep3.Server.Model.UserModel;
import com.ServerSep3.Server.Service.UserService;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class UserGrpcIml extends UserGrpcGrpc.UserGrpcImplBase {

    @Autowired
    UserService userService;

    public UserGrpcIml() {
    }

    @Override
    public void saveUser(User.UserModel request, StreamObserver<User.UserModel> responseObserver){
        System.out.println("Received request ==>" + request.toString());
        UserModel userModel= new UserModel(10,"angela","password","email",request.getFirstName(), request.getLastName(),request.getBirthday(),request.getDescription(),5,"hola","foto1","foto2","foto3","foto4","foto5","gender","preference","horos","occup","city","education",true,false);
        System.out.println(userService.findById(5).getFirstName());
        //userService.saveUser(userModel);
        User.UserModel response = User.UserModel.newBuilder().setFirstName("user save").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
