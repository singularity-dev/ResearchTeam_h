package com.chongan.dao;

import com.chongan.pojo.paper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface paperMapper {
    public List<paper> getLatePaper();
    public List<paper> getAllPaper();
    public List<paper> getAllPatent();
    public List<paper> getAll();
    public paper getPaperbyId(String paperNo);

    public int insert(paper myPaper);

    public int deleteByNum(int num);

    public int updatePaper(paper myPaper);
}
