package com.it.gitee_maven_test1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: XiaoHe
 * @Date: 2023/03/16   15:16
 * @Description:
 */
@RestController
@RequestMapping("/index")
public class TestController {

    @GetMapping("/str")
    public String str(){
        return "Hello,world!!!你好我的城我的梦，我的西安！ <br> 遇见你总觉得相见恨晚";
    }

}
