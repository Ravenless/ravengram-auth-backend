package com.github.ravenless.ravengram.auth.payload;

import lombok.Getter;
import lombok.Setter;

/**
 * AuthResponse
 *
 * @author Voronenkov Aleksei
 * @since 13.01.2020
 */
@Getter
@Setter
public class AuthResponse {
    private String accessToken;
    private String tokenType = "Bearer";

    public AuthResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
