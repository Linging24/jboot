package com.linging.service.impl;

import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Db;
import com.linging.service.ArticleService;
import com.linging.service.AuthorService;
import com.linging.service.CategoryService;
import io.jboot.aop.annotation.Bean;
import com.linging.model.Article;
import io.jboot.service.JbootServiceBase;

import java.util.List;


@Bean
public class ArticleServiceImpl extends JbootServiceBase<Article> implements ArticleService {

    @Inject
    private AuthorService authorService;

    @Inject
    private CategoryService categoryService;

    /**
     * 查询所有文章，及文章的作者，文章所属的分类
     */

    @Override
    public void findBy() {


    }


    @Override
    public List<Article> findListWithAuthorAndCategories() {
        List<Article> articles = DAO.findAll();

        // 查询出每篇文章的作者
//        authorService.join(articles,"author_id");
        // 查询文章的所属分类
//        categoryService.joinManyByTable(articles,"article_category","article_id","category_id");
        return null;
    }
}