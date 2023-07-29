package com.example.springsecurityjuly.config;

import com.example.springsecurityjuly.Person;
import com.example.springsecurityjuly.PersonRepository;
import com.example.springsecurityjuly.UserDetailsCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    PersonRepository personRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        Person person = personRepository.findByUserName(username);

        if(person==null)
            throw new RuntimeException("Person does not exist");

        return new UserDetailsCreator(person);
    }

}
