package com.test.gao.cms.Service.impl;

import com.test.gao.cms.Service.CmsUserService;
import com.test.gao.cms.entity.CmsUser;
import com.test.gao.cms.mapper.CmsUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CmsUserServiceImpl implements CmsUserService {

    @Autowired
    private CmsUserMapper cmsUserMapper;

    public CmsUser selectById(int id) {
        return cmsUserMapper.findById(id);
    }

    public List<CmsUser> selectAll(){
        return cmsUserMapper.findAll();
    }

    public void updateUserInfo(CmsUser cmsUser) {
        cmsUserMapper.update(cmsUser);
    }


    public void insertUserInfo(CmsUser cmsUser){
        cmsUserMapper.insert(cmsUser);
    }

    public void delete(int id) {
        cmsUserMapper.delete(id);
    }

}
