
## Running the Java gRPC Client for Inventory Service

- You can invoke the inventory service via Java gRPC client by running: 
``` mvn exec:java -Dexec.mainClass="mfe.ch03.grpc.InventoryClient" ```

- You should see the following output upon the successful invocation of the service. 
``` 
... 
Response : Sample Inventory Item Desc for 123
... 

```