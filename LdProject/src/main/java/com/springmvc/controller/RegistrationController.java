package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping(value = "/processform", method = RequestMethod.POST)
    public ModelAndView handleForm(@RequestParam("email") String userEmail, @RequestParam("password") String userPassword) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("email", userEmail);
        mv.addObject("password", userPassword);
        mv.setViewName("success");
        return mv;
    }
}