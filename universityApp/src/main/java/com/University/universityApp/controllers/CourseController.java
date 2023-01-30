package com.University.universityApp.controllers;

//import common.server.identity.dto.PasswordChangeDto;
import com.University.universityApp.dal.Course;
//import common.server.identity.dto.UserPatchDto;
//import common.server.identity.dto.UserPostDto;
  import com.University.universityApp.services.CourseService;

import java.util.List;


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

    @GetMapping("{id}")
    public Course getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }
    
    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    
}