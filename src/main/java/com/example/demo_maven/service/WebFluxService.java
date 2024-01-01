package com.example.demo_maven.service;

import com.example.demo_maven.document.WebFluxDocument;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class WebFluxService {

    public Mono<Void> saveNewWebFluxDocument(String bodyToSave){
        log.info("saveNewWebFluxDocument method");
        return Mono.just(new WebFluxDocument(UUID.randomUUID().toString(),bodyToSave)).then();
    }

    public Flux<WebFluxDocument> getAllWebFluxDocuments(){
        log.info("getAllWebFluxDocuments method");
        return Flux.just(new WebFluxDocument(UUID.randomUUID().toString(),"body"));
    }
}
