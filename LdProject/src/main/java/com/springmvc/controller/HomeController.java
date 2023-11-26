package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/details")
    public String getDetails(Model model) {
//        bind the data with model to pass from controller to view
        List<String> studentNames = new ArrayList<String>();
        studentNames.add("Shahid");
        studentNames.add("Maajid");
        studentNames.add("Raashid");
        model.addAttribute("students", studentNames);


        return "details";
    }

    @RequestMapping("/help")
    public ModelAndView help() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("info", "HelpPageInformation");
        modelAndView.setViewName("help");
        return modelAndView;
    }

}
