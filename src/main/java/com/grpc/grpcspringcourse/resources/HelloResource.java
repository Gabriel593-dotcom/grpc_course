package com.grpc.grpcspringcourse.resources;

import com.grpc.grpcspringcourse.HelloReq;
import com.grpc.grpcspringcourse.HelloServiceGrpc;
import com.grpc.grpcspringcourse.Res;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloResource extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(HelloReq request, StreamObserver<Res> responseObserver) {
        var response = Res.newBuilder().setMessage(request.getMessage()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
