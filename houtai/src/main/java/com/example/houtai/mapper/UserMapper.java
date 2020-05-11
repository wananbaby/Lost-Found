package com.example.houtai.mapper;

import com.example.houtai.domain.Img;
import com.example.houtai.domain.User;
import com.example.houtai.mapper.criteria.LoginStatusCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component(value = "userMapper")
public interface UserMapper {

//    @Select("select name,password,type from stu.user where name = #{UserName} ")
    LoginStatusCriteria login(String UserName);
//    @Insert("insert into from stu.user(#{UserName},#{UserPassword},#{type})")
    void Register(User user);
//    @Select("select name from stu.user where name=#{UserName}")
    String checkName(String UserName);

//    @Select("select miaoshu,src,remark,UserId from stu.img where 1=1")
    List<Img> imgRead();

    List<Img> so(String text);
//    /**
//     * 修改数据
//     *
//     * @param user 实例对象
//     * @return 影响行数
//     */
//    void update(User user);
//
//    User queryById(String UserName);
}
