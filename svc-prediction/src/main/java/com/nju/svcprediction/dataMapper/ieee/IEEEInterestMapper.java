package com.nju.svcprediction.dataMapper.ieee;

import com.nju.svcprediction.domain.InterestRes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface IEEEInterestMapper {

    ArrayList<InterestRes> getInterestHistoryByAuthorId(@Param("id") int id);

    String getInterestPrediction(@Param("id") int id, @Param("time") int time);

    ArrayList<Integer> getFutureCollab(@Param("id") int id);
}
