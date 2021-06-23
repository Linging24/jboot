package com.linging.controller;

import com.jfinal.aop.Aop;
import com.jfinal.aop.Inject;
import com.linging.model.Article;
import com.linging.service.ArticleService;
import com.linging.service.AuthorService;
import com.linging.service.CategoryService;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

import java.util.List;

/**
 * @author Linging
 * @version 1.0.0
 * @since 1.0
 */
@RequestMapping("/article")
public class ArticleController extends JbootController {

    @Inject
    private ArticleService articleService;




    public void findAll(){
        List<Article> articles = Aop.get(ArticleService.class).findListWithAuthorAndCategories();
        this.articleService.findBy();
    }



}
