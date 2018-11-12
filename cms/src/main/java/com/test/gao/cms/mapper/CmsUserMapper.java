package com.test.gao.cms.mapper;

import com.test.gao.cms.entity.CmsUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CmsUserMapper {

    CmsUser findById(int id);
   // public List<CmsUser> findAll();
}
