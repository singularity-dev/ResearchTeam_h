package com.chongan.dao;

import com.chongan.pojo.project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface projectMapper {
    public List<project> getLateProject();
    public List<project> getVProject();
    public List<project> getHProject();
    public List<project> getAllProject();
    public project getProjectByid(int id);

    public int insert(project myProject);

    public int deleteByNum(int num);

    public int updateProject(project myProject);
}

