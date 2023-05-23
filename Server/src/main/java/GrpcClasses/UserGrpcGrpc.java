package GrpcClasses;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: User.proto")
public final class UserGrpcGrpc {

  private UserGrpcGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.UserGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.User.UserModel,
      GrpcClasses.User.Empty> getSaveUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveUser",
      requestType = GrpcClasses.User.UserModel.class,
      responseType = GrpcClasses.User.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.User.UserModel,
      GrpcClasses.User.Empty> getSaveUserMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.User.UserModel, GrpcClasses.User.Empty> getSaveUserMethod;
    if ((getSaveUserMethod = UserGrpcGrpc.getSaveUserMethod) == null) {
      synchronized (UserGrpcGrpc.class) {
        if ((getSaveUserMethod = UserGrpcGrpc.getSaveUserMethod) == null) {
          UserGrpcGrpc.getSaveUserMethod = getSaveUserMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.User.UserModel, GrpcClasses.User.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.UserModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserGrpcMethodDescriptorSupplier("saveUser"))
              .build();
        }
      }
    }
    return getSaveUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.User.GetById,
      GrpcClasses.User.UserModel> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = GrpcClasses.User.GetById.class,
      responseType = GrpcClasses.User.UserModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.User.GetById,
      GrpcClasses.User.UserModel> getFindByIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.User.GetById, GrpcClasses.User.UserModel> getFindByIdMethod;
    if ((getFindByIdMethod = UserGrpcGrpc.getFindByIdMethod) == null) {
      synchronized (UserGrpcGrpc.class) {
        if ((getFindByIdMethod = UserGrpcGrpc.getFindByIdMethod) == null) {
          UserGrpcGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.User.GetById, GrpcClasses.User.UserModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.GetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.UserModel.getDefaultInstance()))
              .setSchemaDescriptor(new UserGrpcMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.User.Empty,
      GrpcClasses.User.UserModel> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAll",
      requestType = GrpcClasses.User.Empty.class,
      responseType = GrpcClasses.User.UserModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.User.Empty,
      GrpcClasses.User.UserModel> getFindAllMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.User.Empty, GrpcClasses.User.UserModel> getFindAllMethod;
    if ((getFindAllMethod = UserGrpcGrpc.getFindAllMethod) == null) {
      synchronized (UserGrpcGrpc.class) {
        if ((getFindAllMethod = UserGrpcGrpc.getFindAllMethod) == null) {
          UserGrpcGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.User.Empty, GrpcClasses.User.UserModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.UserModel.getDefaultInstance()))
              .setSchemaDescriptor(new UserGrpcMethodDescriptorSupplier("findAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.User.UserModel,
      GrpcClasses.User.Empty> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = GrpcClasses.User.UserModel.class,
      responseType = GrpcClasses.User.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.User.UserModel,
      GrpcClasses.User.Empty> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.User.UserModel, GrpcClasses.User.Empty> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserGrpcGrpc.getUpdateUserMethod) == null) {
      synchronized (UserGrpcGrpc.class) {
        if ((getUpdateUserMethod = UserGrpcGrpc.getUpdateUserMethod) == null) {
          UserGrpcGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.User.UserModel, GrpcClasses.User.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.UserModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserGrpcMethodDescriptorSupplier("updateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.User.GetById,
      GrpcClasses.User.Empty> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = GrpcClasses.User.GetById.class,
      responseType = GrpcClasses.User.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.User.GetById,
      GrpcClasses.User.Empty> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.User.GetById, GrpcClasses.User.Empty> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserGrpcGrpc.getDeleteUserMethod) == null) {
      synchronized (UserGrpcGrpc.class) {
        if ((getDeleteUserMethod = UserGrpcGrpc.getDeleteUserMethod) == null) {
          UserGrpcGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.User.GetById, GrpcClasses.User.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.GetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UserGrpcMethodDescriptorSupplier("deleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.User.GetByUsername,
      GrpcClasses.User.UserModel> getFindByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByUsername",
      requestType = GrpcClasses.User.GetByUsername.class,
      responseType = GrpcClasses.User.UserModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.User.GetByUsername,
      GrpcClasses.User.UserModel> getFindByUsernameMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.User.GetByUsername, GrpcClasses.User.UserModel> getFindByUsernameMethod;
    if ((getFindByUsernameMethod = UserGrpcGrpc.getFindByUsernameMethod) == null) {
      synchronized (UserGrpcGrpc.class) {
        if ((getFindByUsernameMethod = UserGrpcGrpc.getFindByUsernameMethod) == null) {
          UserGrpcGrpc.getFindByUsernameMethod = getFindByUsernameMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.User.GetByUsername, GrpcClasses.User.UserModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.GetByUsername.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.UserModel.getDefaultInstance()))
              .setSchemaDescriptor(new UserGrpcMethodDescriptorSupplier("findByUsername"))
              .build();
        }
      }
    }
    return getFindByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.User.GetByGender,
      GrpcClasses.User.UserModel> getFindByGenderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByGender",
      requestType = GrpcClasses.User.GetByGender.class,
      responseType = GrpcClasses.User.UserModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.User.GetByGender,
      GrpcClasses.User.UserModel> getFindByGenderMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.User.GetByGender, GrpcClasses.User.UserModel> getFindByGenderMethod;
    if ((getFindByGenderMethod = UserGrpcGrpc.getFindByGenderMethod) == null) {
      synchronized (UserGrpcGrpc.class) {
        if ((getFindByGenderMethod = UserGrpcGrpc.getFindByGenderMethod) == null) {
          UserGrpcGrpc.getFindByGenderMethod = getFindByGenderMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.User.GetByGender, GrpcClasses.User.UserModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByGender"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.GetByGender.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.User.UserModel.getDefaultInstance()))
              .setSchemaDescriptor(new UserGrpcMethodDescriptorSupplier("findByGender"))
              .build();
        }
      }
    }
    return getFindByGenderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserGrpcStub>() {
        @java.lang.Override
        public UserGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserGrpcStub(channel, callOptions);
        }
      };
    return UserGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserGrpcBlockingStub>() {
        @java.lang.Override
        public UserGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserGrpcBlockingStub(channel, callOptions);
        }
      };
    return UserGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserGrpcFutureStub>() {
        @java.lang.Override
        public UserGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserGrpcFutureStub(channel, callOptions);
        }
      };
    return UserGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveUser(GrpcClasses.User.UserModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveUserMethod(), responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.User.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.UserModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void findAll(GrpcClasses.User.Empty request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.UserModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(GrpcClasses.User.UserModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(GrpcClasses.User.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void findByUsername(GrpcClasses.User.GetByUsername request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.UserModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void findByGender(GrpcClasses.User.GetByGender request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.UserModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByGenderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.User.UserModel,
                GrpcClasses.User.Empty>(
                  this, METHODID_SAVE_USER)))
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.User.GetById,
                GrpcClasses.User.UserModel>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getFindAllMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.User.Empty,
                GrpcClasses.User.UserModel>(
                  this, METHODID_FIND_ALL)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.User.UserModel,
                GrpcClasses.User.Empty>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.User.GetById,
                GrpcClasses.User.Empty>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getFindByUsernameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.User.GetByUsername,
                GrpcClasses.User.UserModel>(
                  this, METHODID_FIND_BY_USERNAME)))
          .addMethod(
            getFindByGenderMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.User.GetByGender,
                GrpcClasses.User.UserModel>(
                  this, METHODID_FIND_BY_GENDER)))
          .build();
    }
  }

  /**
   */
  public static final class UserGrpcStub extends io.grpc.stub.AbstractAsyncStub<UserGrpcStub> {
    private UserGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserGrpcStub(channel, callOptions);
    }

    /**
     */
    public void saveUser(GrpcClasses.User.UserModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.User.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.UserModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(GrpcClasses.User.Empty request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.UserModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(GrpcClasses.User.UserModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(GrpcClasses.User.GetById request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByUsername(GrpcClasses.User.GetByUsername request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.UserModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByGender(GrpcClasses.User.GetByGender request,
        io.grpc.stub.StreamObserver<GrpcClasses.User.UserModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindByGenderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserGrpcBlockingStub> {
    private UserGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public GrpcClasses.User.Empty saveUser(GrpcClasses.User.UserModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.User.UserModel findById(GrpcClasses.User.GetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.User.UserModel> findAll(
        GrpcClasses.User.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.User.Empty updateUser(GrpcClasses.User.UserModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.User.Empty deleteUser(GrpcClasses.User.GetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.User.UserModel findByUsername(GrpcClasses.User.GetByUsername request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.User.UserModel> findByGender(
        GrpcClasses.User.GetByGender request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindByGenderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<UserGrpcFutureStub> {
    private UserGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.User.Empty> saveUser(
        GrpcClasses.User.UserModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.User.UserModel> findById(
        GrpcClasses.User.GetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.User.Empty> updateUser(
        GrpcClasses.User.UserModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.User.Empty> deleteUser(
        GrpcClasses.User.GetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.User.UserModel> findByUsername(
        GrpcClasses.User.GetByUsername request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByUsernameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_USER = 0;
  private static final int METHODID_FIND_BY_ID = 1;
  private static final int METHODID_FIND_ALL = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_DELETE_USER = 4;
  private static final int METHODID_FIND_BY_USERNAME = 5;
  private static final int METHODID_FIND_BY_GENDER = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_USER:
          serviceImpl.saveUser((GrpcClasses.User.UserModel) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.User.Empty>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((GrpcClasses.User.GetById) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.User.UserModel>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((GrpcClasses.User.Empty) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.User.UserModel>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((GrpcClasses.User.UserModel) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.User.Empty>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((GrpcClasses.User.GetById) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.User.Empty>) responseObserver);
          break;
        case METHODID_FIND_BY_USERNAME:
          serviceImpl.findByUsername((GrpcClasses.User.GetByUsername) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.User.UserModel>) responseObserver);
          break;
        case METHODID_FIND_BY_GENDER:
          serviceImpl.findByGender((GrpcClasses.User.GetByGender) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.User.UserModel>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserGrpcBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserGrpc");
    }
  }

  private static final class UserGrpcFileDescriptorSupplier
      extends UserGrpcBaseDescriptorSupplier {
    UserGrpcFileDescriptorSupplier() {}
  }

  private static final class UserGrpcMethodDescriptorSupplier
      extends UserGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserGrpcMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserGrpcFileDescriptorSupplier())
              .addMethod(getSaveUserMethod())
              .addMethod(getFindByIdMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getFindByUsernameMethod())
              .addMethod(getFindByGenderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
