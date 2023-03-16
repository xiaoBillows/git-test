package com.it.controller;


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
public class TestController {

    @RequestMapping("/index")
    public String str(){
        return "Hello,world!!!";
    }

}
