package com.nju.svcdisambiguation.dataMapper.ieee;

import com.nju.svcdisambiguation.po.ieee.IEEEAuthorPO;
import com.nju.svcdisambiguation.po.ieee.IEEEPaperPO;
import com.nju.svcdisambiguation.vo.AuthorVO;
import com.nju.svcdisambiguation.vo.PaperVO;
import com.nju.svcdisambiguation.vo.search.AuthorSearchResultVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Mapper
@Repository
public interface IEEESearchMapper {

    ArrayList<IEEEPaperPO> selectIEEEPaperPOByAuthorName(@Param("authorName") String authorName, @Param("startTime") int startTime, @Param("endTime") int endTime);

    ArrayList<AuthorSearchResultVO> selectIEEEAuthorPOByDocId(@Param("document_id") int document_id);

    ArrayList<IEEEPaperPO> selectIEEEPaperPOByInstitutionName(@Param("institution") String institution, @Param("startTime") int startTime, @Param("endTime") int endTime);

    ArrayList<PaperVO> selectPaperVOByAuthorName(@Param("authorName") String authorName, @Param("startTime") int startTime, @Param("endTime") int endTime);

    ArrayList<AuthorVO> selectAuthorsByDocId(@Param("id") int docId);

    ArrayList<PaperVO> selectPaperVOByInsName(@Param("insName") String insName, @Param("startTime") int startTime, @Param("endTime") int endTime);

}
