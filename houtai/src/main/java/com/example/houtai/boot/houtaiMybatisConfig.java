package com.example.houtai.boot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.houtai.mapper")
public class houtaiMybatisConfig {
}
