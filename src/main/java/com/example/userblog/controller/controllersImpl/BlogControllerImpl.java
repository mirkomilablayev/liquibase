package com.example.userblog.controller.controllersImpl;


import com.example.userblog.controller.controllers.BlogController;
import com.example.userblog.dto.blog.BlogCreateDto;
import com.example.userblog.entity.Blog;
import com.example.userblog.service.BlogService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/blog")
public class BlogControllerImpl implements BlogController {


    private final BlogService blogService;

    public BlogControllerImpl(BlogService blogService){
        this.blogService=blogService;

    }

    @PostMapping("/create")
    @Override
    public Mono<Blog> createBlog(BlogCreateDto bcd) {
        return blogService.createBlog(bcd);
    }

    @GetMapping("/{id}")
    @Override
    public Mono<Blog> getBlog(Integer id) {
        return blogService.getBlog(id);
    }

    @GetMapping("/all/{user_id}")
    @Override
    public Flux<Blog> getUserBlogsList( @PathVariable Integer user_id) {
        return blogService.getUserBlogsList(user_id);
    }

    @GetMapping("/all")
    @Override
    public Flux<Blog> getAllBlogs() {
        return blogService.getAllBlog();
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public Mono<Void> deleteBlog(@PathVariable Integer id) {
        return blogService.deleteBlog(id);
    }
}
