package com.caogang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.cors.reactive.CorsUtils;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

/**
 * @author: xiaogang
 * @date: 2019/8/5 - 15:10
 */
@Configuration
public class MyCross {


    @Bean
    public WebFilter crossFilter() {
        return (ServerWebExchange ctx, WebFilterChain chain) -> {
            ServerHttpRequest request = ctx.getRequest();
            ServerHttpResponse response = ctx.getResponse();
            if (CorsUtils.isCorsRequest(request)) {
                HttpHeaders headers = response.getHeaders();
                headers.add("Access-Control-Allow-Methods", "*");
                headers.add("Access-Control-Allow-Headers", "x-requested-with,Content-Type,Authorization,credential,token");
                headers.add("Access-Control-Allow-Origin", "http://localhost:8080");
                headers.add("Access-Control-Max-Age", "18000L");
                headers.add("Access-Control-Expose-Headers", "*");
                headers.add("Access-Control-Allow-Credentials", "true");
                if (request.getMethod() == HttpMethod.OPTIONS) {
                    response.setStatusCode(HttpStatus.OK);
                    return Mono.empty();
                }
            }
            return chain.filter(ctx);
        };
    }
}
