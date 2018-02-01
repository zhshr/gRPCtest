import io.grpc.stub.StreamObserver;
import zhshr.examples.service.ServiceGrpc.ServiceImplBase;
import zhshr.examples.service.ServiceOuterClass;

public class ServiceGrpcImpl extends ServiceImplBase {
    @Override
    public void getFeature(ServiceOuterClass.Point point, StreamObserver<ServiceOuterClass.Point> observer) {
        observer.onNext(point);
        observer.onCompleted();
    }
}