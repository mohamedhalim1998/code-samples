package com.halim.sample.jsonview;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/int/users")
    @JsonView(value = View.UserView.Internal.class)
    public UserDto getAllInternal() {
        return UserDto.sample();
    }

    @GetMapping("/ext/users")
    @JsonView(value = View.UserView.External.class)
    public UserDto getAllExternal() {
        return UserDto.sample();
    }
}