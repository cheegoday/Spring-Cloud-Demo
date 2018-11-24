package com.example.productService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private Environment environment;
    ProductService productService = new ProductService();

    @RequestMapping("/products")
    public List<Product> getAll() {
        System.out.println(environment.getProperty("from"));
        List<Product> results = productService.getAllProducts();
        return results;
    }

    @RequestMapping("/product/{pid}")
    public Product getProductById(@PathVariable String pid) {
        System.out.println("===start===");
        System.out.println(environment.getProperty("server.port"));
        System.out.println("===end===");
        Product results = productService.getProductInfo(pid);
        return results;
    }
}
