package org.example.nudg.mind.infrastructure;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.nudg.user.infrastructure.User;

import java.util.Date;

@Entity
@Table(name="minds")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Mind {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    // Getters and Setters
}
