package com.halim.sample.jsonview;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    @JsonView(value = { View.UserView.External.class })
    private Integer id;
    @JsonView(value = { View.UserView.External.class })
    private String firstName;
    @JsonView(value = { View.UserView.External.class })
    private String lastName;
    @JsonView(value = { View.UserView.Internal.class })
    private String ssn;
    @JsonView(value = { View.UserView.Internal.class })
    private Instant dob;
    @JsonView(value = { View.UserView.Internal.class })
    private String mobileNo;

    public static UserDto sample() {
        return UserDto.builder()
                .id(125)
                .firstName("name")
                .lastName("last name")
                .ssn("ssn")
                .dob(Instant.now())
                .mobileNo("125367656")
                .build();
    }
}