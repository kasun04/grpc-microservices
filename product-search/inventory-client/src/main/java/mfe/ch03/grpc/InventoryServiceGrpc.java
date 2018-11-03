package mfe.ch03.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: inventory.proto")
public final class InventoryServiceGrpc {

  private InventoryServiceGrpc() {}

  public static final String SERVICE_NAME = "mfe.ch03.grpc.InventoryService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      mfe.ch03.grpc.Inventory.Items> METHOD_GET_ITEM_BY_NAME =
      io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, mfe.ch03.grpc.Inventory.Items>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "mfe.ch03.grpc.InventoryService", "getItemByName"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.StringValue.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              mfe.ch03.grpc.Inventory.Items.getDefaultInstance()))
          .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("getItemByName"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      mfe.ch03.grpc.Inventory.Item> METHOD_GET_ITEM_BY_ID =
      io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, mfe.ch03.grpc.Inventory.Item>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "mfe.ch03.grpc.InventoryService", "getItemByID"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.StringValue.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              mfe.ch03.grpc.Inventory.Item.getDefaultInstance()))
          .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("getItemByID"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<mfe.ch03.grpc.Inventory.Item,
      com.google.protobuf.BoolValue> METHOD_ADD_ITEM =
      io.grpc.MethodDescriptor.<mfe.ch03.grpc.Inventory.Item, com.google.protobuf.BoolValue>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "mfe.ch03.grpc.InventoryService", "addItem"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              mfe.ch03.grpc.Inventory.Item.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.BoolValue.getDefaultInstance()))
          .setSchemaDescriptor(new InventoryServiceMethodDescriptorSupplier("addItem"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryServiceStub newStub(io.grpc.Channel channel) {
    return new InventoryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InventoryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InventoryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InventoryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getItemByName(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<mfe.ch03.grpc.Inventory.Items> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ITEM_BY_NAME, responseObserver);
    }

    /**
     */
    public void getItemByID(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<mfe.ch03.grpc.Inventory.Item> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ITEM_BY_ID, responseObserver);
    }

    /**
     */
    public void addItem(mfe.ch03.grpc.Inventory.Item request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_ITEM, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ITEM_BY_NAME,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                mfe.ch03.grpc.Inventory.Items>(
                  this, METHODID_GET_ITEM_BY_NAME)))
          .addMethod(
            METHOD_GET_ITEM_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                mfe.ch03.grpc.Inventory.Item>(
                  this, METHODID_GET_ITEM_BY_ID)))
          .addMethod(
            METHOD_ADD_ITEM,
            asyncUnaryCall(
              new MethodHandlers<
                mfe.ch03.grpc.Inventory.Item,
                com.google.protobuf.BoolValue>(
                  this, METHODID_ADD_ITEM)))
          .build();
    }
  }

  /**
   */
  public static final class InventoryServiceStub extends io.grpc.stub.AbstractStub<InventoryServiceStub> {
    private InventoryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getItemByName(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<mfe.ch03.grpc.Inventory.Items> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ITEM_BY_NAME, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getItemByID(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<mfe.ch03.grpc.Inventory.Item> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ITEM_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addItem(mfe.ch03.grpc.Inventory.Item request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_ITEM, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InventoryServiceBlockingStub extends io.grpc.stub.AbstractStub<InventoryServiceBlockingStub> {
    private InventoryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public mfe.ch03.grpc.Inventory.Items getItemByName(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ITEM_BY_NAME, getCallOptions(), request);
    }

    /**
     */
    public mfe.ch03.grpc.Inventory.Item getItemByID(com.google.protobuf.StringValue request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ITEM_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.BoolValue addItem(mfe.ch03.grpc.Inventory.Item request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_ITEM, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InventoryServiceFutureStub extends io.grpc.stub.AbstractStub<InventoryServiceFutureStub> {
    private InventoryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InventoryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InventoryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mfe.ch03.grpc.Inventory.Items> getItemByName(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ITEM_BY_NAME, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<mfe.ch03.grpc.Inventory.Item> getItemByID(
        com.google.protobuf.StringValue request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ITEM_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> addItem(
        mfe.ch03.grpc.Inventory.Item request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_ITEM, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ITEM_BY_NAME = 0;
  private static final int METHODID_GET_ITEM_BY_ID = 1;
  private static final int METHODID_ADD_ITEM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InventoryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InventoryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ITEM_BY_NAME:
          serviceImpl.getItemByName((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<mfe.ch03.grpc.Inventory.Items>) responseObserver);
          break;
        case METHODID_GET_ITEM_BY_ID:
          serviceImpl.getItemByID((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<mfe.ch03.grpc.Inventory.Item>) responseObserver);
          break;
        case METHODID_ADD_ITEM:
          serviceImpl.addItem((mfe.ch03.grpc.Inventory.Item) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
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

  private static abstract class InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return mfe.ch03.grpc.Inventory.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventoryService");
    }
  }

  private static final class InventoryServiceFileDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier {
    InventoryServiceFileDescriptorSupplier() {}
  }

  private static final class InventoryServiceMethodDescriptorSupplier
      extends InventoryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventoryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InventoryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryServiceFileDescriptorSupplier())
              .addMethod(METHOD_GET_ITEM_BY_NAME)
              .addMethod(METHOD_GET_ITEM_BY_ID)
              .addMethod(METHOD_ADD_ITEM)
              .build();
        }
      }
    }
    return result;
  }
}
