package com.example.studentdemo.controller;


import com.example.studentdemo.entity.Student;
import com.example.studentdemo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller

@RequestMapping(path="/student")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository ;


    @PostMapping(path="/addStudent")
    public @ResponseBody Student addStudent (@RequestParam String first_name,
                                            @RequestParam String last_name,
                                            @RequestParam String email,
                                            @RequestParam String course,
                                            @RequestParam float Gpa) {

        // @ResponseBody means the returned String
        // is the response, not a view name
        // @RequestParam means it is a parameter
        // from the GET or POST request
        Student student = new Student();
        student.setFirst_name(first_name);
        student.setLast_name(last_name);
        student.setEmail(email);
        student.setCourse(course);
        student.setGpa(Gpa);
        studentRepository.save(student);
        return student;


        //sample postman request Http://localhost:8080/student/addStudent?first_name=Gerard&last_name=way&email=mcr@Gmail.com&course=Major in Music&Gpa=1
    }


    @GetMapping(path="/getAllStudents")
    public @ResponseBody Iterable<Student> getAllStudents() {
        // This returns a JSON or
        // XML with the Book
        return studentRepository.findAll();
    }





    @GetMapping("/delete")
    public  @ResponseBody  String deleteById(@RequestParam long id){

        //sample  postman request Http://localhost:8080/student/delete?id=52



        if(studentRepository.existsById(Long.parseLong(String.valueOf(id)))){
            studentRepository.deleteById(id);
            return "deleted";
        }

        return "does not exist";




    }


    @PostMapping(path="/updateStudent")
    public @ResponseBody String updateByID (@RequestParam Integer id,
                                             @RequestParam String first_name,
                                             @RequestParam String last_name,
                                             @RequestParam String email,
                                             @RequestParam String course,
                                             @RequestParam float Gpa) {


        Student student = new Student();
        student.setId(id);
        student.setFirst_name(first_name);
        student.setLast_name(last_name);
        student.setEmail(email);
        student.setCourse(course);
        student.setGpa(Gpa);

        if(studentRepository.existsById(Long.parseLong(String.valueOf(id)))){
            studentRepository.save(student);
            return "update success";
        }

            return "does not exist";



           //sample postman Http://localhost:8080/student/updateStudent?id=102&first_name=Gerard&last_name=way&email=mychemical@Gmail.com&course=Major in Music&Gpa=1.5



    }

    }
