package com.luocx.eurekaribbonclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-10
 * @since 1.0
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

    public String hi(String name){
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }
}
