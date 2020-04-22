package cn.jiyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//标明是springboot启动入口 每个项目只要一个
public class Starter {

    public static void main(String[] args) {
        SpringApplication.run(Starter.class,args);
    }

}
