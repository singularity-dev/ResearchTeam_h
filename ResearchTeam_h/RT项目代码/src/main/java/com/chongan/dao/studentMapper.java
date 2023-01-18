package com.chongan.dao;

import com.chongan.pojo.student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface studentMapper {
    public List<student> getAll();
    public int getStudentNum();
    public List<student> getPageStudent(int page);
}
