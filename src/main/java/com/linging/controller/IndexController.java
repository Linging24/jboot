package com.linging.controller;

import com.alibaba.fastjson.JSON;
import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import com.linging.service.UserService;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @author Linging
 * @version 1.0.0
 * @since 1.0
 */
@RequestMapping("/")
public class IndexController extends JbootController {

    @Inject
    private UserService userService;

    public void index(){
        renderText("hello Jboot!!!");
    }

    public void findUserById(){
        List<Record> records = Db.find("select *from user where id = ?", 1);
        System.out.println(records);
        renderText(JSON.toJSONString(records.toArray()));
    }

    public void findAllUser(){
        renderJson(userService.findAll());
    }

}

