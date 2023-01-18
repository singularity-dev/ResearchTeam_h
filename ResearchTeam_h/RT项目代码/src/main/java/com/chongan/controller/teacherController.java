package com.chongan.controller;

import com.alibaba.fastjson.JSONObject;
import com.chongan.pojo.teacher;
import com.chongan.service.teacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class teacherController {
    @Autowired
    private teacherService teacherService;

    @RequestMapping("getAllTeacher")
    public String getAllTeacher() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("teacherList", teacherService.getAllTeacher());
        return jsonObject.toJSONString();
    }

    @RequestMapping("getAllTeacherBack")
    public String getAllTeacherBack() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", teacherService.getAllTeacher());
        return jsonObject.toJSONString();
    }

    @RequestMapping("getTeacherNum")
    public String getTeacherNum() {
        return teacherService.getTeacherNum()+"";
    }

    @RequestMapping("/getPageTeacher/{page}")
    public String getPageTeacher(@PathVariable String page) {
        int p = Integer.parseInt(page);
        p = (p-1)*14;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("pageList", teacherService.getPageTeacher(p));
        return jsonObject.toJSONString();
    }

    @RequestMapping("/getTeacher/{num}")
    public String getTeacherByNum(@PathVariable String num) {
        int n = Integer.parseInt(num);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("teacher", teacherService.getTeacherbyNum(n));
        return jsonObject.toJSONString();
    }

    @RequestMapping("getLateTeacher")
    public String getLateTeacher() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("teacherList", teacherService.getLateTeacher());
        return jsonObject.toJSONString();
    }

    @RequestMapping("addTeacher")
    public String addTeacher(teacher myTeacher) {
        return teacherService.addTeacher(myTeacher);
    }

    @RequestMapping("/deleteTeacher/{num}")
    public String deleteTeacher(@PathVariable String num) {
        int n = Integer.parseInt(num);
        return teacherService.deleteTeacher(n);
    }

    @RequestMapping("/addTeacherImg")
    public String addTeacherImg(String fEmail, MultipartFile teacherImg) {
        return teacherService.addTeacherImg(fEmail, teacherImg);
    }

    @RequestMapping("/updateTeacher")
    public String updateTeacher(teacher myTeacher) {
        return teacherService.updateTeacher(myTeacher);
    }
}
