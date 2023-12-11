package com.springmvc.controller;

import com.springmvc.entities.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private UserService userRegistrationService;

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping(value = "/processform", method = RequestMethod.POST)
    public String handleForm(@ModelAttribute("user") User user) {
        System.out.println("In Controller" + user);
        userRegistrationService.createUser(user);
        return "success";
    }
}
