package com.example.elasticsearchDemo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface GreetingRepository extends ElasticsearchRepository<Greeting, String> {
    List<Greeting> findByUsername(String username);
}