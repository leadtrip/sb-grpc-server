### Spring boot gRPC server

One client for this server is [this micronaut app](https://github.com/leadtrip/mn-grpc-client).

The proto definitions are stored in a private [repsy](https://repsy.io/) maven repo. \
To build this app you need to specify the credentials so the proto artefact can be fetched.
```
export REPSY_USERNAME="your_username"
export REPSY_PASSWORD="your_password"
./gradlew build
```
The associated repo is [proto-definitions](https://github.com/leadtrip/proto-definitions).

Fire up the app\
`./gradle bootRun`

Test with grpcurl, install with `sudo snap install --edge grpcurl`\
`grpcurl -d '{"name":"Mike"}' -plaintext localhost:50052 wood.mike.SimpleService.sayHi`

