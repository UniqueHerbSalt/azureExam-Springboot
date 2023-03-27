package com.sindoh.solution.azureexam;

import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("")
    public ResponseEntity<UserDto> getHello() {
        UserDto userDto = UserDto.builder()
                .userId("TestUser")
                .userName("테스트 유저")
                .deptName("Solution사업부")
                .email("test.user@sindoh.com")
                .build();
        return  ResponseEntity.ok(userDto);
    }
}
