package com.nju.svcdisambiguation.dataMapper.ieee;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IEEEMapper {
    String selectEmp();

}
