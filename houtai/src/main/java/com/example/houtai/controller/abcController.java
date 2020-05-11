package com.example.houtai.controller;


import com.example.houtai.boot.ResponseDTO;
import com.example.houtai.houtai.request.SmsRequest;
import com.example.houtai.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/abc")
public class abcController {

    @Autowired
    private SmsService smsService;
    public abcController(SmsService smsService){
        this.smsService = smsService;
    }

    @ResponseBody
    @PostMapping(value = "/Smstest")
    public ResponseDTO Smstest(@RequestBody SmsRequest request){
        smsService.Sms();
        return new  ResponseDTO();
    }
}
