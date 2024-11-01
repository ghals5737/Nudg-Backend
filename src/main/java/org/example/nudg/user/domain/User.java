package org.example.nudg.user.domain;

public record User(
        Long id,
        String email,
        String name,
        String picture,
        long startedAt,
        long updateAt
) {

}
