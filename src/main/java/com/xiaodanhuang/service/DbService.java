package com.xiaodanhuang.service;

import com.xiaodanhuang.dao.UserDao;
import com.xiaodanhuang.entity.User;

public interface DbService {
    User queryBymanagerName(String name,String password);
    int managePasswordUpdate(
          int  id,
          String username,
          String password
    );
    User queryByteaName(String name,String password);
    User queryBystuName(String name,String password);
}
