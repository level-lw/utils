package com.lw.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @program: Utils
 * @description: Knife4j配置类
 * @author: 李伟
 * @create: 2022-12-20 15:09
 **/
public class Knife4jConfiguration {
    @Bean(value = "dockerBean")
    public Docket dockerBean() {
        //指定使用Swagger2规范
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        // 标题
                        .title("毕业生离校管理系统 后台服务API接口文档")
                        //描述字段支持Markdown语法
                        .description("# 毕业生离校管理系统测试")
                        // 服务url
                        .termsOfServiceUrl("https://doc.xiaominfo.com/")
                        // 作者
                        .contact("13689228486@163.com")
                        // 版本
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("用户服务")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.lw.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
