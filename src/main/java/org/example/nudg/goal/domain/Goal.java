package org.example.nudg.goal.domain;

import org.example.nudg.user.domain.User;

import java.util.Date;

public record Goal(
        Long id,
        User user,
        String title,
        Long startedAt,
        Long pausedAt,
        Long totalTimeSpent,
        Date expiryDate,
        Boolean isArchived
) {
}
