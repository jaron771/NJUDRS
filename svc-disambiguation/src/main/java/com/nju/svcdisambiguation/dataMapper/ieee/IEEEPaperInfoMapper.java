package com.nju.svcdisambiguation.dataMapper.ieee;

import com.nju.svcdisambiguation.po.PaperInstitutionsPO;
import com.nju.svcdisambiguation.vo.AuthorVO;
import com.nju.svcdisambiguation.vo.detail.ReferenceVO;
import com.nju.svcdisambiguation.vo.detail.paper.PaperInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface IEEEPaperInfoMapper {

    ArrayList<PaperInstitutionsPO> searchInstitutionsByPaperId(@Param("paperId") int paperId);

    String searchPdfLinkByPaperId(@Param("paperId") int paperId);

    String searchAbsByPaperId(@Param("paperId") int paperId);

    ArrayList<ReferenceVO> selectReferenceVOByPaperId(@Param("id") int id, @Param("begin") int begin, @Param("pageSize") int pageSize);

    Integer selectReferenceVONumByAuthorId(@Param("id") int id);

    ArrayList<String> selectAuthorsByPaperId(@Param("id") int id);

    ArrayList<String> selectKeywordsByPaperId(@Param("id") int id);

    PaperInfoVO selectBasicInfoByDocId(@Param("id") int paperId);

    ArrayList<AuthorVO> selectAuthorsByDocId(@Param("id") int paperId);
}
