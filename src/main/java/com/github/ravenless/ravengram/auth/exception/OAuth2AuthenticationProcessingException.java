package com.github.ravenless.ravengram.auth.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * OAuth2AuthenticationProcessingException
 *
 * @author Voronenkov Aleksei
 * @since 13.01.2020
 */
public class OAuth2AuthenticationProcessingException extends AuthenticationException {
    public OAuth2AuthenticationProcessingException(String msg, Throwable t) {
        super(msg, t);
    }

    public OAuth2AuthenticationProcessingException(String msg) {
        super(msg);
    }
}
