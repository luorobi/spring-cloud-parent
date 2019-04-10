package com.luocx.eurekaribbonclient.controller;

import com.luocx.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-10
 * @since 1.0
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;

    @Autowired
    private LoadBalancerClient loadBalancer;

    @GetMapping("/hi")
    public String hi(@RequestParam(required = false, defaultValue = "luocx") String name) {
        return ribbonService.hi(name);
    }



    @GetMapping("/testRibbon")
    public String testRibbon() {
        ServiceInstance instance = loadBalancer.choose("eureka-client");
        return instance.getHost() + ":" + instance.getPort();
    }
}
