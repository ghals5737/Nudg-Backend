package org.example.nudg.goal.infrastructure;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.nudg.user.infrastructure.UserEntity;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name="goals")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GoalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private Long startedAt;

    @Column(nullable = false)
    private Long pausedAt;

    @Column(nullable = false)
    private Long totalTimeSpent;

    @CreationTimestamp
    private Date expiryDate;

    @Column(nullable = false)
    private Boolean isArchived;
}

