package com.test.gao.cms.Service.impl;

import com.test.gao.cms.Service.CmsUserService;
import com.test.gao.cms.entity.CmsUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsUserServiceImplTest {

    @Autowired
    private CmsUserService cmsUserService;
    @Test
    public void selectById() {
        System.out.println(cmsUserService.selectById(3));
    }

    @Test
    public void selectAll() {
        System.out.println(cmsUserService.selectAll());
    }


    @Test
    public void updateUserInfo() {
        CmsUser cmsUser = cmsUserService.selectById(6);
        cmsUser.setUserSex(1);
        cmsUserService.updateUserInfo(cmsUser);
    }

    @Test
    public void insertUserInfo() {
        CmsUser cmsUser = new CmsUser();
        cmsUser.setUserName("Insert");
        cmsUser.setUserAge("23");
        cmsUser.setUserSex(1);
        cmsUserService.insertUserInfo(cmsUser);

    }
    @Test
    public void delete(){
        cmsUserService.delete(3);
    }
}