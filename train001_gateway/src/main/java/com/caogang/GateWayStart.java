package com.caogang;

import com.caogang.config.MyKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author: xiaogang
 * @date: 2019/8/4 - 21:05
 */
@SpringBootApplication
public class GateWayStart {

    public static void main(String[] args){

        SpringApplication.run(GateWayStart.class,args);

        System.out.println("GateWay网关服务...");

    }

    @Bean(name = "getMyKeyResolver")
    public MyKeyResolver getMyKeyResolver(){

        return new MyKeyResolver();

    }

}
