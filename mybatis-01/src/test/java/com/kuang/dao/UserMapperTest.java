package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class UserMapperTest {
    @Test
    public void test(){

        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //动态代理？？？反射？？？
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();
            System.out.println(userList);
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void getUserById(){

        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //动态代理？？？反射？？？
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            User user = mapper.getUserById(1);//
            System.out.println(user);//
        } finally {
            sqlSession.close();
        }

    }

    public Map<String,Object> getUserMapById(int i){

        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //动态代理？？？反射？？？
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            Map<String,Object> map = mapper.getUserMapById(i);//
            System.out.println(map);//
            return map;
        } finally {
            sqlSession.close();
        }

    }
@Test
    public void addUser(){

        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //动态代理？？？反射？？？
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int i = mapper.addUser(new User(4,"四","123456"));//
            System.out.println(mapper.getUserList());//
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }

    }
    @Test
    public void addMapUser(){

        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //动态代理？？？反射？？？
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            Map<String, Object> map = new HashMap<>();
            map.put("userId",5);
            map.put("userName", "小五");
            map.put("userPwd","456455");

            int i = mapper.addMapUser(map);//

            System.out.println(mapper.getUserList());//
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void updateUser(){

        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //动态代理？？？反射？？？
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int i = mapper.updateUser(new User(4,"新四","1234566"));//
            System.out.println(mapper.getUserList());//
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }

    }
    @Test
    public void updateMapUser(){

        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //动态代理？？？反射？？？
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            Map<String ,Object> map = getUserMapById(5);
            map.put("userId",5);
            map.put("userName","小五五");
            map.put("userPwd","123456");
            mapper.updateMapUser(map);
            System.out.println(mapper.getUserList());//
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void delUser(){

        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.getSqlSession();
            //动态代理？？？反射？？？
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            int i = mapper.delUser(4);//
            System.out.println(mapper.getUserList());//
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }

    }
}