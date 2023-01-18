package com.chongan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/news")
    public String news() {
        return "news";
    }

    @RequestMapping("/paper")
    public String paper() {
        return "paper";
    }

    @RequestMapping("/patent")
    public String patent() {
        return "patent";
    }

    @RequestMapping("/projecth")
    public String projecth() {
        return "projecth";
    }

    @RequestMapping("/projectw")
    public String projectw() {
        return "projectw";
    }

    @RequestMapping("/student")
    public String student() {
        return "student";
    }

    @RequestMapping("/teacher")
    public String teacher() {
        return "teacher";
    }

    @RequestMapping("/specNews")
    public String specNews() {
        return "specNews";
    }

    @RequestMapping("specMember")
    public String specMember() {
        return "specMember";
    }
}
