package com.linging.controller;

import com.alibaba.fastjson.JSONObject;
import com.jfinal.aop.Inject;
import com.jfinal.core.paragetter.Para;
import com.jfinal.plugin.activerecord.Page;
import com.linging.model.User;
import com.linging.model.vo.ResponseVo;
import com.linging.service.UserService;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

import java.io.BufferedReader;
import java.util.List;

/**
 * @author Linging
 * @version 1.0.0
 * @since 1.0
 */
@RequestMapping("/user")
public class UserController extends JbootController {

    @Inject
    private UserService userService;

    /**
     * 查询全部用户
     */
    public void users(){
        renderJson(userService.findAll());
    }
    
    public void findUserById(){
        String id = getPara("id");
        System.out.println(id);
        renderJson(ResponseVo.ok(userService.findById(id)));
    }

    /**
     * 分页查询用户
     */
    public void pageUsers(){
        Integer page = getParaToInt("page");
        Integer pageSize = getParaToInt("pageSize");
        page = page == null ? 1 : page;
        pageSize = pageSize == null ? 5 : pageSize;
        Page<User> userPage = userService.paginate(page, pageSize);
        renderJson(ResponseVo.ok(userPage));
    }

    /**
     * 新增用户
     */
    public void add() throws Exception {
        User user = getRequestObject(User.class);
        userService.save(user);
        renderJson(ResponseVo.ok());
    }

    /**
     * 修改用户
     */
    public void update() throws Exception {
        User user = getRequestObject(User.class);
        userService.update(user);
        renderJson(ResponseVo.ok());
    }


    /**
     * 删除用户
     */
    public void delete(){
        Integer id = getParaToInt("id");
        userService.deleteById(id);
        renderJson(ResponseVo.ok());
    }


    /**
     * 获取Request中的数据
     * @param valueType
     * @param <T>
     * @return
     * @throws Exception
     */
    protected <T> T getRequestObject(Class<T> valueType) throws Exception {
        StringBuilder json = new StringBuilder();
        BufferedReader reader = this.getRequest().getReader();
        String line = null;
        while ((line = reader.readLine()) != null) {
            json.append(line);
        }
        reader.close();
        return JSONObject.parseObject(json.toString(), valueType);
    }
}
