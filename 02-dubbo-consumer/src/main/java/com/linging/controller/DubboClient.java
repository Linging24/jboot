package com.linging.controller;

import com.jfinal.aop.Inject;
import com.linging.api.BlogService;
import io.jboot.app.JbootApplication;
import io.jboot.components.rpc.annotation.RPCInject;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

@RequestMapping("/dubbo")
public class DubboClient extends JbootController {

    @RPCInject
    private BlogService blogService;

    public void index() {
        System.out.println(blogService);
        renderText("blogId : " + blogService.findById());
    }
}