package com.chaofank.note.mapper;

import com.chaofank.note.bean.MarkdownBlog;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by shenfe on 8/30/2016.
 */

/**
 * alter table blog change `last_modified_date` `date_last_modified` date;
 */
public interface BlogMapper {
    @Results(id = "markdownBlog", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content"),
            @Result(property = "dateCreated", column = "date_created"),
            @Result(property = "dateLastModified", column = "date_last_modified")
    })
    @Select("SELECT * FROM blog WHERE id = #{blogId}")
    MarkdownBlog getBlog(@Param("blogId") int blogId);

    @ResultMap("markdownBlog")
    @Select("SELECT * FROM blog")
    List<MarkdownBlog> getBlogList();
}
