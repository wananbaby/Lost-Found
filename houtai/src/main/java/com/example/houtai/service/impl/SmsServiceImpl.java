package com.example.houtai.service.impl;

import com.example.houtai.domain.Sms;
import com.example.houtai.service.SmsService;
import com.github.qcloudsms.SmsMultiSender;
import com.example.houtai.domain.Sms;
import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import org.json.JSONException;
import org.springframework.stereotype.Service;

import java.io.IOException;
@Service
public class SmsServiceImpl implements SmsService {

    @Override
    public void Sms() {
        Sms sms = new Sms();
        int appid = sms.getAppid();
        String appkey = sms.getAppkey();
        String[] phoneNumbers = sms.getPhoneNumbers();
        int templateId = sms.getTemplateId();
        String smsSign = sms.getSmsSign();
        try {
            String[] params = {};
            SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
            SmsSingleSenderResult result = ssender.sendWithParam("86", phoneNumbers[0],
                    templateId, params, smsSign, "", "");
            System.out.println(result);
        } catch (HTTPException e) {
            // HTTP 响应码错误
            e.printStackTrace();
        } catch (JSONException e) {
            // JSON 解析错误
            e.printStackTrace();
        } catch (IOException e) {
            // 网络 IO 错误
            e.printStackTrace();
        }
    }
}
