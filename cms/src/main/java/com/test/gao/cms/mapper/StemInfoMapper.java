package com.test.gao.cms.mapper;

import com.test.gao.cms.entity.StemInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StemInfoMapper {
    StemInfo findStemById(int stemid);

    int insert(StemInfo stemInfo);

}
