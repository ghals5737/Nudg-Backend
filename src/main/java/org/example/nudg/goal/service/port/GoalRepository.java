package org.example.nudg.goal.service.port;

import org.example.nudg.goal.domain.Goal;

import java.util.List;
import java.util.Optional;

public interface GoalRepository{
    Goal getById(long id);
    Optional<Goal> findById(long id);
    List<Goal> findByUserId(long id);
    void deleteById(long id);
    Goal save(Goal goal);
}
