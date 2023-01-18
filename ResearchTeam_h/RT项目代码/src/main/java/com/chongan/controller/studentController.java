package com.chongan.controller;

import com.alibaba.fastjson.JSONObject;
import com.chongan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("getAllStudent")
    public String gerAllStudent() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("studentList", studentService.getAllStudent());
        return jsonObject.toJSONString();
    }

    @RequestMapping("getStudentNum")
    public String getStudentNum() {
        return studentService.getStudentNum()+"";
    }

    @RequestMapping("/getPageStudent/{page}")
    public String getPageStudent(@PathVariable String page) {
        int p = Integer.parseInt(page);
        p = (p-1)*14;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("pageList", studentService.getPageStudent(p));
        return jsonObject.toJSONString();
    }
}
