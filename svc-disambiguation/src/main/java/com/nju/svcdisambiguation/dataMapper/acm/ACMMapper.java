package com.nju.svcdisambiguation.dataMapper.acm;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ACMMapper {
    String selectEmp();

}
