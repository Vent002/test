package com.test.gao.cms.mapper;

import com.test.gao.cms.entity.StemInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StemInfoMapper {
    public StemInfo findByStemId(int stemid);
}
