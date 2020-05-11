package com.example.houtai.boot;

import javax.servlet.http.HttpServletRequest;

public class RequestHolder {
    private static final ThreadLocal<bsUser> userOnHolder = new ThreadLocal<bsUser>();

    private static final ThreadLocal<HttpServletRequest> requestHolder = new ThreadLocal<>();
    public static void add(bsUser bsUser){
        userOnHolder.set(bsUser);
    }

    public static void add(HttpServletRequest request){
        requestHolder.set(request);
    }

    public static bsUser getCurrentUser() {
        bsUser user = userOnHolder.get();
//        String env = System.getProperty(SpringBootRunner.SPRING_PROFILE_KEY);
        if (user == null ) {
            user = new bsUser();
            user.setUserId(1l);
            user.setUserName("admin");
        }
        return user;
    }
    public static void remove(){
        userOnHolder.remove();
        requestHolder.remove();
    }

}
