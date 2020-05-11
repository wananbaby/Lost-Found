package com.example.houtai.convertor;

import com.example.houtai.houtai.dto.UserDTO;
import com.example.houtai.domain.User;

public class UserConvertor {

    public static User convert2User(UserDTO userDTO){
        User user = new User();
        user.setId(1);
        user.setUserName(userDTO.getUserName());
        user.setUserPassword(userDTO.getUserPassword());
        user.setType(userDTO.getType());
        return user;
    }
}
