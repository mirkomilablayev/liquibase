package com.example.userblog.repository;

import com.example.userblog.entity.Blog;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface BlogRepository extends ReactiveCrudRepository<Blog, Integer> {
    Flux<Blog> findAllByUserId(Integer userId);

}
