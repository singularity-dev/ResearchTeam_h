package com.chongan.controller;

import com.chongan.service.otherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class backPageController {
    @Autowired
    private otherService otherService;

    @RequestMapping("/backIndex")
    public String manaIndex() {
        return "manaIndex";
    }

    @RequestMapping("/backNews")
    public String manaNews() {
        return "manaNews";
    }

    @RequestMapping("/backPaper")
    public String manaPaper() {
        return "manaPaper";
    }

    @RequestMapping("/backProject")
    public String manaProject() {
        return "manaProject";
    }

    @RequestMapping("/backTeacher")
    public String manaTeacher() {
        return "manaTeacher";
    }

    @RequestMapping("/backBigImg")
    public String manaBigImg() {
        return "manaBigImg";
    }

    @RequestMapping("/backLogin")
    public String manaLogin() {
        return "manaLogin";
    }

    @RequestMapping("/backUser")
    public String manaUser() {
        return "manaUser";
    }


    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session) {
        if(otherService.login(username, password)) {
            session.setAttribute("user", username);
            return "redirect:backIndex";
        } else {
            return "redirect:backLogin";
        }
    }

    @RequestMapping("/addUser")
    public String addUser(String username, String password) {
        return otherService.addUser(username, password);
    }
}
