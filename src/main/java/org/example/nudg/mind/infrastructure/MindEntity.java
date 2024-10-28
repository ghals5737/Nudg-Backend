package org.example.nudg.mind.infrastructure;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.nudg.user.infrastructure.UserEntity;

import java.util.Date;

@Entity
@Table(name="minds")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MindEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Column(nullable = false)
    private String situation;

    @Column(nullable = false)
    private String thought;

    @Column(nullable = false)
    private String feedback;

    @Column(nullable = false)
    private Long createAt;

    @Column(nullable = false)
    private Long updateAt;
}
