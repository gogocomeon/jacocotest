package com.cool.jacocotest.controller;

import com.cool.jacocotest.service.AddService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: lxx
 * @Date: 2021/7/2 3:35 下午
 */

@RestController
@ResponseBody
//配置相关接口
@RequestMapping(value = "/item")

public class MathController {
@Resource
    private AddService addService;

    @PostMapping(value = "/add")
    public int addItem(
            @RequestParam(value = "intA",required = false) int intA,
            @RequestParam(value = "intB",required = false) int intB
    ){
        return addService.addTwo(intA,intB);
    }


}
