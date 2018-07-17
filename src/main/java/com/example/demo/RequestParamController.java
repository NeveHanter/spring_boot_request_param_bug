package com.example.demo;

import org.reactivestreams.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
public class RequestParamController {

    @GetMapping("/boolean")
    public Publisher<Void> withBoolean(final Boolean parameter) {
        return Mono.empty();
    }

    @GetMapping("/integer")
    public Publisher<Void> withInteger(final Integer parameter) {
        return Mono.empty();
    }

    @GetMapping("/string")
    public Publisher<Void> withString(final String parameter) {
        return Mono.empty();
    }
}
