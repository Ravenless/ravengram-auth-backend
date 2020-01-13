package com.github.ravenless.ravengram.auth.payload;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * IntelliJ IDEA
 *
 * @author Voronenkov Aleksei
 * @since 13.01.2020
 */
@Getter
@Setter
public class SignUpRequest {
    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;
}
