package com.chen;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chen.mapper")
public class CloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderApplication.class, args);
    }


    // 注入配置文件上下文 动态刷新  @value 貌似不支持动态刷新
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping(value = "/getBook/{id}")
    public Object getBook(@PathVariable Integer id) {
        System.out.println("<><><><><><><>");
        return "当前实例-------> A" + "当前端口------->" + applicationContext.getEnvironment().getProperty("server.port");
    }
}
