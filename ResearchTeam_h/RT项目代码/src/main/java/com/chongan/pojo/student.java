package com.chongan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class student {
    int studentNo;
    String name;
    String level;
    int teacher;
    String education;
    String email;
    String state;
    String where;
    String other;
}
