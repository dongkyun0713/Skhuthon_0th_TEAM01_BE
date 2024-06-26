package com.skhuthon.caffeinebalance.user.dto.response;

import com.skhuthon.caffeinebalance.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {
    private String name;
    private String email;
    private String profile;
    private String role;
    private double todayCaffeineIntakeAmount;
    private double canCaffeineIntakeAmount;
    private double dailyRecommendedCaffeineAmount;
    public static UserResponseDTO of(User user) {
        return UserResponseDTO.builder()
                .name(user.getName())
                .email(user.getEmail())
                .profile(user.getProfile())
                .role(user.getRole().name())
                .todayCaffeineIntakeAmount(user.getTodayCaffeineIntakeAmount())
                .canCaffeineIntakeAmount(user.getCanCaffeineIntakeAmount())
                .build();
    }
}
