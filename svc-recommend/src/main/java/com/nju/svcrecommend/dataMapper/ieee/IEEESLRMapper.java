package com.nju.svcrecommend.dataMapper.ieee;

import com.nju.svcrecommend.domain.AuthorVO;
import com.nju.svcrecommend.domain.PaperVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Mapper
public interface IEEESLRMapper {
    ArrayList<PaperVO> selectPaperVOsByKeyword(@Param("keyword") String keyword, @Param("startTime") int startTime, @Param("endTime") int endTime);

    ArrayList<AuthorVO> selectAuthorsByDocId(@Param("id") int id);
}
