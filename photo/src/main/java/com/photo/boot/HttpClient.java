package com.photo.boot;



import com.photo.domain.Background;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 021411
 */
public class HttpClient {

    public static final String url = "https://api-cn.faceplusplus.com/humanbodypp/v2/segment";
    public static final String api_key = "R072AefZ4tgM-lYmHdHACd3Y7qao-hgZ";
    public static final String api_secret = "1naEZ2GpIJAvmqjwUkHqyma8KOfPo1-o";

    public static String sendPostRequest(String url, MultiValueMap<String,String> params){

        RestTemplate client = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpMethod method = HttpMethod.POST;
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        HttpEntity<MultiValueMap<String,String>> requestEntity = new HttpEntity<MultiValueMap<String,String>>(params,headers);
        ResponseEntity<String> response = client.exchange(url,method,requestEntity,String.class);
        return response.getBody();
    }

    public static void main(String[] args) {
        Background background = new Background();
        background.setApi_key(api_key);
        background.setApi_secret(api_secret);
        File file = new File("F://tlp.jpg");
        background.setImage_file(file);
        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>(3);
        parameters.set("api_key",background.getApi_key());
        parameters.set("api_secret",background.getApi_secret());
        parameters
        String s = sendPostRequest(url,parameters);
        System.out.println(s);
    }
}
