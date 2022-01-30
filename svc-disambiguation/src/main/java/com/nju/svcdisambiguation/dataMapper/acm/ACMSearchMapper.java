package com.nju.svcdisambiguation.dataMapper.acm;

import com.nju.svcdisambiguation.po.acm.ACMAuthorPO;
import com.nju.svcdisambiguation.po.acm.ACMPaperPO;
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
public interface ACMSearchMapper {

    ArrayList<ACMPaperPO> selectACMPaperPOByAuthorName(@Param("authorName") String authorName, @Param("startTime") int startTime, @Param("endTime") int endTime);

    Integer selectCitationsCountByDocId(@Param("document_id") int document_id);

    ArrayList<AuthorSearchResultVO> selectACMAuthorPOByDocId(@Param("document_id") int document_id);

    String selectKeywordsByDocId(@Param("document_id") int document_id);

    ArrayList<ACMPaperPO> selectACMPaperPOByInstitutionName(@Param("institution") String institution, @Param("startTime") int startTime, @Param("endTime") int endTime);

    ArrayList<PaperVO> selectPaperVOByAuthorName(@Param("authorName") String authorName, @Param("startTime") int startTime, @Param("endTime") int endTime);

    ArrayList<AuthorVO> selectAuthorsByDocId(@Param("id") int docId);

    ArrayList<PaperVO> selectPaperVOByInsName(@Param("insName") String insName, @Param("startTime") int startTime, @Param("endTime") int endTime);
}
