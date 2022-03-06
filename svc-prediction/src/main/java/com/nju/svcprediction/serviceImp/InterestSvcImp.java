package com.nju.svcprediction.serviceImp;

import com.nju.svcprediction.dataMapper.acm.ACMInterestMapper;
import com.nju.svcprediction.dataMapper.ieee.IEEEInterestMapper;
import com.nju.svcprediction.domain.Document;
import com.nju.svcprediction.domain.InterestRes;
import com.nju.svcprediction.domain.ResponseVO;
import com.nju.svcprediction.service.InterestSvc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class InterestSvcImp implements InterestSvc {

    private final ACMInterestMapper acmInterestMapper;
    private final IEEEInterestMapper ieeeInterestMapper;

    public InterestSvcImp(ACMInterestMapper acmInterestMapper, IEEEInterestMapper ieeeInterestMapper) {
        this.acmInterestMapper = acmInterestMapper;
        this.ieeeInterestMapper = ieeeInterestMapper;
    }

    @Override
    public ResponseVO getHistoryKeywords(int id, String db) {

        ArrayList<InterestRes> interestRes = new ArrayList<>();

        if (db.equals("ACM")) {
            interestRes = acmInterestMapper.getInterestHistoryByAuthorId(id);
        }
        else {
            interestRes = ieeeInterestMapper.getInterestHistoryByAuthorId(id);
        }

        ArrayList<InterestRes> res = new ArrayList<>();
        if(interestRes.size() > 0) {
            res.add(interestRes.get(0));
            int year = interestRes.get(0).getYear();
            for (int i = 1; i < interestRes.size(); ++i) {
                if (interestRes.get(i).getYear() == year + 1) {
                    res.add(interestRes.get(i));
                    year++;
                }
            }
        }
        return ResponseVO.buildSuccess(res);
    }

    @Override
    public ResponseVO getFutureKeywords(int id, String db) {

        ResponseVO keywordsHistory = getHistoryKeywords(id, db);
        ArrayList<InterestRes> interestRes = ((ArrayList<InterestRes>) keywordsHistory.getContent());
        int time = 2020;
        if(interestRes.size() > 0) {
            time = interestRes.get(interestRes.size() - 1).getYear();
        }
        InterestRes res = new InterestRes();
        res.setYear(time+1);

        if(db.equals("ACM")) {
            res.setWord(acmInterestMapper.getInterestPrediction(id, time));
        }
        else{
            res.setWord(ieeeInterestMapper.getInterestPrediction(id, time));
        }

        ArrayList<InterestRes> interestResArrayList = new ArrayList<>();
        interestResArrayList.add(res);

        return ResponseVO.buildSuccess(interestResArrayList);
    }

    @Override
    public InterestRes getFutureKeywords(ArrayList<Document> documents) {
        int recent_year = -1;
        for(Document document: documents){
            if(document.getYear()>recent_year){
                recent_year = document.getYear();
            }
        }
        HashMap<String, Integer> kw_cnt_map = new HashMap<>();
        for(Document document:documents){
            if(document.getYear()==recent_year){
                for(String kw:document.getKeywords()){
                    if(kw_cnt_map.containsKey(kw)) {
                        kw_cnt_map.put(kw, kw_cnt_map.get(kw)+1);
                    }
                    else{
                        kw_cnt_map.put(kw, 1);
                    }
                }
            }
        }
        int max_count = -1;
        String res = "";
        for(Map.Entry<String, Integer> entry: kw_cnt_map.entrySet()){
            if(entry.getValue()>max_count){
                max_count=entry.getValue();
                res=entry.getKey();
            }
        }
        return new InterestRes(recent_year+1, res);
    }
}
