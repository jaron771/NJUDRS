package com.nju.svcdisambiguation.dataMapper.ieee;

import com.nju.svcdisambiguation.po.FieldSummaryPO;
import com.nju.svcdisambiguation.po.SameAuthorPO;
import com.nju.svcdisambiguation.vo.detail.institution.InstitutionAuthorStatVO;
import com.nju.svcdisambiguation.vo.detail.institution.InstitutionInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface IEEEInstitutionDetailMapper {
    InstitutionInfoVO selectInstitutionDetailById(@Param("institutionId") int institutionId);

    ArrayList<Integer> selectAuthorByInstitution(@Param("institutionId") int institutionId);

    ArrayList<String> selectSameInsByInstitutionId(@Param("institutionId") int institutionId);

    ArrayList<Integer> selectInstitutionAuthor(@Param("institution") String institution);

    String selectInstitutionName(@Param("institutionId") int institutionId);

    String selectAuthorName(@Param("authorId") int authorId);

    ArrayList<FieldSummaryPO> selectFieldSummaryPOByInstitutionNAME(@Param("institution") String institution);

    ArrayList<Integer> selectSameAuthorIds(@Param("id") int institutionId);

    ArrayList<SameAuthorPO> selectSameAuthorPO(@Param("id") int authorId);
}
