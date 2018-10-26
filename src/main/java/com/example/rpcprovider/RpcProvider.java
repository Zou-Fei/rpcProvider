package com.example.rpcprovider;

import com.example.rpcprovider.service.HelloService;
import com.example.rpcprovider.service.HelloServiceImpl;

public class RpcProvider{
    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        // RPC框架将服务暴露出来，供客户端消费
        RpcFramework.export(service, 1234);
    }
}
