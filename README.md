### Spring boot GRPC server

`./gradle bootRun`

`grpcurl -d '{"name":"Mike"}' -plaintext localhost:50052 wood.mike.SimpleService.sayHi`

