package com.example.userblog.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "blogs")
public class Blog {
    @Id
    @Column
    private Integer id;
    @Column
    private String title;
    @Column
    private Integer userId;
}
