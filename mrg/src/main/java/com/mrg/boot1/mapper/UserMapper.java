package com.mrg.boot1.mapper;

import com.mrg.boot1.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface UserMapper {

    @Select("select * from sys_user")
    List<User> findAll();
    @Insert("insert into sys_user(username,password,nickname,email,phone,address) " +
            "values(#{username},#{password},#{nickname},#{email},#{phone},#{address})")
    int insert(User user);


    int updata(User user);

    @Delete("delete from sys_user where id=#{id}")
    Integer deleteById(@Param("id") Integer id);

    @Select("select * from sys_user limit #{pageNum}, #{pageSize}")
    List<User> findPage(Integer pageNum,Integer pageSize);

    @Select("select count(*) from sys_user")
    Integer selectTotal();
}
