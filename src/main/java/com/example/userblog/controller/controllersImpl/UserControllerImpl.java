package com.example.userblog.controller.controllersImpl;

import com.example.userblog.controller.controllers.UserController;
import com.example.userblog.entity.User;
import com.example.userblog.repository.UserRepository;
import com.example.userblog.service.UserService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/user")
public class UserControllerImpl implements UserController {

    private final UserService userService;

    public UserControllerImpl(UserService userService){
        this.userService = userService;
    }


    @PostMapping("/createUser")
    @Override
    public Mono<User> createUser(User user) {
        return userService.createUser(user);
    }

    @GetMapping("/getUsers")
    @Override
    public Flux<User> getUsersList  () {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    @Override
    public Mono<User> getUser(@PathVariable Integer id) {
        return userService.getOneUser(id);
    }

    @PutMapping("/{user_id}")
    @Override
    public Mono<User> editUser(@PathVariable Integer user_id, User user) {
        return userService.editUser(user_id, user);
    }

    @DeleteMapping("/{user_id}")
    @Override
    public Mono<Void> deleteUser(@PathVariable Integer user_id) {
        return userService.deleteUser(user_id);
    }
}
