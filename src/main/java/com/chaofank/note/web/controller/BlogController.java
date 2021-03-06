package com.chaofank.note.web.controller;

import com.chaofank.note.bean.MarkdownBlog;
import com.chaofank.note.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public MarkdownBlog Note(@PathVariable int id) {
        return blogService.getBlog(id);
    }

    @RequestMapping(value = "/notes")
    @ResponseBody
    public List<MarkdownBlog> getNoteList() {
        return blogService.getBlogList();
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseBody
    public MarkdownBlog createNote(@RequestBody MarkdownBlog blog) {
        System.out.println(blog);
        return blog;
    }
}
