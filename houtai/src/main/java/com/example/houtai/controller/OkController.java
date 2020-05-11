package com.example.houtai.controller;


import com.example.houtai.boot.ResponseDTO;
import com.example.houtai.domain.Renling;
import com.example.houtai.houtai.request.OkRequest;
import com.example.houtai.service.RenlingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/ok")
public class OkController {

//    @Autowired
//    private RenlingService renlingService;
//
//    public OkController(RenlingService renlingService){
//        this.renlingService = renlingService;
//    }

    @ResponseBody
    @PostMapping("/okRenling")
    @ApiOperation(value = "认领")
    public ResponseDTO okRenling(OkRequest request){
        Renling renling = new Renling();
        renling.setName(request.getName());
        renling.setClaimantid(request.getUserId().intValue());
//        renlingService.insert(renling);
        return new ResponseDTO();
    }

}
