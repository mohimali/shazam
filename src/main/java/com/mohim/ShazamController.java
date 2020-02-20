package com.mohim;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ShazamController {

    @GetMapping
    public Mono<String> test(){
        return Mono.just("Hello shazam");
    }

}
