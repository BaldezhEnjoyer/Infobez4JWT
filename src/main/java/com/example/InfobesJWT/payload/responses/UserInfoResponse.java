package com.example.InfobesJWT.payload.responses;

import lombok.Data;

import java.util.List;

@Data
public class UserInfoResponse {
    private Long id;
    private String username;

    public UserInfoResponse(Long id, String username) {
        this.id = id;
        this.username = username;
    }
}
