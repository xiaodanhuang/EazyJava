package com.xiaodanhuang.controller;

import com.xiaodanhuang.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "sbsb";
    }
    @RequestMapping("index")
    public String index() {
        return "query";
    }
    @RequestMapping("json")
    @ResponseBody
    public Map<String, String> json() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "Larry");
        map.put("age", "22");
        return map;
    }
}
