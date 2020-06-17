package com.s.controller;

import com.s.service.RestService;
import com.s.service.impl.RestConsumerServiceImpl;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Author Administrator
 * @Date 2020/6/1 0001 下午 10:51
 * @Version 1.0
 */
@Controller
@RestSchema(schemaId = "consumerDemo")
@RequestMapping("/msgTest")
public class RestConsumerController {

    @Autowired
    @Qualifier("restConsumerServiceImpl")
    private RestService restService;

    @GetMapping("/msgStr")
    public String msgStr(String msg){
        return restService.msgStr(msg);
    }

    @GetMapping("/msgMap")
    public Map<String, Object> msgMap(String msg){
        return restService.msgMap(msg);
    }

}
