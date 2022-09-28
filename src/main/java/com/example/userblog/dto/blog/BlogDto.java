package com.example.userblog.dto.blog;

import com.example.userblog.entity.User;
import lombok.*;
import reactor.core.publisher.Mono;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BlogDto {
    private Integer id;
    private String title;
    private Mono<User> user;
}
