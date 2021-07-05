package com.cool.jacocotest;

import com.cool.jacocotest.service.AddService;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;

import javax.annotation.Resource;

/**
 * @Author: lxx
 * @Date: 2021/7/2 4:12 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestService {
    @Resource
    private AddService addService;
    @Test
    public void testJacoco(){
        System.out.println(addService.addTwo(1,2));
    }
}
