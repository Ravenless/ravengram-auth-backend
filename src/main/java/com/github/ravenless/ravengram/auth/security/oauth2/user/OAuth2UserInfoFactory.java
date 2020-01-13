package com.github.ravenless.ravengram.auth.security.oauth2.user;

import com.github.ravenless.ravengram.auth.exception.OAuth2AuthenticationProcessingException;
import com.github.ravenless.ravengram.auth.model.AuthProvider;

import java.util.Map;

/**
 * OAuth2 user info factory
 *
 * @author Voronenkov Aleksei
 * @since 10.01.2020
 */
public class OAuth2UserInfoFactory {

    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if(registrationId.equalsIgnoreCase(AuthProvider.vk.toString())) {
            return new VkOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }
}
