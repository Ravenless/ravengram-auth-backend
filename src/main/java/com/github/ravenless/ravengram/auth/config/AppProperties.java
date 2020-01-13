package com.github.ravenless.ravengram.auth.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Auth properties
 *
 * @author Voronenkov Aleksei
 * @since 09.01.2020
 */
@ConfigurationProperties(prefix = "app")
@Getter
@Setter
public class AppProperties {

    private final Auth auth = new Auth();
    private final OAuth2 oauth2 = new OAuth2();

    @Getter
    @Setter
    public static class Auth {
        private String tokenSecret;
        private long tokenExp;
    }

    @Getter
    @Setter
    public static final class OAuth2 {
        private List<String> authorizedRedirectUris = new ArrayList<>();
    }
}
