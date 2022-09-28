package com.example.userblog.controller.controllers;

import com.example.userblog.dto.blog.BlogCreateDto;
import com.example.userblog.entity.Blog;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BlogController {

    Mono<Blog> createBlog(@RequestBody BlogCreateDto bcd);
    Mono<Blog> getBlog(@PathVariable Integer id);
    Flux<Blog> getUserBlogsList(@PathVariable Integer user_id);
    Flux<Blog> getAllBlogs();
    Mono<Void> deleteBlog(@PathVariable Integer id);


}
