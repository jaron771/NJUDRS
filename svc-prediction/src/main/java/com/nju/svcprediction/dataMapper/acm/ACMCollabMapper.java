package com.nju.svcprediction.dataMapper.acm;

import com.nju.svcprediction.domain.CollabPredictRes;
import com.nju.svcprediction.domain.Edge;
import com.nju.svcprediction.domain.EdgePO;
import com.nju.svcprediction.domain.VeticleContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface ACMCollabMapper {

    ArrayList<EdgePO> getEdgesByAuthorId(@Param("id") int id);

    VeticleContent getVeticleContent(@Param("id") Integer authorId);

    ArrayList<Integer> getFutureCollab(@Param("keyword") String keyword);

    CollabPredictRes getDataById(@Param("id") int id);

    String getAuthorName(@Param("id") int id);
}
