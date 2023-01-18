package com.chongan.service;

import com.chongan.dao.teacherMapper;
import com.chongan.pojo.teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class teacherService {
    @Autowired
    private teacherMapper teacherMapper;

    public List<teacher> getAllTeacher() {
        return teacherMapper.getAll();
    }

    public int getTeacherNum() {
        return teacherMapper.getTeacherNum();
    }

    public List<teacher> getPageTeacher(int page) {
        return teacherMapper.getPageTeacher(page);
    }

    public teacher getTeacherbyNum(int num) {
        return teacherMapper.getTeacherbyNum(num);
    }

    public List<teacher> getLateTeacher() {
        return teacherMapper.getLateTeacher();
    }

    public String addTeacher(teacher myTeacher) {
        Integer message = teacherMapper.insert(myTeacher);
        return message.toString();
    }

    public String deleteTeacher(int num) {
        Integer message = teacherMapper.deleteByNum(num);
        return message.toString();
    }

    public String addTeacherImg(String Email, MultipartFile teacherImg) {
        teacher tempTeacher = teacherMapper.getTeacherbyEmail(Email);
        if(tempTeacher == null || teacherImg == null)
            return "-1";
        else {
            Integer teacherNo = tempTeacher.getTeacherNo();
            //String filePath = "D:/Desktop/ResearchTeam/static/img/";
            String filePath = "/home/researshTeam/img/";
            String fileName = "teacher"+teacherNo.toString()+".jpg";

            try {
                FileOutputStream out = new FileOutputStream(filePath+fileName);
                out.write(teacherImg.getBytes());
                out.flush();
                out.close();
            } catch(IOException e) {
                e.printStackTrace();
                return "-1";
            }
            return "1";
        }
    }

    public String updateTeacher(teacher myTeacher) {
        Integer message = teacherMapper.updateTeacher(myTeacher);
        return message.toString();
    }
}
