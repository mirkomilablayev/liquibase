package com.example.userblog.controller.controllers;

import com.example.userblog.entity.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserController {

    Mono<User> createUser(@RequestBody User user);
    Flux<User> getUsersList();
    Mono<User> getUser(@PathVariable Integer id);
    Mono<User> editUser(@PathVariable Integer user_id, @RequestBody User user);
    Mono<Void>  deleteUser(@PathVariable Integer user_id);

}
