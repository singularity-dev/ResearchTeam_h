package com.chongan.service;

import com.chongan.dao.paperMapper;
import com.chongan.pojo.news;
import com.chongan.pojo.paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class paperService {
    @Autowired
    private paperMapper paperMapper;

    public List<paper> getLatePaper() {
        List<paper> LatePaper = paperMapper.getLatePaper();
        for(paper tempPaper : LatePaper) {
            if(tempPaper.getTitle().length() > 40) {
                tempPaper.setTitle(tempPaper.getTitle().substring(0, 40)+"......");
            }
        }
        return LatePaper;
    }

    public List<paper> getAllPaper() {
        return paperMapper.getAllPaper();
    }

    public List<paper> getAllPatent() {
        return paperMapper.getAllPatent();
    }

    public List<paper> getAll() {
        List<paper> allPaper = paperMapper.getAll();
        for(paper tempPaper : allPaper) {
            if(tempPaper.getTitle().length() > 20) {
                tempPaper.setTitle(tempPaper.getTitle().substring(0, 20)+"......");
            }
        }
        return allPaper;
    }

    public String addPaper(paper myPaper) {
        Integer message = paperMapper.insert(myPaper);
        return message.toString();
    }

    public String deletePaper(int num) {
        Integer message = paperMapper.deleteByNum(num);
        return message.toString();
    }

    public paper getPaperbyId(String paperId) {
        return paperMapper.getPaperbyId(paperId);
    }

    public String updatePaper(paper myPaper) {
        Integer message = paperMapper.updatePaper(myPaper);
        return message.toString();
    }
}
