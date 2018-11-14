package com.test.gao.cms.entity;

import lombok.Data;

import lombok.ToString;

@Data
@ToString
public class CmsUser {
    private int id;
    private String userName;
    private String userAge;
    private int userSex;

}
