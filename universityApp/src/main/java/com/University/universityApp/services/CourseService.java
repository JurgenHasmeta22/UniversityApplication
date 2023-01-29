package com.University.universityApp.services;
import com.University.universityApp.dal.Course;
import com.University.universityApp.dal.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

//import common.server.identity.mapper.UserMapper;
@Service
public class CourseService implements ICourseService{
    public final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository)
    {
        this.courseRepository = courseRepository;
    }

    public Course getCourseById(int id) {
        Optional<Course> optionalEntity =  courseRepository.findById(id);
        Course course = optionalEntity.get();
        return course;
    }

}
