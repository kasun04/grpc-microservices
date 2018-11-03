import ballerina/grpc;
import ballerina/io;

public type InventoryServiceBlockingStub object {
    public grpc:Client clientEndpoint;
    public grpc:Stub stub;

    function initStub (grpc:Client ep) {
        grpc:Stub navStub = new;
        navStub.initStub(ep, "blocking", DESCRIPTOR_KEY, descriptorMap);
        self.stub = navStub;
    }
    
    function getItemByName (string req, grpc:Headers? headers = ()) returns ((Items, grpc:Headers)|error) {
        
        var unionResp = self.stub.blockingExecute("mfe.ch03.grpc.InventoryService/getItemByName", req, headers = headers);
        match unionResp {
            error payloadError => {
                return payloadError;
            }
            (any, grpc:Headers) payload => {
                grpc:Headers resHeaders;
                any result;
                (result, resHeaders) = payload;
                return (check <Items>result, resHeaders);
            }
        }
    }
    
    function getItemByID (string req, grpc:Headers? headers = ()) returns ((Item, grpc:Headers)|error) {
        
        var unionResp = self.stub.blockingExecute("mfe.ch03.grpc.InventoryService/getItemByID", req, headers = headers);
        match unionResp {
            error payloadError => {
                return payloadError;
            }
            (any, grpc:Headers) payload => {
                grpc:Headers resHeaders;
                any result;
                (result, resHeaders) = payload;
                return (check <Item>result, resHeaders);
            }
        }
    }
    
    function addItem (Item req, grpc:Headers? headers = ()) returns ((boolean, grpc:Headers)|error) {
        
        var unionResp = self.stub.blockingExecute("mfe.ch03.grpc.InventoryService/addItem", req, headers = headers);
        match unionResp {
            error payloadError => {
                return payloadError;
            }
            (any, grpc:Headers) payload => {
                grpc:Headers resHeaders;
                any result;
                (result, resHeaders) = payload;
                return (check <boolean>result, resHeaders);
            }
        }
    }
    
};

public type InventoryServiceStub object {
    public grpc:Client clientEndpoint;
    public grpc:Stub stub;

    function initStub (grpc:Client ep) {
        grpc:Stub navStub = new;
        navStub.initStub(ep, "non-blocking", DESCRIPTOR_KEY, descriptorMap);
        self.stub = navStub;
    }
    
    function getItemByName (string req, typedesc listener, grpc:Headers? headers = ()) returns (error?) {
        
        return self.stub.nonBlockingExecute("mfe.ch03.grpc.InventoryService/getItemByName", req, listener, headers = headers);
    }
    
    function getItemByID (string req, typedesc listener, grpc:Headers? headers = ()) returns (error?) {
        
        return self.stub.nonBlockingExecute("mfe.ch03.grpc.InventoryService/getItemByID", req, listener, headers = headers);
    }
    
    function addItem (Item req, typedesc listener, grpc:Headers? headers = ()) returns (error?) {
        
        return self.stub.nonBlockingExecute("mfe.ch03.grpc.InventoryService/addItem", req, listener, headers = headers);
    }
    
};


public type InventoryServiceBlockingClient object {
    public grpc:Client client;
    public InventoryServiceBlockingStub stub;

    public function init (grpc:ClientEndpointConfig config) {
        // initialize client endpoint.
        grpc:Client c = new;
        c.init(config);
        self.client = c;
        // initialize service stub.
        InventoryServiceBlockingStub s = new;
        s.initStub(c);
        self.stub = s;
    }

    public function getCallerActions () returns InventoryServiceBlockingStub {
        return self.stub;
    }
};

public type InventoryServiceClient object {
    public grpc:Client client;
    public InventoryServiceStub stub;

    public function init (grpc:ClientEndpointConfig config) {
        // initialize client endpoint.
        grpc:Client c = new;
        c.init(config);
        self.client = c;
        // initialize service stub.
        InventoryServiceStub s = new;
        s.initStub(c);
        self.stub = s;
    }

    public function getCallerActions () returns InventoryServiceStub {
        return self.stub;
    }
};


type Items record {
    string itemDesc;
    Item[] items;
    
};

type Item record {
    string id;
    string name;
    string description;
    
};


@final string DESCRIPTOR_KEY = "mfe.ch03.grpc.inventory.proto";
map descriptorMap = {
"mfe.ch03.grpc.inventory.proto":"0A0F696E76656E746F72792E70726F746F120D6D66652E636830332E677270631A1E676F6F676C652F70726F746F6275662F77726170706572732E70726F746F224E0A054974656D73121A0A086974656D4465736318012001280952086974656D4465736312290A056974656D7318022003280B32132E6D66652E636830332E677270632E4974656D52056974656D73224C0A044974656D120E0A0269641801200128095202696412120A046E616D6518022001280952046E616D6512200A0B6465736372697074696F6E180320012809520B6465736372697074696F6E32D5010A10496E76656E746F72795365727669636512430A0D6765744974656D42794E616D65121C2E676F6F676C652E70726F746F6275662E537472696E6756616C75651A142E6D66652E636830332E677270632E4974656D7312400A0B6765744974656D42794944121C2E676F6F676C652E70726F746F6275662E537472696E6756616C75651A132E6D66652E636830332E677270632E4974656D123A0A076164644974656D12132E6D66652E636830332E677270632E4974656D1A1A2E676F6F676C652E70726F746F6275662E426F6F6C56616C7565620670726F746F33",
"google.protobuf.wrappers.proto":"0A0E77726170706572732E70726F746F120F676F6F676C652E70726F746F62756622230A0B446F75626C6556616C756512140A0576616C7565180120012801520576616C756522220A0A466C6F617456616C756512140A0576616C7565180120012802520576616C756522220A0A496E74363456616C756512140A0576616C7565180120012803520576616C756522230A0B55496E74363456616C756512140A0576616C7565180120012804520576616C756522220A0A496E74333256616C756512140A0576616C7565180120012805520576616C756522230A0B55496E74333256616C756512140A0576616C756518012001280D520576616C756522210A09426F6F6C56616C756512140A0576616C7565180120012808520576616C756522230A0B537472696E6756616C756512140A0576616C7565180120012809520576616C756522220A0A427974657356616C756512140A0576616C756518012001280C520576616C756542570A13636F6D2E676F6F676C652E70726F746F627566420D577261707065727350726F746F50015A057479706573F80101A20203475042AA021E476F6F676C652E50726F746F6275662E57656C6C4B6E6F776E5479706573620670726F746F33"

};
