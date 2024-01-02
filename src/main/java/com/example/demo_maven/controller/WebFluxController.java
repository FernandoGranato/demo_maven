package com.example.demo_maven.controller;

import com.example.demo_maven.document.WebFluxDocument;
import com.example.demo_maven.service.WebFluxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class WebFluxController {

    @Autowired
    private WebFluxService webFluxService;

    @PostMapping("/save")
    public Mono<ResponseEntity<Void>> postMonoResult() {
        return webFluxService.saveNewWebFluxDocument("Result from Mono").thenReturn( ResponseEntity.ok().build());
    }

    @GetMapping("/all")
    public Flux<ResponseEntity<WebFluxDocument>> getMonoResult() {
        return webFluxService.getAllWebFluxDocuments().map(ResponseEntity::ok);
    }



}
