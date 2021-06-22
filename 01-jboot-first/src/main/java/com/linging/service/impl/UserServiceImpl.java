package com.linging.service.impl;

import io.jboot.aop.annotation.Bean;
import com.linging.service.UserService;
import com.linging.model.User;
import io.jboot.service.JbootServiceBase;


@Bean
public class UserServiceImpl extends JbootServiceBase<User> implements UserService {

}