package com.cool.jacocotest;

import com.cool.jacocotest.service.AddService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class JacocoTestApplicationTests {
    @Resource
    private AddService addService;

    @Test
    void testJacoco(){
        System.out.println(addService.addTwo(1,2));
    }
    @Test
    void contextLoads() {
    }
    @Test

    void testXiaoxin(){
        System.out.println("hello world!");
    }

}
