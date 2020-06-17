package com.s;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Administrator
 * @Date 2020/6/1 0001 下午 10:58
 * @Version 1.0
 */
@SpringBootApplication
@EnableServiceComb
public class RestConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestConsumerApplication.class, args);
    }
}
