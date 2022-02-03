package com.nju.svcdisambiguation.serviceImp;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.nju.svcdisambiguation.dataMapper.acm.ACMPaperInfoMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEPaperInfoMapper;
import com.nju.svcdisambiguation.service.PaperDetailService;
import com.nju.svcdisambiguation.vo.ResponseVO;
import com.nju.svcdisambiguation.vo.detail.ReferenceVO;
import com.nju.svcdisambiguation.vo.detail.paper.PaperInfoVO;
import com.nju.svcdisambiguation.vo.detail.paper.PaperThemeVO;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class PaperDetailServiceImp implements PaperDetailService {

    private final ACMPaperInfoMapper acmPaperInfoMapper;
    private final IEEEPaperInfoMapper ieeePaperInfoMapper;

    public PaperDetailServiceImp(ACMPaperInfoMapper acmPaperInfoMapper, IEEEPaperInfoMapper ieeePaperInfoMapper) {
        this.acmPaperInfoMapper = acmPaperInfoMapper;
        this.ieeePaperInfoMapper = ieeePaperInfoMapper;
    }


    @Override
    public ResponseVO getPaperInfoByPaperId(int paperId, String db) {
        PaperInfoVO paperInfoVO = db.equals("ACM") ? acmPaperInfoMapper.selectBasicInfoByDocId(paperId) :
                ieeePaperInfoMapper.selectBasicInfoByDocId(paperId);
        String abs = paperInfoVO.getAbs();
        if(db.equals("ACM")){
            paperInfoVO.setInstitutions(acmPaperInfoMapper.searchInstitutionsByPaperId(paperId));
            paperInfoVO.setPdfLink(acmPaperInfoMapper.searchPdfLinkByPaperId(paperId));
            paperInfoVO.setAuthors(acmPaperInfoMapper.selectAuthorsByDocId(paperId));
        }
        else{
            paperInfoVO.setInstitutions(ieeePaperInfoMapper.searchInstitutionsByPaperId(paperId));
            paperInfoVO.setPdfLink(ieeePaperInfoMapper.searchPdfLinkByPaperId(paperId));
            paperInfoVO.setAuthors(ieeePaperInfoMapper.selectAuthorsByDocId(paperId));
        }
        paperInfoVO.setTheme(getThemes(abs));
        return ResponseVO.buildSuccess(paperInfoVO);
    }

    @Override
    public ResponseVO getPaperRefer(int id, String db, int page, int pageSize) {
        ArrayList<ReferenceVO> referenceVOS = db.equals("ACM") ? acmPaperInfoMapper.selectReferenceVOByPaperId(id, (page-1)*pageSize, pageSize)
                : ieeePaperInfoMapper.selectReferenceVOByPaperId(id, page, pageSize);
        for (ReferenceVO referenceVO:referenceVOS){
            int paperId = referenceVO.getId();
            referenceVO.setAuthors(db.equals("ACM") ? acmPaperInfoMapper.selectAuthorsByPaperId(paperId) : ieeePaperInfoMapper.selectAuthorsByPaperId(paperId));
            referenceVO.setKeywords(db.equals("ACM") ? acmPaperInfoMapper.selectKeywordsByPaperId(paperId) : ieeePaperInfoMapper.selectKeywordsByPaperId(paperId));
        }
        ResponseVO responseVO = new ResponseVO();
        responseVO.setMessage(
                Integer.toString(db.equals("ACM") ? acmPaperInfoMapper.selectReferenceVONumByAuthorId(id) : ieeePaperInfoMapper.selectReferenceVONumByAuthorId(id))
        );
        responseVO.setSuccess(true);
        responseVO.setContent(referenceVOS);
        return responseVO;
    }

    private ArrayList<PaperThemeVO> getThemes(String abs){
        ArrayList<PaperThemeVO> paperThemeVOS = new ArrayList<>();

        String url = "http://47.106.211.96:5000/yake/";
        Map<String,String> headers = new HashMap<>();
        headers.put("accept","application/json");
        headers.put("Content-Type","application/json");

        //post 请求
        HttpResponse<JsonNode> httpResponse = null;
        try {
            httpResponse = Unirest.post(url)
                    .headers(headers)
                    .body("{\"language\":\"en\", \"max_ngram_size\":3, \"number_of_keywords\": 15, \"text\": \"" + abs + "\"}")
                    .asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
            return paperThemeVOS;
        }
        JSONArray jsonArray = httpResponse.getBody().getArray();
        for(int i=0;i<jsonArray.length();++i){
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            double score = (Double)jsonObject.get("score");
            String ngram = (String)jsonObject.get("ngram");
            paperThemeVOS.add(new PaperThemeVO(ngram, score));
        }
        return paperThemeVOS;
    }
}
