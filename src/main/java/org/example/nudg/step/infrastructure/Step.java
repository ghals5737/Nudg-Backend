package org.example.nudg.step.infrastructure;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.nudg.goal.infrastructure.Goal;

@Entity
@Table(name="steps")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "goal_id", nullable = false)
    private Goal goal;

    @Column(nullable = false, length = 100)
    private String title;

    private String description;

    @Column(nullable = false)
    private Boolean isCompleted = false;
}
