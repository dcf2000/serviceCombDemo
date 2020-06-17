package com.s.service.impl;

import com.s.dao.entity.User;
import com.s.dao.mapper.UserMapper;
import com.s.service.RestService;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Administrator
 * @Date 2020/5/31 0031 下午 10:01
 * @Version 1.0
 */
@RequestMapping("/msgService")
// 定义服务约束id，一个应用可以有多个约束id
@RestSchema(schemaId = "providerDemo")
public class RestServiceImpl implements RestService {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/msgStr")
    @Override
    public String msgStr(String msg) {
        System.out.println("provider-2");
        return "message:" + msg;
    }

    @GetMapping("/msgMap")
    @Override
    @ResponseBody
    public Map<String, Object> msgMap(String msg) {
        Map<String, Object> rst = new HashMap();
        List<User> users = userMapper.allUsers();
        rst.put("status", "1");
        rst.put("message", msg);
        rst.put("data", users);
        return rst;
    }
}
