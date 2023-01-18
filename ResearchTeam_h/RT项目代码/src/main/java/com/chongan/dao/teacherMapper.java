package com.chongan.dao;

import com.chongan.pojo.teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface teacherMapper {
    public List<teacher> getAll();
    public int getTeacherNum();
    public List<teacher> getPageTeacher(int page);
    public teacher getTeacherbyNum(int num);
    public List<teacher> getLateTeacher();
    public teacher getTeacherbyEmail(String Email);

    public int insert(teacher myTeacher);

    public int deleteByNum(int num);

    public int updateTeacher(teacher myTeacher);
}

