package com.github.ravenless.ravengram.auth.security.oauth2.user;

import java.util.Map;

/**
 * OAuth2 user info
 *
 * @author Voronenkov Aleksei
 * @since 10.01.2020
 */
public abstract class OAuth2UserInfo {
    protected Map<String, Object> attributes;

    public OAuth2UserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public abstract String getId();

    public abstract String getName();

    public abstract String getEmail();

    public abstract String getImageUrl();
}
