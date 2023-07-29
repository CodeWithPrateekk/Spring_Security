package com.example.springsecurityjuly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

//     @Autowired
//      PersonRepository personRepository;
//
//
//     PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Student Area";
    }

//    @PostMapping("/add")
//    public String addStudent(@RequestBody Person person){
//        person.setPassword(passwordEncoder.encode(person.getPassword()));
//        personRepository.save(person);
//
//        return "Student added successfully";
//    }
}
