package com.wanted.preonboardingbackend.dto;

import com.wanted.preonboardingbackend.entity.UserEntity;
import lombok.Data;

@Data
public class UserDto {

    private String nickname;

    public UserDto(UserEntity userEntity) {
        this.nickname = userEntity.getNickname();
    }
}
