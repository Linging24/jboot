package com.linging.service;

import com.google.common.collect.Lists;
import com.linging.api.BlogService;
import io.jboot.components.rpc.annotation.RPCBean;

import java.util.List;

@RPCBean
public class BlogServiceProvider implements BlogService {

    @Override
    public String findById() {
        return "id from provider";
    }

    @Override
    public List<String> findAll() {
        return Lists.newArrayList("item1","item2");
    }
}