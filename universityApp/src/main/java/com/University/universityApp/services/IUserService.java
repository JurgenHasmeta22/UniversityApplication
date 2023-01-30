package com.University.universityApp.services;

import java.util.List;
import com.University.universityApp.dal.User;
import com.University.universityApp.dal.UserCourse;
import com.University.universityApp.dto.UserPostDTO;

public interface IUserService {
public User getUserById(int id);
public List<User> getAllUsers();
public User register(UserPostDTO userPostDTO);
public User login(String username,String passwordi);
public UserCourse addUserCourse(int userId, int courseId);
}
