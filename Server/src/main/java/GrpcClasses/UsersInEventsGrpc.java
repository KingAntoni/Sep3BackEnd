package GrpcClasses;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: UsersInEvents.proto")
public final class UsersInEventsGrpc {

  private UsersInEventsGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.UsersInEvents";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.UsersInEventsOuterClass.RequestUsersInEventId,
      GrpcClasses.UsersInEventsOuterClass.UserModel> getFindAllUsersForOneEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllUsersForOneEvent",
      requestType = GrpcClasses.UsersInEventsOuterClass.RequestUsersInEventId.class,
      responseType = GrpcClasses.UsersInEventsOuterClass.UserModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.UsersInEventsOuterClass.RequestUsersInEventId,
      GrpcClasses.UsersInEventsOuterClass.UserModel> getFindAllUsersForOneEventMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.UsersInEventsOuterClass.RequestUsersInEventId, GrpcClasses.UsersInEventsOuterClass.UserModel> getFindAllUsersForOneEventMethod;
    if ((getFindAllUsersForOneEventMethod = UsersInEventsGrpc.getFindAllUsersForOneEventMethod) == null) {
      synchronized (UsersInEventsGrpc.class) {
        if ((getFindAllUsersForOneEventMethod = UsersInEventsGrpc.getFindAllUsersForOneEventMethod) == null) {
          UsersInEventsGrpc.getFindAllUsersForOneEventMethod = getFindAllUsersForOneEventMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.UsersInEventsOuterClass.RequestUsersInEventId, GrpcClasses.UsersInEventsOuterClass.UserModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllUsersForOneEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.UsersInEventsOuterClass.RequestUsersInEventId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.UsersInEventsOuterClass.UserModel.getDefaultInstance()))
              .setSchemaDescriptor(new UsersInEventsMethodDescriptorSupplier("findAllUsersForOneEvent"))
              .build();
        }
      }
    }
    return getFindAllUsersForOneEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel,
      GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel> getSaveUsersInEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveUsersInEvents",
      requestType = GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel.class,
      responseType = GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel,
      GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel> getSaveUsersInEventsMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel, GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel> getSaveUsersInEventsMethod;
    if ((getSaveUsersInEventsMethod = UsersInEventsGrpc.getSaveUsersInEventsMethod) == null) {
      synchronized (UsersInEventsGrpc.class) {
        if ((getSaveUsersInEventsMethod = UsersInEventsGrpc.getSaveUsersInEventsMethod) == null) {
          UsersInEventsGrpc.getSaveUsersInEventsMethod = getSaveUsersInEventsMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel, GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveUsersInEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel.getDefaultInstance()))
              .setSchemaDescriptor(new UsersInEventsMethodDescriptorSupplier("saveUsersInEvents"))
              .build();
        }
      }
    }
    return getSaveUsersInEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel,
      GrpcClasses.UsersInEventsOuterClass.Empty> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel.class,
      responseType = GrpcClasses.UsersInEventsOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel,
      GrpcClasses.UsersInEventsOuterClass.Empty> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel, GrpcClasses.UsersInEventsOuterClass.Empty> getDeleteUserMethod;
    if ((getDeleteUserMethod = UsersInEventsGrpc.getDeleteUserMethod) == null) {
      synchronized (UsersInEventsGrpc.class) {
        if ((getDeleteUserMethod = UsersInEventsGrpc.getDeleteUserMethod) == null) {
          UsersInEventsGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel, GrpcClasses.UsersInEventsOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.UsersInEventsOuterClass.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersInEventsMethodDescriptorSupplier("deleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersInEventsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersInEventsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersInEventsStub>() {
        @java.lang.Override
        public UsersInEventsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersInEventsStub(channel, callOptions);
        }
      };
    return UsersInEventsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersInEventsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersInEventsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersInEventsBlockingStub>() {
        @java.lang.Override
        public UsersInEventsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersInEventsBlockingStub(channel, callOptions);
        }
      };
    return UsersInEventsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersInEventsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersInEventsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersInEventsFutureStub>() {
        @java.lang.Override
        public UsersInEventsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersInEventsFutureStub(channel, callOptions);
        }
      };
    return UsersInEventsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UsersInEventsImplBase implements io.grpc.BindableService {

    /**
     */
    public void findAllUsersForOneEvent(GrpcClasses.UsersInEventsOuterClass.RequestUsersInEventId request,
        io.grpc.stub.StreamObserver<GrpcClasses.UsersInEventsOuterClass.UserModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllUsersForOneEventMethod(), responseObserver);
    }

    /**
     */
    public void saveUsersInEvents(GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveUsersInEventsMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.UsersInEventsOuterClass.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindAllUsersForOneEventMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.UsersInEventsOuterClass.RequestUsersInEventId,
                GrpcClasses.UsersInEventsOuterClass.UserModel>(
                  this, METHODID_FIND_ALL_USERS_FOR_ONE_EVENT)))
          .addMethod(
            getSaveUsersInEventsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel,
                GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel>(
                  this, METHODID_SAVE_USERS_IN_EVENTS)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel,
                GrpcClasses.UsersInEventsOuterClass.Empty>(
                  this, METHODID_DELETE_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UsersInEventsStub extends io.grpc.stub.AbstractAsyncStub<UsersInEventsStub> {
    private UsersInEventsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersInEventsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersInEventsStub(channel, callOptions);
    }

    /**
     */
    public void findAllUsersForOneEvent(GrpcClasses.UsersInEventsOuterClass.RequestUsersInEventId request,
        io.grpc.stub.StreamObserver<GrpcClasses.UsersInEventsOuterClass.UserModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindAllUsersForOneEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveUsersInEvents(GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveUsersInEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.UsersInEventsOuterClass.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UsersInEventsBlockingStub extends io.grpc.stub.AbstractBlockingStub<UsersInEventsBlockingStub> {
    private UsersInEventsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersInEventsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersInEventsBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.UsersInEventsOuterClass.UserModel> findAllUsersForOneEvent(
        GrpcClasses.UsersInEventsOuterClass.RequestUsersInEventId request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindAllUsersForOneEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel saveUsersInEvents(GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveUsersInEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.UsersInEventsOuterClass.Empty deleteUser(GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UsersInEventsFutureStub extends io.grpc.stub.AbstractFutureStub<UsersInEventsFutureStub> {
    private UsersInEventsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersInEventsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersInEventsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel> saveUsersInEvents(
        GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveUsersInEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.UsersInEventsOuterClass.Empty> deleteUser(
        GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ALL_USERS_FOR_ONE_EVENT = 0;
  private static final int METHODID_SAVE_USERS_IN_EVENTS = 1;
  private static final int METHODID_DELETE_USER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UsersInEventsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UsersInEventsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_ALL_USERS_FOR_ONE_EVENT:
          serviceImpl.findAllUsersForOneEvent((GrpcClasses.UsersInEventsOuterClass.RequestUsersInEventId) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.UsersInEventsOuterClass.UserModel>) responseObserver);
          break;
        case METHODID_SAVE_USERS_IN_EVENTS:
          serviceImpl.saveUsersInEvents((GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((GrpcClasses.UsersInEventsOuterClass.UsersInEventsModel) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.UsersInEventsOuterClass.Empty>) responseObserver);
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

  private static abstract class UsersInEventsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersInEventsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.UsersInEventsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UsersInEvents");
    }
  }

  private static final class UsersInEventsFileDescriptorSupplier
      extends UsersInEventsBaseDescriptorSupplier {
    UsersInEventsFileDescriptorSupplier() {}
  }

  private static final class UsersInEventsMethodDescriptorSupplier
      extends UsersInEventsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UsersInEventsMethodDescriptorSupplier(String methodName) {
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
      synchronized (UsersInEventsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersInEventsFileDescriptorSupplier())
              .addMethod(getFindAllUsersForOneEventMethod())
              .addMethod(getSaveUsersInEventsMethod())
              .addMethod(getDeleteUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}