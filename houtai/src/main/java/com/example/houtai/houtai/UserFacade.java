package com.example.houtai.houtai;


import com.example.houtai.houtai.request.ImgRequest;
import com.example.houtai.houtai.request.LoginRequest;
import com.example.houtai.houtai.request.RegisterRequest;
import com.example.houtai.houtai.response.ImgReadResponse;
import com.example.houtai.houtai.response.RegisterResponse;
import com.example.houtai.houtai.response.UserResponse;

public interface UserFacade {

    public UserResponse login(LoginRequest request);

    public RegisterResponse register(RegisterRequest request);

    public ImgReadResponse imgRead(ImgRequest request);
}
