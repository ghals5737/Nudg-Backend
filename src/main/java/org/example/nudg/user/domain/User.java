package org.example.nudg.user.domain;

public record User(
        long id,
        String email,
        String name,
        String picture,
        long startedAt,
        long updateAt
) {

}
