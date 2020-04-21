package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface userMapper {
    List<User> getUserList();

//    create
    public void  addUser(User user);
    public void  addUser2(Map map);
//    read
    User getUserById(int id);
//    update
    boolean updateUser(User user);
    boolean updateUser2(Map map);

// delete
    boolean deleteUser(int id);


}
