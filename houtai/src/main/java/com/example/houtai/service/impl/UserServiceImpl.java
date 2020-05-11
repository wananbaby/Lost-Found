package com.example.houtai.service.impl;

import com.example.houtai.convertor.ImgConvertor;
import com.example.houtai.convertor.UserConvertor;
import com.example.houtai.houtai.dto.ImgReadDTO;
import com.example.houtai.houtai.request.ImgRequest;
import com.example.houtai.houtai.request.LoginRequest;
import com.example.houtai.houtai.request.RegisterRequest;
import com.example.houtai.houtai.request.SoRequest;
import com.example.houtai.houtai.response.ImgReadResponse;
import com.example.houtai.houtai.response.RegisterResponse;
import com.example.houtai.houtai.response.UserResponse;
import com.example.houtai.domain.Img;
import com.example.houtai.domain.User;
import com.example.houtai.mapper.UserMapper;
import com.example.houtai.mapper.criteria.LoginStatusCriteria;
import com.example.houtai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    //登录验证
    @Override
    public UserResponse login(LoginRequest request) {
        UserResponse response = new UserResponse();

        String userName = request.getLoginDTO().getUserName();
//        System.out.println(userName);

        String userPassword = request.getLoginDTO().getUserPassword();
//        System.out.println(userPassword);

        LoginStatusCriteria loginStatusCriteria = userMapper.login(userName);
        String userPassword2 = loginStatusCriteria.getUserPassword();
        Integer type = loginStatusCriteria.getType();
        if (userPassword2.equals(userPassword)){
//            System.out.println("success");
            response.setLoginStatus("success");
            response.setUserName(userName);
            response.setType(type);
        }else {
//            System.out.println("error");
            response.setLoginStatus("error");
            response.setUserName(userName);
            response.setType(null);
        }
        return response;
    }

    /**
     * 注册验证
     * @param request
     * @return
     */
    @Override
    public RegisterResponse register(RegisterRequest request) {
        RegisterResponse response = new RegisterResponse();
        String userName = request.getUserDTO().getUserName();
//        System.out.println(userName);
        User user = UserConvertor.convert2User(request.getUserDTO());
        String checkName = userMapper.checkName(userName);

        if (checkName==null){
            System.out.println("名字未存在");
            userMapper.Register(user);
            response.setRegisterStatus("success");
            response.setUserName(userName);
        }else {
            System.out.println("名字已存在");
            response.setRegisterStatus("error-已存在");
            response.setUserName(userName);
        }
        return response;
    }

    @Override
    public ImgReadResponse imgRequest(ImgRequest request) {
        List<Img> imgList = userMapper.imgRead();
        ImgReadResponse response = new ImgReadResponse();
        /**
         *     private Map<Integer, ImgReadDTO> imgMap = new HashMap<>();
         */
        Map<Integer, ImgReadDTO> map = new HashMap<>();

        int l = imgList.size();
        response.setSize(l);
        for (int i =0;i<l;i++){
            ImgReadDTO imgReadDTO = ImgConvertor.convert2ImgReadDTO(imgList.get(i));
            map.put(i,imgReadDTO);
        }
        response.setImgMap(map);
        return response;

    }

    @Override
    public ImgReadResponse so(SoRequest request) {
        List<Img> imgList = userMapper.so(request.getText());
        ImgReadResponse response = new ImgReadResponse();
        /**
         *     private Map<Integer, ImgReadDTO> imgMap = new HashMap<>();
         */
        Map<Integer, ImgReadDTO> map = new HashMap<>();

        int l = imgList.size();
        response.setSize(l);
        for (int i =0;i<l;i++){
            ImgReadDTO imgReadDTO = ImgConvertor.convert2ImgReadDTO(imgList.get(i));
            map.put(i,imgReadDTO);
        }
        response.setImgMap(map);
        return response;
    }


//    @Override
//    public void update(User user) {
//        userMapper.update(user);
//    }
}
