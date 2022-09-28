package com.example.userblog.dto.blog;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class BlogCreateDto {
    private String title;
    private Integer  id;
}
