package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    User getUserById(int id);
    Map<String,Object> getUserMapById(int id);
    int addUser(User user);
    int addMapUser(Map<String,Object> map);
    int updateUser(User user);
    int updateMapUser(Map<String,Object> map);

    int delUser(int id);
}
