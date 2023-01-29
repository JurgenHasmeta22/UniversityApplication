package com.University.universityApp.controllers;

//import common.server.identity.dto.PasswordChangeDto;
//import common.server.identity.dto.UserGetDto;
//import common.server.identity.dto.UserPatchDto;
//import common.server.identity.dto.UserPostDto;
import com.University.universityApp.services.CourseService;
import com.University.universityApp.services.UserService;
//import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    public final UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }
    /*@PostMapping
    public UserGetDto save(@RequestBody UserPostDto userPostDto) {
        return userService.save(userPostDto);
    }

    @PatchMapping("{id}")
    public UserGetDto update(@PathVariable UUID id, @RequestBody UserPatchDto userPatchDto) {
        return userService.update(id, userPatchDto);
    }
        */
   /* @GetMapping("{id}")
    public UserGetDto find(@PathVariable UUID id) {
        return userService.find(id);
    }
*/
    /*
    @GetMapping
    public List<UserGetDto> findAll() {
        return userService.findAll();
    }

    @PatchMapping("{id}/password")
    public void updatePassword(@PathVariable UUID id, @RequestBody PasswordChangeDto passwordChangeDto) {
        userService.changePassword(id, passwordChangeDto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable UUID id) {
        userService.delete(id);
    }*/
}
