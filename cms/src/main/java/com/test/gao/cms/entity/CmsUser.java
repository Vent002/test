package com.test.gao.cms.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CmsUser {
    private int id;
    private String userName;
    private String userAge;
    private int userSex;
}
