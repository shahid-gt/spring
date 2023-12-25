package com.springmvc.controller;

import com.springmvc.entities.User;
import com.springmvc.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
    public String handleForm(@ModelAttribute("user") User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "contact";
        System.out.println("In Controller" + user);
        userRegistrationService.createUser(user);
        return "success";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView listUsers() {
        ModelAndView mv = new ModelAndView();
        List<User> users = userRegistrationService.getAllUsers();
        System.out.println("Registration Controller " + users);
        mv.addObject("users", users);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    public ModelAndView getUser(@PathVariable("userId") Long id) {
        ModelAndView mv = new ModelAndView();
        User user = userRegistrationService.getUser(id);
        System.out.println("Registration controller[getUser]: " + user);
        mv.addObject("user", user);
        return mv;
    }
}
