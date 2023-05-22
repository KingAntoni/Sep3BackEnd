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
        System.out.println("Save user");
        UserModel userModel= new UserModel(request.getId(),request.getUsername(),request.getPassword(),request.getEmail(),request.getFirstName(),request.getLastName(), request.getBirthday(), request.getDescription(), request.getNumberOfMatches(),request.getNote(), request.getPhoto1(), request.getPhoto2(), request.getPhoto3(), request.getPhoto4(), request.getPhoto5(), request.getGender(), request.getPreference(), request.getHoroscope(), request.getOccupation(), request.getCity(), request.getEducation(), request.getDrink(), request.getAdministrator());
        userService.saveUser(userModel);
        User.UserModel response = User.UserModel.newBuilder()
                .setFirstName(request.getFirstName())
                .setId(request.getId())
                .setUsername(request.getUsername())
                .setPassword(request.getPassword())
                .setEmail(request.getEmail())
                .setLastName(request.getLastName())
                .setBirthday(request.getBirthday())
                .setDescription(request.getDescription())
                .setNumberOfMatches(request.getNumberOfMatches())
                .setNote(request.getNote())
                .setPhoto1(request.getPhoto1())
                .setPhoto2(request.getPhoto2())
                .setPhoto3(request.getPhoto3())
                .setPhoto4(request.getPhoto4())
                .setPhoto5(request.getPhoto5())
                .setGender(request.getGender())
                .setPreference(request.getPreference())
                .setHoroscope(request.getHoroscope())
                .setOccupation(request.getOccupation())
                .setCity(request.getCity())
                .setEducation(request.getEducation())
                .setDrink(request.getDrink())
                .setAdministrator(request.getAdministrator())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void findById(User.GetById request, StreamObserver<User.UserModel> responseObserver) {
        System.out.println("Find by id");
        UserModel model=userService.findById(request.getId());
        User.UserModel response= User.UserModel.newBuilder()
                .setFirstName(model.getFirstName())
                .setId(model.getId())
                .setUsername(model.getUsername())
                .setPassword(model.getPassword())
                .setEmail(model.getEmail())
                .setLastName(model.getLastName())
                .setBirthday(model.getBirthday())
                .setDescription(model.getDescription())
                .setNumberOfMatches(model.getNumber_of_matches())
                .setNote(model.getNote())
                .setPhoto1(model.getPhoto1())
                .setPhoto2(model.getPhoto2())
                .setPhoto3(model.getPhoto3())
                .setPhoto4(model.getPhoto4())
                .setPhoto5(model.getPhoto5())
                .setGender(model.getGender())
                .setPreference(model.getPreference())
                .setHoroscope(model.getHoroscope())
                .setOccupation(model.getOccupation())
                .setCity(model.getCity())
                .setEducation(model.getEducation())
                .setDrink(model.isDrink())
                .setAdministrator(model.isAdministrator())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void findAll(User.Empty request, StreamObserver<User.UserModel> responseObserver) {
        super.findAll(request, responseObserver);
    }

    @Override
    public void updateUser(User.UserModel request, StreamObserver<User.Empty> responseObserver) {
        System.out.println("Update user");
        userService.updateUser(new UserModel(request.getId(),request.getUsername(),request.getPassword(),request.getEmail(),request.getFirstName(),request.getLastName(), request.getBirthday(), request.getDescription(), request.getNumberOfMatches(),request.getNote(), request.getPhoto1(), request.getPhoto2(), request.getPhoto3(), request.getPhoto4(), request.getPhoto5(), request.getGender(), request.getPreference(), request.getHoroscope(), request.getOccupation(), request.getCity(), request.getEducation(), request.getDrink(), request.getAdministrator()));
        responseObserver.onCompleted();
        System.out.println("User updated");
    }

    @Override
    public void deleteUser(User.GetById request, StreamObserver<User.Empty> responseObserver) {
        System.out.println("Delete user");
        userService.deleteUser((long) request.getId());
        responseObserver.onCompleted();
        System.out.println("User delete");
    }

    @Override
    public void findByUsername(User.GetByUsername request, StreamObserver<User.UserModel> responseObserver) {
        System.out.println("Find By Username");
        UserModel model=userService.findByUsername(request.getUsername());
        User.UserModel response= User.UserModel.newBuilder()
                .setFirstName(model.getFirstName())
                .setId(model.getId())
                .setUsername(model.getUsername())
                .setPassword(model.getPassword())
                .setEmail(model.getEmail())
                .setLastName(model.getLastName())
                .setBirthday(model.getBirthday())
                .setDescription(model.getDescription())
                .setNumberOfMatches(model.getNumber_of_matches())
                .setNote(model.getNote())
                .setPhoto1(model.getPhoto1())
                .setPhoto2(model.getPhoto2())
                .setPhoto3(model.getPhoto3())
                .setPhoto4(model.getPhoto4())
                .setPhoto5(model.getPhoto5())
                .setGender(model.getGender())
                .setPreference(model.getPreference())
                .setHoroscope(model.getHoroscope())
                .setOccupation(model.getOccupation())
                .setCity(model.getCity())
                .setEducation(model.getEducation())
                .setDrink(model.isDrink())
                .setAdministrator(model.isAdministrator())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
