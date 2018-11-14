package com.test.gao.cms.mapper;

import com.test.gao.cms.entity.CmsUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CmsUserMapper {

    public CmsUser findById(int id);

    public List<CmsUser> findAll();

    public void update(CmsUser cmsUser);

    public void insert(CmsUser cmsUser);

    public void delete(int id);
}
