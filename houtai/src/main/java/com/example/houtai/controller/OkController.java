package com.example.houtai.controller;


import com.example.houtai.domain.Wupin;
import com.example.houtai.houtai.response.ResponseDTO;
import com.example.houtai.domain.Renling;
import com.example.houtai.houtai.request.OkRequest;
import com.example.houtai.service.RenlingService;
import com.example.houtai.service.WupinService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/ok")
public class OkController {

    @Autowired
    private RenlingService renlingService;
    public OkController(RenlingService renlingService){
        this.renlingService = renlingService;
    }
    @Autowired
    private WupinService wupinService;

    @ResponseBody
    @PostMapping("/okRenling")
    @ApiOperation(value = "认领")
    public ResponseDTO okRenling(OkRequest request)throws NullPointerException{
        Wupin wupin = new Wupin();
        wupin.setName(request.getName());
        List<Wupin> wupins = wupinService.queryByAll(wupin);
        Renling renling = new Renling();
        renling.setWupinid(wupins.get(0).getId());
        renling.setName(request.getName());
        renling.setClaimantid(request.getUserId().intValue());
        renlingService.insert(renling);
        return new ResponseDTO();
    }

}
