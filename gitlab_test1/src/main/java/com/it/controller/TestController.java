package com.it.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: XiaoHe
 * @Date: 2023/03/16   14:21
 * @Description:
 */
@RestController
@RequestMapping("/index")
public class TestController {

    @GetMapping ("/str")
    public String str(){
        return "Hello,world!!!";
    }

}
