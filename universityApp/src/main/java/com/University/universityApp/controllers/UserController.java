package com.University.universityApp.controllers;


import com.University.universityApp.dal.User;
import com.University.universityApp.dal.UserCourse;
import com.University.universityApp.services.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    public final UserService userService;

    public UserController(UserService userService)
    {
        this.userService = userService;
    }
    @PostMapping
    public UserCourse addUserCourse(@PathVariable int userId,@PathVariable int courseId) {
        return userService.addUserCourse(userId, courseId);
    }
/* 
    @PatchMapping("{id}")
    public UserGetDto update(@PathVariable UUID id, @RequestBody UserPatchDto userPatchDto) {
        return userService.update(id, userPatchDto);
    }
        */
    @GetMapping("{id}")
    public User find(@PathVariable int id) {
        return userService.getUserById(id);
    }

    
    @GetMapping
    public List<User> findAll() {
        return userService.getAllUsers();
    }
  
/* 
    @PatchMapping("{id}/password")
    public void updatePassword(@PathVariable UUID id, @RequestBody PasswordChangeDto passwordChangeDto) {
        userService.changePassword(id, passwordChangeDto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable UUID id) {
        userService.delete(id);
    }*/
}
