package com.sindoh.solution.azureexam;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDto {

    private String userName;
    private String userId;
    private String deptName;
    private String email;

    public UserDto(String userName, String userId, String deptName, String email) {
        this.userName = userName;
        this.userId = userId;
        this.deptName = deptName;
        this.email = email;
    }
}
