package com.langfeiyes.rest.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ordering {
    private Long id;
    private String title;
    private String user;
    private String carrier;
    private String good;
    private String date;
    private String remark;
}