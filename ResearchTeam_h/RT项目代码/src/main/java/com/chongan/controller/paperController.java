package com.chongan.controller;

import com.alibaba.fastjson.JSONObject;
import com.chongan.pojo.paper;
import com.chongan.service.paperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paperController {
    @Autowired
    private paperService paperService;

    @RequestMapping("getLatePaper")
    public String gerLatePaper() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("paperList", paperService.getLatePaper());
        return jsonObject.toJSONString();
    }

    @RequestMapping("getAllPaper")
    public String getAllPaper() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("paperList", paperService.getAllPaper());
        return jsonObject.toJSONString();
    }

    @RequestMapping("getAllPatent")
    public String getAllPatent() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("patentList", paperService.getAllPatent());
        return jsonObject.toJSONString();
    }

    @RequestMapping("getAllPaperAndPatent")
    public String getAll(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", paperService.getAll());
        return jsonObject.toJSONString();
    }

    @RequestMapping("addPaper")
    public String addPaper(paper myPaper) {
        return paperService.addPaper(myPaper);
    }

    @RequestMapping("/deletePaper/{num}")
    public String deletePaper(@PathVariable String num) {
        int n = Integer.parseInt(num);
        return paperService.deletePaper(n);
    }

    @RequestMapping("/getPaper/{id}")
    public String getPaperbyId(@PathVariable String id) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("paper", paperService.getPaperbyId(id));
        return jsonObject.toJSONString();
    }

    @RequestMapping("/updatePaper")
    public String updatePaper(paper myPaper) {
        return paperService.updatePaper(myPaper);
    }
}
