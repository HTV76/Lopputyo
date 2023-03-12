package com.lopputyo.kurssit;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lopputyo.kurssit.data.Course;
import com.lopputyo.kurssit.service.CourseService;

@RestController
public class courseRestController {

     CourseService co;

     @Autowired
     public courseRestController(CourseService co){
        this.co = co;
     }

     @GetMapping("/courses")
     public List<Course> getCourses(){
        return co.getCourses();
     }

     @PostMapping("/course")
     public String addCourse(@RequestParam Course course){
        co.addCourse(course);
        return "Cource added";
     }

     @DeleteMapping("/delcourse")
     public String deleteCourse(@RequestParam Course course){
        co.removeGrade(course.getId());
        return "Grade removed";
     }
      
     @GetMapping("/product/{course}")
     public ResponseEntity<Course> getCourse(@PathVariable String course){
       Course c = co.findCourse(course);
        if(c != null){
            return new ResponseEntity<>(c, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }
}
