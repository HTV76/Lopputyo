package com.lopputyo.kurssit.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lopputyo.kurssit.data.Course;

@Service
public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public CourseService(){
        courses = Arrays.asList(
         new Course(0, ohjelmointi, Matti, 5, 4),  
         new Course(1, matikka, Matti, 3, 5),   
         new Course(2, ohjelmointi, Maija, 5, 4),  
         new Course(3, matikka, Maija, 3, 4),   
         new Course(4, matikka, Kalle, 3, 5) , 
         new Course(5, ohjelmointi, Mikko, 5, 3) 
         
        );
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public List<Course> getCourses(){
        return new ArrayList<>(courses);
    }
 //Tällä haeteen yksittäinen suoritus kurssista
    public Course findCourse(int id){  
        for (Course course : courses) {
            if(course.getId == id){
                return course;
            }
        }
        return null;
    }
   // Tällä poistetaan yksittäinen suoritus kurssista
     public boolean removeGrade(int id){
        Course c = findCourse(id);
        if( c != null){
         return  courses.remove(c);
        } 
        return false;
       
    }  
     

}
