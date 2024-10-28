package org.example.nudg.mock;

import org.example.nudg.goal.domain.Goal;
import org.example.nudg.goal.service.port.GoalRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class FakeGoalRepository implements GoalRepository {
    private final AtomicLong autoGeneratedId= new AtomicLong(0);
    private final List<Goal> goals = Collections.synchronizedList(new ArrayList<>());


    @Override
    public Goal getById(long id) {
        return null;
    }

    @Override
    public Optional<Goal> findById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Goal> findByUserId(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Goal save(Goal goal) {
        if(goal.id()==null||goal.id()==0){
            Goal newGoal=new Goal(
                    autoGeneratedId.incrementAndGet(),
                    goal.user(),
                    goal.title(),
                    goal.startedAt(),
                    goal.pausedAt(),
                    goal.totalTimeSpent(),
                    goal.expiryDate(),
                    goal.isArchived()
            );
            goals.add(newGoal);
            return newGoal;
        }
        goals.removeIf(item ->item.id().equals(goal.id()));
        goals.add(goal);
        return goal;
    }
}