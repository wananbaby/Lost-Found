package com.example.houtai.domain;

import com.baidu.aip.imageclassify.AipImageClassify;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.json.JSONObject;

import java.util.HashMap;
@Data
@EqualsAndHashCode(callSuper = false)
public class Sample {

    //设置APPID/AK/SK
    public static final String APP_ID = "18476179";
    public static final String API_KEY = "Rf7XwAyIiPPTwOILZiTExPA5";
    public static final String SECRET_KEY = "rdi21TQUldjUtBs0sZSbw62ujzxTrIlS";

//    public static void main(String[] args) {
//        // 初始化一个AipImageClassify
//        AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
        // 可选：设置网络连接参数
//        client.setConnectionTimeoutInMillis(2000);
//        client.setSocketTimeoutInMillis(60000);
        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
//        client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
//        client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 调用接口
//        HashMap<String, String> options = new HashMap<String, String>();
//        options.put("baike_num", "5");
//        String path = "E:\\image\\640.jpg";
//        JSONObject res = client.objectDetect(path, options);
//        System.out.println(res.toString(2));

//    }
}
