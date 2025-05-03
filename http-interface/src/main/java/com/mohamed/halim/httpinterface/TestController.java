package com.mohamed.halim.httpinterface;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    private final PlaceholderClient placeholderClient;

    @GetMapping("/posts")
    public Mono<?> getPosts() {
        return placeholderClient.getPosts();
    }
}
