package wood.mike.sbgrpcserver;

import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import wood.mike.HelloReply;
import wood.mike.HelloRequest;
import wood.mike.SimpleServiceGrpc;

@Service
public class GrpcServerService extends SimpleServiceGrpc.SimpleServiceImplBase {
    private static final Logger logger = LoggerFactory.getLogger(GrpcServerService.class);

    @Override
    public void sayHi(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        logger.info("Received request: {}", request);
        HelloReply reply = HelloReply.newBuilder().setMessage("Hi " + request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
