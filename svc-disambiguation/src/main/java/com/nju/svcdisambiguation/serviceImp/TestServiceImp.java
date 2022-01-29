package com.nju.svcdisambiguation.serviceImp;

import com.nju.svcdisambiguation.dataMapper.acm.ACMMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEMapper;
import com.nju.svcdisambiguation.service.TestService;
import com.nju.svcdisambiguation.vo.ResponseVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TestServiceImp implements TestService {

    private final IEEEMapper ieeeMapper;
    private final ACMMapper acmMapper;
    public TestServiceImp(IEEEMapper testMapper, ACMMapper acmMapper) {
        this.ieeeMapper = testMapper;
        this.acmMapper = acmMapper;
    }


    @Override
    public ResponseVO getEmpName() {
        ArrayList<String> res = new ArrayList<>();
        res.add(ieeeMapper.selectEmp());
        res.add(acmMapper.selectEmp());
        return ResponseVO.buildSuccess(res);
    }
}
