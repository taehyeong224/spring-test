package dao;

import model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE idx = #{userId}")
    User getUser(@Param("userId") Integer userId);
}