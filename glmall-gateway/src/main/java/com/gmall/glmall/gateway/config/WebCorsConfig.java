package com.gmall.glmall.gateway.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.server.ServerWebExchange;

@Configuration
public class WebCorsConfig {

    //增加跨Cors配置
    @Bean
    public CorsWebFilter corsWebFilter(){

        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
       // corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedOriginPattern("*");
        corsConfiguration.setAllowCredentials(true);
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);
        CorsWebFilter corsWebFilter = new CorsWebFilter(urlBasedCorsConfigurationSource);
        return  corsWebFilter;
    }

}