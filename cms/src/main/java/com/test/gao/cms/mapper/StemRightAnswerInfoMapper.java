package com.test.gao.cms.mapper;

import com.test.gao.cms.entity.StemRightAnswerInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface StemRightAnswerInfoMapper {
    List<StemRightAnswerInfo> findAllAnswerById(int answerid);

    List<StemRightAnswerInfo> findAnswerById(int answerid);

}
