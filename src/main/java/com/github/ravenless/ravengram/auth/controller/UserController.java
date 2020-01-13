package com.github.ravenless.ravengram.auth.controller;

import com.github.ravenless.ravengram.auth.exception.ResourceNotFoundException;
import com.github.ravenless.ravengram.auth.model.User;
import com.github.ravenless.ravengram.auth.respository.UserRepository;
import com.github.ravenless.ravengram.auth.security.CurrentUser;
import com.github.ravenless.ravengram.auth.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User Controller
 *
 * @author Voronenkov Aleksei
 * @since 13.01.2020
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
