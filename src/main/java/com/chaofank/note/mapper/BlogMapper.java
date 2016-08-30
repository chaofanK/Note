package com.chaofank.note.mapper;

import com.chaofank.note.bean.MarkdownBlog;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by shenfe on 8/30/2016.
 */
public interface BlogMapper {
    @Results(id = "markdownBlog", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "title", column = "title"),
            @Result(property = "content", column = "content"),
            @Result(property = "dateCreated", column = "date_created"),
            @Result(property = "lastModified", column = "last_modified_date")
    })
    @Select("SELECT * FROM blog WHERE id = #{blogId}")
    MarkdownBlog getBlog(@Param("blogId") int blogId);
}
