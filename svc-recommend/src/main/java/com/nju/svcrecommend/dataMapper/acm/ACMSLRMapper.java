package com.nju.svcrecommend.dataMapper.acm;

import com.nju.svcrecommend.domain.AuthorVO;
import com.nju.svcrecommend.domain.PaperVO;
import lombok.experimental.PackagePrivate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface ACMSLRMapper {
    ArrayList<PaperVO> selectPaperVOsByKeyword(@Param("keyword") String keyword, @Param("startTime") int startTime, @Param("endTime") int endTime);

    ArrayList<AuthorVO> selectAuthorsByDocId(@Param("id") int id);

    String selectKeywordsByDocId(@Param("id")int id);
}
