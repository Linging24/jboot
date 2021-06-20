package com.linging.service.impl;

import io.jboot.aop.annotation.Bean;
import com.linging.service.ItemsService;
import com.linging.model.Items;
import io.jboot.service.JbootServiceBase;


@Bean
public class ItemsServiceImpl extends JbootServiceBase<Items> implements ItemsService {

}