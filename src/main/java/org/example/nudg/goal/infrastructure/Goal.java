package org.example.nudg.goal.infrastructure;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.nudg.user.infrastructure.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="goals")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 100)
    private String title;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;
}

