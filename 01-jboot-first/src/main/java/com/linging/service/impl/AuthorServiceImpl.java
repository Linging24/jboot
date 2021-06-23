package com.linging.service.impl;

import io.jboot.aop.annotation.Bean;
import com.linging.service.AuthorService;
import com.linging.model.Author;
import io.jboot.service.JbootServiceBase;


@Bean
public class AuthorServiceImpl extends JbootServiceBase<Author> implements AuthorService {

}