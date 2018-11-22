/**
 * Project Name:xingxuejie_springCloudClientTest
 * File Name:ServiceAController.java
 * Package Name:xingxuejie_springCloudClientTest
 * Date:2018年11月12日下午2:18:20
 * Copyright (c) 2018, xingxuejie@oristartech.com All Rights Reserved.
*/

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:ServiceAController 
 * Function: TODO ADD FUNCTION.
 * Date:     2018年11月12日 下午2:18:20 
 * @author   xingxuejie
 * @since    JDK 1.8
 */
@RestController
public class ServiceAController {

    @RequestMapping("/info")
    public String testA() {
        return "hello I am is service A"; //测试代码直接返回一个字符串，不再调用service层等等。
    }
}

