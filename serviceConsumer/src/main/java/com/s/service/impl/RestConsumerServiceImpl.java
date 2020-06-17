package com.s.service.impl;

import com.s.service.RestService;
import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Author Administrator
 * @Date 2020/6/1 0001 下午 10:05
 * @Version 1.0
 */
@Service
public class RestConsumerServiceImpl implements RestService {

    private final RestTemplate restTemplate = RestTemplateBuilder.create();

    @Override
    public String msgStr(String msg) {
        String serviceName = "provider_service";
        String msgStr = restTemplate.getForObject("cse://" + serviceName + "/msgService/msgStr?msg=" + msg, String.class);
        return msgStr;
    }

    @Override
    public Map<String, Object> msgMap(String msg) {
        String serviceName = "provider_service";
        Map<String, Object> msgMap = restTemplate.getForObject("cse://" + serviceName + "/msgService/msgMap?msg=" + msg, Map.class);
        return msgMap;
    }
}
