package com.example.userblog.repository;

import com.example.userblog.entity.Blog;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface BlogRepository extends ReactiveCrudRepository<Blog, Integer> {

}
