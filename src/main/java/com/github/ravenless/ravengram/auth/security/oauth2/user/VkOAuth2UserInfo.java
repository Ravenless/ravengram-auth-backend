package com.github.ravenless.ravengram.auth.security.oauth2.user;

import java.util.Map;

/**
 * VkOAuth2UserInfo
 *
 * @author Voronenkov Aleksei
 * @since 13.01.2020
 */
public class VkOAuth2UserInfo extends OAuth2UserInfo {

    public VkOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return (String) attributes.get("id");
    }

    @Override
    public String getName() {
        return (String) attributes.get("first_name");
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

    @Override
    public String getImageUrl() {
        return (String) attributes.get("photo_max");
    }
}