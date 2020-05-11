package com.example.houtai.controller;

import com.example.houtai.houtai.request.ImgRequest;
import com.example.houtai.houtai.request.LoginRequest;
import com.example.houtai.houtai.request.RegisterRequest;
import com.example.houtai.houtai.request.SoRequest;
import com.example.houtai.houtai.response.ImgReadResponse;
import com.example.houtai.houtai.response.RegisterResponse;
import com.example.houtai.houtai.response.UserResponse;
import com.example.houtai.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@CrossOrigin
@RestController
@RequestMapping("/wexin")
@Api(tags = {"houtaiController"})
public class houtaiController {

//    @RequestMapping("/zys")
    @GetMapping("/zys")
    public String zys(){
        return "zys";
    }


//    @Reference
//    private UserFacade userFacade;

    @Autowired
    private UserService userService;
    public houtaiController(UserService userService){
        this.userService = userService;
    }

//    @ResponseBody
//    @RequestMapping(path = "/testzys",method = RequestMethod.POST)
//    public void zys(String name,String password){
//        System.out.println(name);
//        System.out.println(password);
//    }

//    @ResponseBody
//    @RequestMapping(path = "/UserLogin",method = RequestMethod.POST)
//    public UserResponse UserLogin(@RequestParam(value = "UserName") String UserName,@RequestParam(value = "UserPassword") String UserPassword){
//
//        System.out.println(UserName);
//        System.out.println(UserPassword);
//
//        return null;
//    }

    @ResponseBody
    @RequestMapping(path = "/UserLogin",method =RequestMethod.POST )
    @ApiOperation(value = "登录")
    public UserResponse UserLogin(@RequestBody LoginRequest request){
        UserResponse response = userService.login(request);
       return response;
    }


    @ResponseBody
    @ApiOperation(value = "注册")
    @PostMapping(value = "/UserRegister",produces = "application/json;charset=UTF-8")
    public RegisterResponse UserRegister(@RequestBody RegisterRequest request){
//        System.out.println(request.getUserDTO().getUserName());
        return userService.register(request);
    }

    @ResponseBody
    @ApiOperation(value = "浏览图片")
    @PostMapping(value = "/ImgRequest")
    public ImgReadResponse ImgRequest(@RequestBody ImgRequest request){
        System.out.println("sss");
        return userService.imgRequest(request);
    }
    @ResponseBody
    @ApiOperation(value = "so")
    @PostMapping(value = "/soso")
    public ImgReadResponse soso(@RequestBody SoRequest request){
        System.out.println("sss");
        return userService.so(request);
    }




}
