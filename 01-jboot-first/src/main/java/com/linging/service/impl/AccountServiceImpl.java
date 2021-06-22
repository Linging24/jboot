package com.linging.service.impl;

import io.jboot.aop.annotation.Bean;
import com.linging.service.AccountService;
import com.linging.model.Account;
import io.jboot.service.JbootServiceBase;


@Bean
public class AccountServiceImpl extends JbootServiceBase<Account> implements AccountService {

}