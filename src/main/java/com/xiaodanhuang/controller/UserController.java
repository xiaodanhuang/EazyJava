package com.xiaodanhuang.controller;

import com.xiaodanhuang.entity.User;
import com.xiaodanhuang.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    DbService dbService;
    @RequestMapping("api/queryBymanagerName")
    @ResponseBody
    public User queryBymanagerName(String name,String password) {
        User user = dbService.queryBymanagerName(name,password);
        return user;
    }
    @RequestMapping("api/managePasswordUpdate")
    @ResponseBody
    public int  manageStudentUpdate(int id,String username,String password) {
        int managerUpdate = dbService.managePasswordUpdate(id,username,password);
        return managerUpdate;
    }
    @RequestMapping("api/queryBystuName")
    @ResponseBody
    public User queryBystuName(String name,String password) {
        User user = dbService.queryBystuName(name,password);
        return user;
    }
    @RequestMapping("api/queryByteaName")
    @ResponseBody
    public User queryByteaName(String name,String password) {
        User user = dbService.queryByteaName(name,password);
        return user;
    }

}
