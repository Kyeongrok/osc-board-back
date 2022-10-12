package com.osckorea.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @GetMapping(value = "/articles/new")
    public String newArticleForm() {


        return "articles/new";
    }

    @PostMapping(value = "/articles/create")
    public String createArticle() {

    }
    
}
