package com.chongan.service;

import com.chongan.dao.studentMapper;
import com.chongan.pojo.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private studentMapper studentMapper;

    public List<student> getAllStudent() {
        return studentMapper.getAll();
    }

    public int getStudentNum() {
        return studentMapper.getStudentNum();
    }

    public List<student> getPageStudent(int page) {
        return studentMapper.getPageStudent(page);
    }
}
