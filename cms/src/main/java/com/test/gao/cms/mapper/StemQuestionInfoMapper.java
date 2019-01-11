package com.test.gao.cms.mapper;

import com.test.gao.cms.entity.StemQuestionInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StemQuestionInfoMapper {

    public List<StemQuestionInfo> findQuestionById(int questionid);

}
