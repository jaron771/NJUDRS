package com.nju.svcdisambiguation.serviceImp;

import com.nju.svcdisambiguation.vo.PaperVO;

import java.util.ArrayList;

@FunctionalInterface
public interface TriFunction {
    ArrayList<PaperVO> getPaperVO(String param, int startTime, int endTime);
}
