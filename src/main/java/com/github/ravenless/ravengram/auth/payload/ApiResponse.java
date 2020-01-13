package com.github.ravenless.ravengram.auth.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * IntelliJ IDEA
 *
 * @author Voronenkov Aleksei
 * @since 13.01.2020
 */
@Getter
@Setter
@AllArgsConstructor
public class ApiResponse {
    private boolean success;
    private String message;
}
