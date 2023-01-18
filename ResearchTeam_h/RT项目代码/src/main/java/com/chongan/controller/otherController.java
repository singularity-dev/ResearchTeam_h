package com.chongan.controller;

import com.chongan.service.otherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

@RestController
public class otherController {
    @Autowired
    private otherService otherService;

    @RequestMapping("/addBigImg")
    public String addBigImg(String imgNo, MultipartFile bigImg) {
        return otherService.addBigImg(imgNo, bigImg);
    }
}
