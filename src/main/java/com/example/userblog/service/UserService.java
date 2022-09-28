package com.example.userblog.service;

import com.example.userblog.entity.User;
import com.example.userblog.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public Mono<User> createUser(User user) {
        return repository.save(user);
    }

    public Flux<User> getUsers() {
        return repository.findAll();
    }

    public Mono<User> getOneUser(Integer id) {
        return repository.findById(id);
    }

    public Mono<User> editUser(Integer user_id, User user) {
        return repository.findById(user_id).map((c) -> {
            c.setName(user.getName());
            return c;
        }).flatMap(repository::save);
    }

    public Mono<Void> deleteUser(Integer user_id) {
        return repository.deleteById(user_id);
    }
}
