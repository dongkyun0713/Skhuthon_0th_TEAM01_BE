package com.skhuthon.caffeinebalance.user.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Column(name = "profile", columnDefinition = "TEXT")
    private String profile;

    @Column(name = "today_caffeine_intake_amount")
    private double todayCaffeineIntakeAmount;

    @Column(name = "can_caffeiene_intake_amount")
    private double canCaffeineIntakeAmount;

    public void update(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void updateCaffeineInformation(double caffeine) {
        this.todayCaffeineIntakeAmount += caffeine;
        this.canCaffeineIntakeAmount -= caffeine;
    }


}
