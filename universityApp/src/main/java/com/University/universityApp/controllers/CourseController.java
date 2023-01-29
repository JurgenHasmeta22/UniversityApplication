package com.University.universityApp.controllers;

//import common.server.identity.dto.PasswordChangeDto;
import com.University.universityApp.dal.Course;
//import common.server.identity.dto.UserPatchDto;
//import common.server.identity.dto.UserPostDto;
  import com.University.universityApp.services.CourseService;
//import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    public final CourseService courseService;

    public CourseController(CourseService courseService)
    {
        this.courseService = courseService;
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
    @GetMapping("{id}")
    public Course getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }

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