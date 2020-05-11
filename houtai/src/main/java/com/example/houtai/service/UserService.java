package com.example.houtai.service;

import com.example.houtai.houtai.request.ImgRequest;
import com.example.houtai.houtai.request.LoginRequest;
import com.example.houtai.houtai.request.RegisterRequest;
import com.example.houtai.houtai.request.SoRequest;
import com.example.houtai.houtai.response.ImgReadResponse;
import com.example.houtai.houtai.response.RegisterResponse;
import com.example.houtai.houtai.response.UserResponse;
import com.example.houtai.domain.User;

public interface UserService {

    UserResponse login(LoginRequest request);

    RegisterResponse register(RegisterRequest request);

    ImgReadResponse imgRequest(ImgRequest request);

//    void update(User user);
ImgReadResponse so(SoRequest request);
}
