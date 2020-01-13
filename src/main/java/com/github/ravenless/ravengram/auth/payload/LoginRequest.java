package com.github.ravenless.ravengram.auth.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
/**
 * LoginRequest
 *
 * @author Voronenkov Aleksei
 * @since 13.01.2020
 */
@Getter
@Setter
public class LoginRequest {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;
}
