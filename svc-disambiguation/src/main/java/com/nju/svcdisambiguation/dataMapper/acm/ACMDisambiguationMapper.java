package com.nju.svcdisambiguation.dataMapper.acm;

import com.nju.svcdisambiguation.po.CalLengthPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
@Repository
public interface ACMDisambiguationMapper {
    String selectAuthorNameById(@Param("id") int id);

    void setAuthorAlias(@Param("id") int id, @Param("alias") int alias);

    String selectInsNameById(@Param("id") int id);

    void setInsAlias(@Param("id") int id, @Param("alias") int alias);

    Integer getMaxAuthorAlias();

    Integer getMaxInsAlias();

    Integer selectAuthorAliasById(@Param("id") int id);

    Integer selectInsAliasById(@Param("id") int id);

    Integer[] selectAuthorIds(@Param("regx") String regx, @Param("length") int length);

    ArrayList<CalLengthPO> selectAuthorCalLengthPO();

    void updateAuthorLength(@Param("id") int id, @Param("length") int length);

    ArrayList<CalLengthPO> selectInsCalLengthPO();

    void updateInsLength(@Param("id") int id, @Param("length") int length);

    Integer[] selectInsIds(@Param("regx") String regx, @Param("length") int length);
}
