package com.xiaodanhuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HttpController {
    @RequestMapping("http/get")
    @ResponseBody
    public Map<String, String> get(String name, String age) {
        Map<String,String> map = new HashMap<String, String>();
        map.put("userName", name);
        map.put("age", age);
        return map;
    }
}
