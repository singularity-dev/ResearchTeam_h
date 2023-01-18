package com.chongan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class news {
    int newsNo;
    String date;
    String author;
    String title;
    String content;
}
