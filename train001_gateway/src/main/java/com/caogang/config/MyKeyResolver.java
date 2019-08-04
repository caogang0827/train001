package com.caogang.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author: xiaogang
 * @date: 2019/8/4 - 21:36
 */
public class MyKeyResolver implements KeyResolver {
    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {

        return Mono.just(exchange.getRequest().getRemoteAddress().getAddress().getHostAddress());

    }
}
