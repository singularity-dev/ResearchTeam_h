package com.chongan.service;

import com.chongan.dao.userMapper;
import com.chongan.pojo.teacher;
import com.chongan.pojo.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class otherService {
    @Autowired
    private userMapper userMapper;

    public String addBigImg(String imgNo, MultipartFile bigImg) {

        String filePath = "/home/researshTeam/img/";
        //String filePath = "D:/Desktop/ResearchTeam/static/img/";
        String fileName = "bigImg0" + imgNo + ".jpg";

        try {
            FileOutputStream out = new FileOutputStream(filePath+fileName);
            out.write(bigImg.getBytes());
            out.flush();
            out.close();
        } catch(IOException e) {
            e.printStackTrace();
            return "-1";
        }
        return "1";
    }

    public boolean login(String username, String password) {
        if(username == null || password == null)
            return false;
        user tempUser = userMapper.getUserbyName(username);
        if(tempUser == null)
            return false;
        if(password.equals(tempUser.getPassword()))
            return true;
        else
            return false;
    }

    public String addUser(String username, String password) {
        Integer message = userMapper.deletebyName(username);
        if(message == 1) {
            message = userMapper.addUser(new user(username, password));
            return message.toString();
        }
        return "-1";
    }
}

