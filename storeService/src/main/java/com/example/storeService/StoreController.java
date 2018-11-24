package com.example.storeService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableCircuitBreaker
public class StoreController {

    @Autowired
    StoreService storeService;

    @RequestMapping("/petstore/product/{productId}")
    @HystrixCommand(fallbackMethod = "getPorductInfo2Fallbacke")
    public Product getProductInfo(@PathVariable String productId) {
        return storeService.getPorductInfo(productId);
    }

    public Product getPorductInfo2Fallbacke(@PathVariable String productId) {
        Product product = new Product() {
            {
                setDesc("aaa");
                setId("bbb");
                setName("ccc");
                setPrice(111);
                setStore(222);
            }
        };
        return product;
    }

}
