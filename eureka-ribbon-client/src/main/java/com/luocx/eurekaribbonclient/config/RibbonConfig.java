package com.luocx.eurekaribbonclient.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author <a href="mailto:luo1@vip.qq.com">格格抖</a>
 * @version 1.0 2019-04-10
 * @since 1.0
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
