package com.chongan.service;

import com.chongan.dao.projectMapper;
import com.chongan.pojo.paper;
import com.chongan.pojo.project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class projectService {
    @Autowired
    private projectMapper projectMapper;

    public List<project> getLateProject() {
        List<project> LateProject = projectMapper.getLateProject();
        for(project tempProject : LateProject) {
            if(tempProject.getTitle().length() > 30) {
                tempProject.setTitle(tempProject.getTitle().substring(0, 30)+"......");
            }
        }
        return LateProject;
    }

    public List<project> getVProject() {
        return projectMapper.getVProject();
    }

    public List<project> getHProject() {
        return projectMapper.getHProject();
    }

    public List<project> getAllProject() {
        List<project> allProject = projectMapper.getAllProject();
        for(project tempProject : allProject) {
            if(tempProject.getTitle().length() > 20) {
                tempProject.setTitle(tempProject.getTitle().substring(0, 20)+"......");
            }
        }
        return allProject;
    }

    public String addProject(project myProject) {
        Integer message = projectMapper.insert(myProject);
        return message.toString();
    }

    public String deleteProject(int num) {
        Integer message = projectMapper.deleteByNum(num);
        return message.toString();
    }

    public project getProjectById(int num) {
        project myPaper = projectMapper.getProjectByid(num);
        return myPaper;
    }

    public String updateProject(project myProject) {
        Integer message = projectMapper.updateProject(myProject);
        return message.toString();
    }
}
