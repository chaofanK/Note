package com.chaofank.note.service;

import com.chaofank.note.bean.MarkdownBlog;

import java.util.List;

/**
 * Created by Kevin on 2016-08-28.
 */
public interface BlogService {
    MarkdownBlog getBlog(String id);
    List<MarkdownBlog> getBlogList();
}
