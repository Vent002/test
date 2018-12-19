package com.exam.stem.last.mapper;

import com.exam.stem.last.entity.StemContentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StemContentInfoMapper {

    public StemContentInfo findById(int id);
}
