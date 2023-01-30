package com.University.universityApp.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.University.universityApp.dal.User;
import com.University.universityApp.dal.UserCourse;
import com.University.universityApp.dal.UserCourseRepository;
import com.University.universityApp.dal.UserRepository;

@Service
public class UserService {
    public final UserRepository userRepository;
    public final UserCourseRepository userCourseRepository;
    public final CourseService courseService;

    public UserService(UserRepository userRepository,UserCourseRepository userCourseRepository,
    CourseService courseService)
    {
        this.userRepository = userRepository;
        this.userCourseRepository = userCourseRepository;
        this.courseService = courseService;
    }

    public User getUserById(int id)
    {
        Optional<User> optionalEntity =  userRepository.findById(id);
        if(optionalEntity.isPresent())
        {
          User user = optionalEntity.get();
          return user;
        }
        return null;
    }


    public List<User> getAllUsers()
    {
      
        return userRepository.findAll();
    }

    public UserCourse addUserCourse(int userId, int courseId)
    {
      UserCourse userCourseEntity = new UserCourse();
      userCourseEntity.setUser(getUserById(userId));
      userCourseEntity.setCourse(courseService.getCourseById(courseId));
      return userCourseRepository.save(userCourseEntity);
    }
    
}
