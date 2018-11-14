package com.test.gao.cms.Service;

import com.test.gao.cms.entity.CmsUser;

import java.util.List;

public interface CmsUserService {

    public CmsUser selectById(int id); //搜索条件为id的用户信息
    public List<CmsUser> selectAll(); //搜索全表信息

    public void updateUserInfo(CmsUser cmsUser);

    public void insertUserInfo(CmsUser cmsUser);

    public void delete(int id);
}
