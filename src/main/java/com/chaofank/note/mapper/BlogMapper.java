package com.chaofank.note.mapper;

import com.chaofank.note.bean.MarkdownBlog;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by shenfe on 8/30/2016.
 */
public interface BlogMapper {
    @Select("SELECT * FROM blog WHERE id = #{blogId}")
    MarkdownBlog getBlog(@Param("blogId") int blogId);
}
