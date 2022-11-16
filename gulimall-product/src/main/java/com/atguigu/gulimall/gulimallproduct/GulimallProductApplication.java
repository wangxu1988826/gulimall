package com.atguigu.gulimall.gulimallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 1. 整合mybatis-plus
 * 1）导入依赖
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *  2）配置
 *    1. 配置数据源
 *     1）导入数据库的驱动
 *     2）再application.yml配置数据源相关信息
 *    2. 配置mybatis-plus：
 *     1） 使用@MapperScan
 *     2） 告诉mybatis-plus  sql文件映射地址*/

@SpringBootApplication
@MapperScan("com.atguigu.gulimall.product.dao")
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
