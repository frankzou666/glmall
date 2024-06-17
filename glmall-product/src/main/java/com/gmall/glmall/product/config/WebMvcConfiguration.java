//package com.gmall.glmall.product.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//public class WebMvcConfiguration extends WebMvcConfigurationSupport {
//    @Bean
//    public Docket docketForAdmin() {
//        ApiInfo apiInfo = new ApiInfoBuilder()
//                .title("glmall接口文档")
//                .version("1.0")
//                .description("glmall接口文档")
//                .build();
//        Docket docket = new Docket(DocumentationType.SWAGGER_2)
//                .groupName("用户端")
//                .apiInfo(apiInfo)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.gmall.glmall.product.controller"))
//                .paths(PathSelectors.any())
//                .build();
//        return docket;
//    }
//
//}
