package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.mybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class userMapperTest {
    @Test
    public void test(){

        SqlSession sqlSession = mybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        List<User> userList = mapper.getUserList();
        
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void addUser(){

        SqlSession sqlSession = mybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        mapper.addUser(new User(5,"soule", "goodman"));
        sqlSession.commit();
        sqlSession.close();


    }
    @Test
    public void addUser2(){

        SqlSession sqlSession = mybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("mpid",9);
        map.put("mpname","good");

        mapper.addUser2(map);
        sqlSession.commit();
        sqlSession.close();


    }
    @Test
    public  void selectById(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        User user = mapper.getUserById(3);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        mapper.updateUser(new User(1,"reed","isgood"));
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void updateUser2(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("mpid", 2);
        map.put("mpname","verygood");
        mapper.updateUser2(map);

        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = mybatisUtils.getSqlSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        mapper.deleteUser(1);
        sqlSession.commit();
        sqlSession.close();
    }
}
