package mfe.ch03.grpc;

import com.google.protobuf.StringValue;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class InventoryClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 9000)
                .usePlaintext()
                .build();

        InventoryServiceGrpc.InventoryServiceBlockingStub stub
                = InventoryServiceGrpc.newBlockingStub(channel);

        Inventory.Item item = stub.getItemByID(StringValue.newBuilder().setValue("123").build());
        System.out.println("Response : " + item.getDescription());
    }
}
