package com.example.demo_maven.service;

import com.example.demo_maven.document.WebFluxDocument;
import com.example.demo_maven.repository.WebFluxRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
@Slf4j
public class WebFluxService {

    private final WebFluxRepository webFluxRepository;

    @Autowired
    public WebFluxService(WebFluxRepository webFluxRepository) {
        this.webFluxRepository = webFluxRepository;
    }

    public Mono<Void> saveNewWebFluxDocument(String bodyToSave) {
        log.info("saveNewWebFluxDocument method");
        return webFluxRepository.save(new WebFluxDocument(UUID.randomUUID().toString(), bodyToSave)).then();
    }

    public Flux<WebFluxDocument> getAllWebFluxDocuments() {
        log.info("getAllWebFluxDocuments method");
        return webFluxRepository.findAll();
    }
}
