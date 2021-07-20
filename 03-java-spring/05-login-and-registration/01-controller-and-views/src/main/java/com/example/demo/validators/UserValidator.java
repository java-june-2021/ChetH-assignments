package com.example.demo.validators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;

@Component
public class UserValidator implements Validator {
    @Autowired
    private UserRepository userRepository;
    
    // include User class in validator
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
    
    // custom validator to check that email is not blank and passwords match and user doesn't already exist
    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        
        if (user.getEmail().isEmpty()) {
        	// set error if email is blank
        	errors.rejectValue("email", "Blank");
        }
        
        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            // set error if passwords don't match
            errors.rejectValue("passwordConfirmation", "Match");
        }
        
        if (this.userRepository.existsByEmail(user.getEmail())) {
        	// set error if email has already been registered
        	errors.rejectValue("email", "Match", "Email has already been registered");
        }
        
    }
}