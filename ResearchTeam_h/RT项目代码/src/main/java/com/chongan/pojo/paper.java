package com.chongan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class paper {
    int paperNo;
    String content;
    String title;
    String date;
    String type;
}
