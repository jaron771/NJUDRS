package com.nju.svcrecommend.dataMapper.ieee;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface IEEEReviewerMapper {
    String getPublication(@Param("publication") String publication);

    ArrayList<Integer> getRecommendReviewersId(@Param("publication") String publication, @Param("keyword") String keyword);

    String getReviewerName(@Param("id") int id);

    ArrayList<String> getReviewerIns(@Param("id") int id);

    ArrayList<String> getReviewerKeywords(@Param("id") int id);

    ArrayList<Integer> getSameInsAuthorIDs(@Param("name") String name);
}
