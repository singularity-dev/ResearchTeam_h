package com.chongan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class project {
    int projectNo;
    String title;
    String content;
    String type;
    String dateBegin;
    String dateEnd;
    String state;
}
