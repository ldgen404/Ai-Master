package com.ldgen.ldgenaimaster;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
@MapperScan("com.ldgen.ldgenaimaster.mapper")
public class LdgenAiMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LdgenAiMasterApplication.class, args);
    }

}
