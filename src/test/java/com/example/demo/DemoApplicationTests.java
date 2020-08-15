package com.example.demo;

import com.example.demo.dal.Product;
import com.example.demo.dal.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    ProductRepository productRepository;

    @Test
    void fakeTests() {
        System.out.println("layth abufarhah");
    }

    @Test
    void addProduct(){
        Product product=new Product();
        product.setName("IPone");
        product.setPrice(100);
        productRepository.save(product);
    }

}
