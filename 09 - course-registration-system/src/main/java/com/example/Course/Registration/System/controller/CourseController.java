package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    //Get all Course

    @GetMapping("courses")
    public List<Course> getCourses(){
        return courseService.getAllCourse();
    }

    //Get only the Enrolled Students from CourseRegistry
    @GetMapping("courses/enrolled")
    public List<CourseRegistry> getEnrolledCourses(){
        return courseService.getEnrolledCourses();
    }

    //we now add the new enrolled course
    @PostMapping("courses/register")
    public String RegisterCourse(@RequestParam("name") String name ,
                                 @RequestParam("emailId") String emailId,
                                 @RequestParam("CourseName") String courseName)
    {
        courseService.registerCourse(name,emailId,courseName);
        return "Congratulations " +name+ " Registered Successful for " + courseName;
    }

}
