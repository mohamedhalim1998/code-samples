package com.mohamed.halim.httpinterface;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@HttpExchange
public interface PlaceholderClient {
    @GetExchange("/posts")
    Mono<List<Map<String, Object>>> getPosts();
}
