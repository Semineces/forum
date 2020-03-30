package com.xupt.forum.mapper;

import com.xupt.forum.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: forum
 * @author: Semineces
 * @create: 2020-03-30 18:51
 */
@Mapper
@Repository
public interface UserMapper {

    @Select("select * from `user`")
    List<User> getUsers();
}
