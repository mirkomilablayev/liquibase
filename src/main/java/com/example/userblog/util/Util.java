package com.example.userblog.util;

import com.example.userblog.dto.blog.BlogDto;
import com.example.userblog.entity.Blog;
import com.example.userblog.repository.UserRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
abstract class Util {

    private final UserRepository repository;

    public Util(UserRepository repository){
        this.repository = repository;
    }

    public BlogDto toBlogDto(Blog blog){
        return new BlogDto(
                blog.getId(),
                blog.getTitle(),
                repository.findById(blog.getUserId())
        );
    }


}
