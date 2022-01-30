package com.nju.svcdisambiguation.dataMapper.acm;

import com.nju.svcdisambiguation.po.AuthorInstitutionsPO;
import com.nju.svcdisambiguation.po.FieldSummaryPO;
import com.nju.svcdisambiguation.po.PaperActivationPO;
import com.nju.svcdisambiguation.vo.AuthorVO;
import com.nju.svcdisambiguation.vo.PaperVO;
import com.nju.svcdisambiguation.vo.detail.ReferenceVO;
import com.nju.svcdisambiguation.vo.detail.author.AuthorDetailVO;
import com.nju.svcdisambiguation.vo.detail.author.AuthorPublicationSummaryVO;
import com.nju.svcdisambiguation.vo.detail.author.InstitutionAuthorDetailVO;
import com.nju.svcdisambiguation.vo.detail.author.KeywordsAuthorDetailVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Mapper
@Repository
public interface ACMAuthorDetailMapper {

    ArrayList<AuthorPublicationSummaryVO> selectAuthorPublicationSummaryByAuthorId(@Param("authorId") int authorId);

    ArrayList<FieldSummaryPO> selectFieldSummaryPOByAuthorId(@Param("authorId") int authorId);

    ArrayList<InstitutionAuthorDetailVO> selectInstitutionByAuthorId(@Param("authorId") int authorId);

    AuthorDetailVO selectAuthorDetailById(@Param("authorId") int authorId);

    ArrayList<PaperActivationPO> selectPaperActivationPOByAuthorId(@Param("authorId") int authorId);

    ArrayList<String> selectSameAuthorsByAuthorId(@Param("authorId") int authorId);

    Integer selectDocCountByAuthorId(@Param("authorId") int authorId);

    ArrayList<KeywordsAuthorDetailVO> selectKeywordsAuthorDetailByAuthorId(@Param("authorId") int authorId);

    ArrayList<PaperActivationPO> selectPAVOByFieldNameAndAuthorId(@Param("fieldName") String fieldName, @Param("authorId") int authorId);

    ArrayList<ReferenceVO> selectReferenceVOByAuthorId(@Param("id") int id, @Param("begin") int begin, @Param("pageSize") int pageSize);

    Integer selectReferenceVONumByAuthorId(@Param("id") int id);

    ArrayList<String> selectAuthorsByPaperId(@Param("id") int id);

    ArrayList<String> selectKeywordsByPaperId(@Param("id") int id);

    Integer selectAuthorReferred(@Param("id") int id);

    Integer selectDocCnt(@Param("id") int id);

    ArrayList<AuthorInstitutionsPO> selectAuthorInstitutions(@Param("id") int id);

    ArrayList<PaperVO> selectPaperVOByAuthorId(@Param("id") int id);

    ArrayList<AuthorVO> selectAuthorsByDocId(@Param("id") int docId);

    String selectKeywordsByDocId(int docId);
}
