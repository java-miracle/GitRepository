package com.fh.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Value("${server.port}")
    private String port;

    @Override
    public String test() {
        return "my port is ：" + port;
    }
}
