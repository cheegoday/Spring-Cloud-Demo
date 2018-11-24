package com.example.storeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import java.util.List;

@Service
public class StoreService {
    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    RestTemplate restTemplate;





    public Product getPorductInfo(String pid) {
//        List<ServiceInstance> productServiceList = discoveryClient.getInstances("productService");
//        ServiceInstance productService = productServiceList.get(0);
//        String url = productService.getUri() + "/product/" + pid;
        String url = "http://productService/product/"+pid;
        Product product = restTemplate.getForObject(url, Product.class);
        return product;

    }

    public StoreService() {

    }
}
