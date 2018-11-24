package com.example.productService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {

    private Map<String,Product> products = new HashMap<String,Product>();
    public ProductService(){
        products.put("Z0001", new Product("Z0001","IPhone 7","64G",8000,200));
        products.put("Z0002", new Product("Z0002","Huawei P7","32G",2000,100));
        products.put("Z0003", new Product("Z0003","Huawei P8","128G",3000,300));
        products.put("Z0004", new Product("Z0004","SunS Note7","64G",3000,100));
        products.put("Z0005", new Product("Z0005","Mi 7","64G",1000,200));
    }

    public List<Product> getAllProducts(){
        List<Product> list = new ArrayList<Product>();
        for( Product p : this.products.values() ){
            list.add(p);
        };
        return list;
    }

    public Product getProductInfo(String prodID){
        Product product = products.get(prodID);
        if (product!=null)
            return product;
        else
            return new Product();
    }
}
