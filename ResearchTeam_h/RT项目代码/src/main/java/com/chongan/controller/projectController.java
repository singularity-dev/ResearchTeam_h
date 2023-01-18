package com.chongan.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.chongan.pojo.project;
import com.chongan.service.projectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class projectController {
    @Autowired
    private projectService projectService;

    @RequestMapping("getLateProject")
    public String getLateProject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("projectList", projectService.getLateProject());
        return jsonObject.toJSONString();
    }

    @RequestMapping("getVProject")
    public String getVProject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("VprojectList", projectService.getVProject());
        return jsonObject.toJSONString();
    }

    @RequestMapping("getHProject")
    public String getHProject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("HprojectList", projectService.getHProject());
        return jsonObject.toJSONString();
    }

    @RequestMapping("getAllProject")
    public String getAllProject() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", projectService.getAllProject());
        return jsonObject.toJSONString();
    }

    @RequestMapping("addProject")
    public String addProject(project myProject) {
        return projectService.addProject(myProject);
    }

    @RequestMapping("/deleteProject/{num}")
    public String deleteProject(@PathVariable String num) {
        int n = Integer.parseInt(num);
        return projectService.deleteProject(n);
    }

    @RequestMapping("/getProject/{num}")
    public String getProject(@PathVariable String num) {
        int n = Integer.parseInt(num);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("project", projectService.getProjectById(n));
        return jsonObject.toJSONString();
    }

    @RequestMapping("/updateProject")
    public String updateProject(project myProject) {
        return projectService.updateProject(myProject);
    }
}
