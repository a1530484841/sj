package com.aaa.sujiexiche.sj.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;


@Controller
public class empcontroller {

    @RequestMapping("/index")
    public ModelAndView articleList() {
        return new ModelAndView("a");
    }
    @RequestMapping("/select")
    public ModelAndView select() {
        return new ModelAndView("Waiting");
    }

}
