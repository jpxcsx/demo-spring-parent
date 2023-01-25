package com.csx.springboot.integrate.swagger3.controller;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cuisongxu
 * @date 2022/12/26 17:28
 */

@Tag(name="测试控制器")
@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
