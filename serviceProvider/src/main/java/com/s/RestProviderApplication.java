package com.s;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Administrator
 * @Date 2020/5/31 0031 下午 10:10
 * @Version 1.0
 */
@SpringBootApplication(scanBasePackages = "com.s")
@MapperScan("com.s.dao.mapper")
// 向注册中心注册微服务
@EnableServiceComb
public class RestProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestProviderApplication.class, args);
    }
}