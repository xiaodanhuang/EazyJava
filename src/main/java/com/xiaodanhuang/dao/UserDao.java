package com.xiaodanhuang.dao;

import com.xiaodanhuang.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User queryBymanagerName(@Param("name")String name,@Param("password")String password);
    int managePasswordUpdate(
            @Param("id")int  id,
            @Param("username")String username,
            @Param("password")String password
    );
    User queryByteaName(@Param("name")String name,@Param("password")String password);
    User queryBystuName(@Param("name")String name,@Param("password")String password);
}
