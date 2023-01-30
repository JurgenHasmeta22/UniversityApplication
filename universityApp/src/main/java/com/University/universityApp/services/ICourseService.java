package com.University.universityApp.services;


import java.util.List;
import com.University.universityApp.dal.Course;



public interface ICourseService {
public Course getCourseById(int id);
public List<Course> getAllCourses();
}
