package com.test.gao.cms.Service.impl;

import com.test.gao.cms.Service.CmsUserService;
import com.test.gao.cms.entity.CmsUser;
import com.test.gao.cms.mapper.CmsUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmsUserServiceImpl implements CmsUserService {

    @Autowired
    private CmsUserMapper cmsUserMapper;
    public CmsUser selectById(int id) {
        return cmsUserMapper.findById(id);
    }
}
