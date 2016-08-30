package com.chaofank.note.service.impl;

import com.chaofank.note.bean.MarkdownBlog;
import com.chaofank.note.mapper.BlogMapper;
import com.chaofank.note.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kevin on 2016-08-28.
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogMapper blogMapper;

    public MarkdownBlog getBlog(String id) {
        System.out.println("service");
        System.out.println(blogMapper.getBlog(1));
        return null;
    }

    public List<MarkdownBlog> getBlogList() {
        return null;
    }
}
