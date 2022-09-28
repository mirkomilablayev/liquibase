package com.example.userblog.service;

import com.example.userblog.dto.blog.BlogCreateDto;
import com.example.userblog.entity.Blog;
import com.example.userblog.repository.BlogRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BlogService {

    private final BlogRepository repository;

    public BlogService(BlogRepository repository) {
        this.repository = repository;
    }

    public Mono<Blog> getBlog(Integer id) {
        return repository.findById(id);
    }

    public Flux<Blog> getUserBlogsList(Integer user_id) {
        return repository.findAllByUserId(user_id);
    }

    public Flux<Blog> getAllBlog() {
        return repository.findAll();
    }

    public Mono<Blog> createBlog(BlogCreateDto bcd) {
        Blog blog = new Blog();
        blog.setTitle(bcd.getTitle());
        blog.setUserId(bcd.getId());
        return repository.save(blog);
    }

    public Mono<Void> deleteBlog(Integer id) {
        return repository.deleteById(id);
    }
}
