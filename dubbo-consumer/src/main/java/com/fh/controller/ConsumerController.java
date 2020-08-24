package com.fh.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fh.service.ProviderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Reference
    private ProviderService providerService;

    @RequestMapping("hello")
    public String hello(){
        return providerService.test();
    }

}
