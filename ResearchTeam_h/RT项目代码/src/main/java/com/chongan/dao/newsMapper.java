package com.chongan.dao;

import com.chongan.pojo.news;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface newsMapper {
    public List<news> getLateNews();
    public int getNewsNum();
    public List<news> getPageNews(int page);
    public news getNewsbyNum(int num);
    public List<news> getAllNews();

    public int insert(news myNews);

    public int deleteByNum(int newsNo);

    public int updateNews(news myNews);
}
