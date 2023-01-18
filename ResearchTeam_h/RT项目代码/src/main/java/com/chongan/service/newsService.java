package com.chongan.service;

import com.chongan.dao.newsMapper;
import com.chongan.pojo.news;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class newsService {
    @Autowired
    private newsMapper newsMapper;

    public List<news> getLateNews() {
        List<news> LateNews = newsMapper.getLateNews();
        for(news tempNews : LateNews) {
            if(tempNews.getTitle().length() > 30) {
                tempNews.setTitle(tempNews.getTitle().substring(0, 30)+"......");
            }
        }
        return LateNews;
    }

    public int getNewsNum() {
        return newsMapper.getNewsNum();
    }

    public List<news> getPageNews(int page) {
        return newsMapper.getPageNews(page);
    }

    public news getNewsbyNum(int num) {
        return newsMapper.getNewsbyNum(num);
    }

    public List<news> getAllNews() {
        List<news> allNews = newsMapper.getAllNews();
        for(news tempNews : allNews) {
            if(tempNews.getTitle().length() > 20) {
                tempNews.setTitle(tempNews.getTitle().substring(0, 20)+"......");
            }

            if(tempNews.getContent().length() > 20) {
                tempNews.setContent(tempNews.getContent().substring(0, 20)+"......");
            }
        }
        return allNews;
    }

    public String addNews(news myNews) {
        Integer message = newsMapper.insert(myNews);
        return message.toString();
    }

    public String deleteNews(int newsNo) {
        Integer message = newsMapper.deleteByNum(newsNo);
        return message.toString();
    }

    public String updateNews(news myNews) {
        Integer message = newsMapper.updateNews(myNews);
        return message.toString();
    }
}
