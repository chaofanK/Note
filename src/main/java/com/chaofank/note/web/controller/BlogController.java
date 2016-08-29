package com.chaofank.note.web.controller;

import com.chaofank.note.bean.MarkdownBlog;
import com.chaofank.note.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Kevin on 2016-08-28.
 */
@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/note/{id}")
    @ResponseBody
    public MarkdownBlog Note(@PathVariable String id) {
        return blogService.getBlog(id);
    }

    @RequestMapping(value = "/notes")
    @ResponseBody
    public List<MarkdownBlog> getNoteList() {
        return blogService.getBlogList();
    }
}
