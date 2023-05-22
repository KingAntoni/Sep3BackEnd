package GrpcClasses;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Event.proto")
public final class EventsGrpc {

  private EventsGrpc() {}

  public static final String SERVICE_NAME = "GrpcClasses.Events";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Event.Empty,
      GrpcClasses.Event.EventModel> getFindAllEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAllEvents",
      requestType = GrpcClasses.Event.Empty.class,
      responseType = GrpcClasses.Event.EventModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<GrpcClasses.Event.Empty,
      GrpcClasses.Event.EventModel> getFindAllEventsMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Event.Empty, GrpcClasses.Event.EventModel> getFindAllEventsMethod;
    if ((getFindAllEventsMethod = EventsGrpc.getFindAllEventsMethod) == null) {
      synchronized (EventsGrpc.class) {
        if ((getFindAllEventsMethod = EventsGrpc.getFindAllEventsMethod) == null) {
          EventsGrpc.getFindAllEventsMethod = getFindAllEventsMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Event.Empty, GrpcClasses.Event.EventModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAllEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.EventModel.getDefaultInstance()))
              .setSchemaDescriptor(new EventsMethodDescriptorSupplier("findAllEvents"))
              .build();
        }
      }
    }
    return getFindAllEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Event.EventIdRequest,
      GrpcClasses.Event.EventModel> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = GrpcClasses.Event.EventIdRequest.class,
      responseType = GrpcClasses.Event.EventModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Event.EventIdRequest,
      GrpcClasses.Event.EventModel> getFindByIdMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Event.EventIdRequest, GrpcClasses.Event.EventModel> getFindByIdMethod;
    if ((getFindByIdMethod = EventsGrpc.getFindByIdMethod) == null) {
      synchronized (EventsGrpc.class) {
        if ((getFindByIdMethod = EventsGrpc.getFindByIdMethod) == null) {
          EventsGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Event.EventIdRequest, GrpcClasses.Event.EventModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.EventIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.EventModel.getDefaultInstance()))
              .setSchemaDescriptor(new EventsMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Event.EventModel,
      GrpcClasses.Event.EventModel> getSaveEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveEvent",
      requestType = GrpcClasses.Event.EventModel.class,
      responseType = GrpcClasses.Event.EventModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Event.EventModel,
      GrpcClasses.Event.EventModel> getSaveEventMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Event.EventModel, GrpcClasses.Event.EventModel> getSaveEventMethod;
    if ((getSaveEventMethod = EventsGrpc.getSaveEventMethod) == null) {
      synchronized (EventsGrpc.class) {
        if ((getSaveEventMethod = EventsGrpc.getSaveEventMethod) == null) {
          EventsGrpc.getSaveEventMethod = getSaveEventMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Event.EventModel, GrpcClasses.Event.EventModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.EventModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.EventModel.getDefaultInstance()))
              .setSchemaDescriptor(new EventsMethodDescriptorSupplier("saveEvent"))
              .build();
        }
      }
    }
    return getSaveEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Event.EventModel,
      GrpcClasses.Event.EventModel> getUpdateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateEvent",
      requestType = GrpcClasses.Event.EventModel.class,
      responseType = GrpcClasses.Event.EventModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Event.EventModel,
      GrpcClasses.Event.EventModel> getUpdateEventMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Event.EventModel, GrpcClasses.Event.EventModel> getUpdateEventMethod;
    if ((getUpdateEventMethod = EventsGrpc.getUpdateEventMethod) == null) {
      synchronized (EventsGrpc.class) {
        if ((getUpdateEventMethod = EventsGrpc.getUpdateEventMethod) == null) {
          EventsGrpc.getUpdateEventMethod = getUpdateEventMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Event.EventModel, GrpcClasses.Event.EventModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.EventModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.EventModel.getDefaultInstance()))
              .setSchemaDescriptor(new EventsMethodDescriptorSupplier("updateEvent"))
              .build();
        }
      }
    }
    return getUpdateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<GrpcClasses.Event.EventIdRequest,
      GrpcClasses.Event.Empty> getDeleteEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEvent",
      requestType = GrpcClasses.Event.EventIdRequest.class,
      responseType = GrpcClasses.Event.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<GrpcClasses.Event.EventIdRequest,
      GrpcClasses.Event.Empty> getDeleteEventMethod() {
    io.grpc.MethodDescriptor<GrpcClasses.Event.EventIdRequest, GrpcClasses.Event.Empty> getDeleteEventMethod;
    if ((getDeleteEventMethod = EventsGrpc.getDeleteEventMethod) == null) {
      synchronized (EventsGrpc.class) {
        if ((getDeleteEventMethod = EventsGrpc.getDeleteEventMethod) == null) {
          EventsGrpc.getDeleteEventMethod = getDeleteEventMethod =
              io.grpc.MethodDescriptor.<GrpcClasses.Event.EventIdRequest, GrpcClasses.Event.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.EventIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  GrpcClasses.Event.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EventsMethodDescriptorSupplier("deleteEvent"))
              .build();
        }
      }
    }
    return getDeleteEventMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsStub>() {
        @java.lang.Override
        public EventsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsStub(channel, callOptions);
        }
      };
    return EventsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsBlockingStub>() {
        @java.lang.Override
        public EventsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsBlockingStub(channel, callOptions);
        }
      };
    return EventsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EventsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EventsFutureStub>() {
        @java.lang.Override
        public EventsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EventsFutureStub(channel, callOptions);
        }
      };
    return EventsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EventsImplBase implements io.grpc.BindableService {

    /**
     */
    public void findAllEvents(GrpcClasses.Event.Empty request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.EventModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllEventsMethod(), responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.Event.EventIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.EventModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveEvent(GrpcClasses.Event.EventModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.EventModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveEventMethod(), responseObserver);
    }

    /**
     */
    public void updateEvent(GrpcClasses.Event.EventModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.EventModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEventMethod(), responseObserver);
    }

    /**
     */
    public void deleteEvent(GrpcClasses.Event.EventIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEventMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindAllEventsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                GrpcClasses.Event.Empty,
                GrpcClasses.Event.EventModel>(
                  this, METHODID_FIND_ALL_EVENTS)))
          .addMethod(
            getFindByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Event.EventIdRequest,
                GrpcClasses.Event.EventModel>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            getSaveEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Event.EventModel,
                GrpcClasses.Event.EventModel>(
                  this, METHODID_SAVE_EVENT)))
          .addMethod(
            getUpdateEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Event.EventModel,
                GrpcClasses.Event.EventModel>(
                  this, METHODID_UPDATE_EVENT)))
          .addMethod(
            getDeleteEventMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                GrpcClasses.Event.EventIdRequest,
                GrpcClasses.Event.Empty>(
                  this, METHODID_DELETE_EVENT)))
          .build();
    }
  }

  /**
   */
  public static final class EventsStub extends io.grpc.stub.AbstractAsyncStub<EventsStub> {
    private EventsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsStub(channel, callOptions);
    }

    /**
     */
    public void findAllEvents(GrpcClasses.Event.Empty request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.EventModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindAllEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(GrpcClasses.Event.EventIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.EventModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveEvent(GrpcClasses.Event.EventModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.EventModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEvent(GrpcClasses.Event.EventModel request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.EventModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEvent(GrpcClasses.Event.EventIdRequest request,
        io.grpc.stub.StreamObserver<GrpcClasses.Event.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EventsBlockingStub extends io.grpc.stub.AbstractBlockingStub<EventsBlockingStub> {
    private EventsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<GrpcClasses.Event.EventModel> findAllEvents(
        GrpcClasses.Event.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindAllEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Event.EventModel findById(GrpcClasses.Event.EventIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Event.EventModel saveEvent(GrpcClasses.Event.EventModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Event.EventModel updateEvent(GrpcClasses.Event.EventModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public GrpcClasses.Event.Empty deleteEvent(GrpcClasses.Event.EventIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEventMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventsFutureStub extends io.grpc.stub.AbstractFutureStub<EventsFutureStub> {
    private EventsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EventsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Event.EventModel> findById(
        GrpcClasses.Event.EventIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Event.EventModel> saveEvent(
        GrpcClasses.Event.EventModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Event.EventModel> updateEvent(
        GrpcClasses.Event.EventModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<GrpcClasses.Event.Empty> deleteEvent(
        GrpcClasses.Event.EventIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ALL_EVENTS = 0;
  private static final int METHODID_FIND_BY_ID = 1;
  private static final int METHODID_SAVE_EVENT = 2;
  private static final int METHODID_UPDATE_EVENT = 3;
  private static final int METHODID_DELETE_EVENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_ALL_EVENTS:
          serviceImpl.findAllEvents((GrpcClasses.Event.Empty) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Event.EventModel>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((GrpcClasses.Event.EventIdRequest) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Event.EventModel>) responseObserver);
          break;
        case METHODID_SAVE_EVENT:
          serviceImpl.saveEvent((GrpcClasses.Event.EventModel) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Event.EventModel>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT:
          serviceImpl.updateEvent((GrpcClasses.Event.EventModel) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Event.EventModel>) responseObserver);
          break;
        case METHODID_DELETE_EVENT:
          serviceImpl.deleteEvent((GrpcClasses.Event.EventIdRequest) request,
              (io.grpc.stub.StreamObserver<GrpcClasses.Event.Empty>) responseObserver);
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

  private static abstract class EventsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return GrpcClasses.Event.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Events");
    }
  }

  private static final class EventsFileDescriptorSupplier
      extends EventsBaseDescriptorSupplier {
    EventsFileDescriptorSupplier() {}
  }

  private static final class EventsMethodDescriptorSupplier
      extends EventsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventsMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventsFileDescriptorSupplier())
              .addMethod(getFindAllEventsMethod())
              .addMethod(getFindByIdMethod())
              .addMethod(getSaveEventMethod())
              .addMethod(getUpdateEventMethod())
              .addMethod(getDeleteEventMethod())
              .build();
        }
      }
    }
    return result;
  }
}
