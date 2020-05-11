package com.example.houtai.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Sms {

    int appid = 1400349795;
    String appkey = "a56b0408db01438f3ca33f0a3397b57d";
    String[] phoneNumbers = {"17621094432","18916227355"};

    int templateId = 593651;

    String smsSign = "小资美好生活指南";

}
