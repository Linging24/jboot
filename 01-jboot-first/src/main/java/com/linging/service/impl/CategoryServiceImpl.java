package com.linging.service.impl;

import io.jboot.aop.annotation.Bean;
import com.linging.service.CategoryService;
import com.linging.model.Category;
import io.jboot.service.JbootServiceBase;


@Bean
public class CategoryServiceImpl extends JbootServiceBase<Category> implements CategoryService {

}