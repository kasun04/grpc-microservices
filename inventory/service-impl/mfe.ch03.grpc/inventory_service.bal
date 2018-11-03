import ballerina/grpc;
import ballerina/io;

endpoint grpc:Listener listener {
    host:"localhost",
    port:9000
};

@grpc:ServiceConfig

service InventoryService bind listener {

    getItemByName(endpoint caller, string value) {
        // Implementation goes here.

        // You should return a Items
    }
    getItemByID(endpoint caller, string value) {
        // Implementation goes here.
        Item requested_item; 

        // Creating a dummy inventory item 
        requested_item.id = value; 
        requested_item.name = "Sample Inventory Item " + value ; 
        requested_item.description = "Sample Inventory Item Desc for " + value; 
        
        _ = caller->send(requested_item); 
        _ = caller->complete(); 
        // You should return a Item
    }
    addItem(endpoint caller, Item value) {
        // Implementation goes here.

        // You should return a boolean
    }
}

