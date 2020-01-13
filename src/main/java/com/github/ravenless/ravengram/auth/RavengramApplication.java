package com.github.ravenless.ravengram.auth;

import com.github.ravenless.ravengram.auth.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Main
 *
 * @author Voronenkov Aleksei
 * @since 09.01.2020
 */
@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class RavengramApplication {

    public static void main(String[] args) {
        SpringApplication.run(RavengramApplication.class, args);
    }

}