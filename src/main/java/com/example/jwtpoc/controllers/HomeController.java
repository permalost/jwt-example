package com.example.jwtpoc.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import org.springframework.security.oauth2.jwt.Jwt;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public Mono test(@AuthenticationPrincipal Mono<Jwt> jwt) {
        return jwt;
    }
}
