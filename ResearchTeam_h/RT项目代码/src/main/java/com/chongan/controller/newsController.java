package com.chongan.controller;

import com.alibaba.fastjson.JSONObject;
import com.chongan.pojo.news;
import com.chongan.service.newsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newsController {
    @Autowired
    private newsService newsService;

    @RequestMapping("getLateNews")
    public String getLateNews() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("newsList", newsService.getLateNews());
        return jsonObject.toJSONString();
    }

    @RequestMapping("getNewsNum")
    public String getNewsNum() {
        return newsService.getNewsNum()+"";
    }

    @RequestMapping("/getPageNews/{page}")
    public String getPageNews(@PathVariable String page) {
        int p = Integer.parseInt(page);
        p = (p-1)*14;
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("pageList", newsService.getPageNews(p));
        return jsonObject.toJSONString();
    }

    @RequestMapping("/getNews/{num}")
    public String getNewsByNum(@PathVariable String num) {
        int n = Integer.parseInt(num);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("news", newsService.getNewsbyNum(n));
        return jsonObject.toJSONString();
    }

    @RequestMapping("getAllNews")
    public String getAllNews() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", newsService.getAllNews());
        return jsonObject.toJSONString();
    }

    @RequestMapping("addNews")
    public String addNews(news myNews) {
        return newsService.addNews(myNews);
    }

    @RequestMapping("/deleteNews/{num}")
    public String deleteNews(@PathVariable String num) {
        int n = Integer.parseInt(num);
        return newsService.deleteNews(n);
    }

    @RequestMapping("/updateNews")
    public String updateNews(news myNews) {
        return newsService.updateNews(myNews);
    }
}
