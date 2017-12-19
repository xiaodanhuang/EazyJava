package com.xiaodanhuang.service.impl;
import com.xiaodanhuang.dao.UserDao;
import com.xiaodanhuang.entity.User;
import com.xiaodanhuang.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DbServiceImp implements DbService {
    @Autowired
    private UserDao userDao;

    public User  queryBymanagerName(String name,String password) {
        return userDao.queryBymanagerName(name,password);
    }
    public int managePasswordUpdate(
            int  id,
            String username,
            String password
    ){
        return userDao.managePasswordUpdate(id, username, password);
    }
    public User  queryByteaName(String name,String password) {
        return userDao.queryByteaName(name,password);
    }
    public User  queryBystuName(String name,String password) {
        return userDao.queryBystuName(name,password);
    }

}
