package com.example.demo_maven.repository;

import com.example.demo_maven.document.WebFluxDocument;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebFluxRepository extends ReactiveCrudRepository<WebFluxDocument, String> {
}
