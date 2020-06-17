package com.s.dao.mapper;

import com.s.dao.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author Administrator
 * @Date 2020/6/16 0016 下午 8:58
 * @Version 1.0
 */
public interface UserMapper {
    public List<User> allUsers();
}
