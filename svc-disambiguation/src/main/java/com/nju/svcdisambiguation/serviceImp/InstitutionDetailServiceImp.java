package com.nju.svcdisambiguation.serviceImp;

import com.nju.svcdisambiguation.dataMapper.acm.ACMAuthorDetailMapper;
import com.nju.svcdisambiguation.dataMapper.acm.ACMInstitutionDetailMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEAuthorDetailMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEInstitutionDetailMapper;
import com.nju.svcdisambiguation.po.FieldSummaryPO;
import com.nju.svcdisambiguation.po.PaperActivationPO;
import com.nju.svcdisambiguation.po.SameAuthorPO;
import com.nju.svcdisambiguation.service.InstitutionDetailService;
import com.nju.svcdisambiguation.vo.ResponseVO;
import com.nju.svcdisambiguation.vo.detail.institution.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;

@Service
public class InstitutionDetailServiceImp implements InstitutionDetailService {

    private final IEEEInstitutionDetailMapper ieeeInstitutionDetailMapper;
    private final ACMInstitutionDetailMapper acmInstitutionDetailMapper;
    private final IEEEAuthorDetailMapper ieeeAuthorDetailMapper;
    private final ACMAuthorDetailMapper acmAuthorDetailMapper;


    public InstitutionDetailServiceImp(IEEEInstitutionDetailMapper ieeeInstitutionDetailMapper, ACMInstitutionDetailMapper acmInstitutionDetailMapper,IEEEAuthorDetailMapper ieeeAuthorDetailMapper, ACMAuthorDetailMapper acmAuthorDetailMapper) {
        this.ieeeInstitutionDetailMapper = ieeeInstitutionDetailMapper;
        this.acmInstitutionDetailMapper = acmInstitutionDetailMapper;
        this.ieeeAuthorDetailMapper = ieeeAuthorDetailMapper;
        this.acmAuthorDetailMapper = acmAuthorDetailMapper;
    }


    @Override
    public ResponseVO getInstitutionInfo(int instituteId, String db) {
        if (db.equals("ACM")) {
            InstitutionInfoVO institutionInfoVO = acmInstitutionDetailMapper.selectInstitutionDetailById(instituteId);
            if (institutionInfoVO == null) {return ResponseVO.buildFailure("Institution does not exist.");}
            ArrayList<String> sameIns = acmInstitutionDetailMapper.selectSameInsByInstitutionId(instituteId);
            if (sameIns.size() > 0) {
                institutionInfoVO.setSameIns(sameIns);
            }
            ArrayList<Integer> a1=new ArrayList<Integer>();
            //作者id表
            int temp=0;
            a1=acmInstitutionDetailMapper.selectInstitutionAuthor(acmInstitutionDetailMapper.selectInstitutionName(instituteId));
            if(a1.size() > 0) {
                institutionInfoVO.setAuthorCount(a1.size());
                for (int i = 0; i < a1.size(); i++) {
                    temp = temp + acmAuthorDetailMapper.selectDocCountByAuthorId(a1.get(i));
                }
            }
            institutionInfoVO.setPaperCount(temp);
            institutionInfoVO.setDb("ACM");
            return ResponseVO.buildSuccess(institutionInfoVO);
        }
        InstitutionInfoVO institutionInfoVO = ieeeInstitutionDetailMapper.selectInstitutionDetailById(instituteId);
        if (institutionInfoVO == null) {return ResponseVO.buildFailure("Institution does not exist.");}
        ArrayList<String> sameIns = ieeeInstitutionDetailMapper.selectSameInsByInstitutionId(instituteId);
        if (sameIns.size() > 0) {
            institutionInfoVO.setSameIns(sameIns);
        }
        ArrayList<Integer> a2=new ArrayList<Integer>();
        int temp=0;
        a2=ieeeInstitutionDetailMapper.selectInstitutionAuthor(ieeeInstitutionDetailMapper.selectInstitutionName(instituteId));
        if (a2.size() > 0) {
            institutionInfoVO.setAuthorCount(a2.size());
            for (int i = 0; i < a2.size(); i++) {
                temp = temp + ieeeAuthorDetailMapper.selectDocCountByAuthorId(a2.get(i));
            }
        }
        institutionInfoVO.setPaperCount(temp);
        institutionInfoVO.setDb("IEEE");
        return ResponseVO.buildSuccess(institutionInfoVO);
    }

    @Override
    public ResponseVO getInstitutionFieldStat(int instituteId, String db) {
        ArrayList<FieldSummaryPO> fieldSummaryPOS = new ArrayList<>();
        ArrayList<InstitutionFieldSummaryVO> institutionFieldSummaryVOS = new ArrayList<>();
        if (db.equals("ACM")){
            fieldSummaryPOS = acmInstitutionDetailMapper.selectFieldSummaryPOByInstitutionNAME(acmInstitutionDetailMapper.selectInstitutionName(instituteId));
            for (FieldSummaryPO fieldSummaryPO:fieldSummaryPOS){
                InstitutionFieldSummaryVO institutionFieldSummaryVO = new InstitutionFieldSummaryVO(
                        fieldSummaryPO.getFieldId(),
                        fieldSummaryPO.getFieldName(),
                        fieldSummaryPO.getCount(),
                        "ACM"
                );
                institutionFieldSummaryVOS.add(institutionFieldSummaryVO);
            }
            return ResponseVO.buildSuccess(institutionFieldSummaryVOS);
        }
        fieldSummaryPOS = ieeeInstitutionDetailMapper.selectFieldSummaryPOByInstitutionNAME(ieeeInstitutionDetailMapper.selectInstitutionName(instituteId));
        for (FieldSummaryPO fieldSummaryPO:fieldSummaryPOS){
            InstitutionFieldSummaryVO institutionFieldSummaryVO = new InstitutionFieldSummaryVO(
                    fieldSummaryPO.getFieldId(),
                    fieldSummaryPO.getFieldName(),
                    fieldSummaryPO.getCount(),
                    "IEEE"
            );
            System.out.println("a");
            institutionFieldSummaryVOS.add(institutionFieldSummaryVO);
        }
        return ResponseVO.buildSuccess(institutionFieldSummaryVOS);

    }

    @Override
    public ResponseVO getInstitutionAuthorStat(int instituteId, String db) {
        if (db.equals("ACM")) {

            ArrayList<InstitutionAuthorStatVO> institutionAuthorStatVOs = new ArrayList<>();
            ArrayList<Integer> a1=new ArrayList<Integer>();
            a1=acmInstitutionDetailMapper.selectInstitutionAuthor(acmInstitutionDetailMapper.selectInstitutionName(instituteId));
            for(int i=0;i<a1.size();i++){
                InstitutionAuthorStatVO institutionAuthorStatVO = new InstitutionAuthorStatVO();
                institutionAuthorStatVO.setDb(db);
                institutionAuthorStatVO.setId(a1.get(i));
                institutionAuthorStatVO.setName(acmInstitutionDetailMapper.selectAuthorName(a1.get(i)));
                ArrayList<Integer> a2=new ArrayList<Integer>();
                int temp=0;
                a2=acmInstitutionDetailMapper.selectInstitutionAuthor(acmInstitutionDetailMapper.selectInstitutionName(instituteId));
                for(int j=0;j<a2.size();j++){
                    temp=temp+ acmAuthorDetailMapper.selectDocCountByAuthorId(a2.get(j));
                }
                institutionAuthorStatVO.setPaperCount(temp);
                institutionAuthorStatVOs.add(institutionAuthorStatVO);
            }


            return ResponseVO.buildSuccess(institutionAuthorStatVOs);
        }
        ArrayList<InstitutionAuthorStatVO> institutionAuthorStatVOs = new ArrayList<>();
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1=ieeeInstitutionDetailMapper.selectInstitutionAuthor(ieeeInstitutionDetailMapper.selectInstitutionName(instituteId));
        for(int i=0;i<a1.size();i++){
            InstitutionAuthorStatVO institutionAuthorStatVO = new InstitutionAuthorStatVO();
            institutionAuthorStatVO.setDb(db);
            institutionAuthorStatVO.setId(a1.get(i));
            institutionAuthorStatVO.setName(ieeeInstitutionDetailMapper.selectAuthorName(a1.get(i)));
            ArrayList<Integer> a2=new ArrayList<Integer>();
            int temp=0;
            a2=ieeeInstitutionDetailMapper.selectInstitutionAuthor(ieeeInstitutionDetailMapper.selectInstitutionName(instituteId));
            for(int j=0;j<a2.size();j++){
                temp=temp+ ieeeAuthorDetailMapper.selectDocCountByAuthorId(a2.get(j));
            }
            institutionAuthorStatVO.setPaperCount(temp);
            institutionAuthorStatVOs.add(institutionAuthorStatVO);
        }
        return ResponseVO.buildSuccess(institutionAuthorStatVOs);
    }


    @Override
    public ResponseVO getInstitutionAuthorActivation(int instituteId, String db) {
        if (db.equals("ACM")) {

            ArrayList<InstitutionAuthorActivationVO> institutionAuthorActivationVOs = new ArrayList<>();
            ArrayList<Integer> a1=new ArrayList<Integer>();
            a1=acmInstitutionDetailMapper.selectInstitutionAuthor(acmInstitutionDetailMapper.selectInstitutionName(instituteId));
            for(int i=0;i<a1.size();i++){
                if((acmInstitutionDetailMapper.selectAuthorName(a1.get(i)))!=null){
                    InstitutionAuthorActivationVO institutionAuthorActivationVO = new InstitutionAuthorActivationVO();
                    institutionAuthorActivationVO.setDb(db);
                    institutionAuthorActivationVO.setId(a1.get(i));
                    institutionAuthorActivationVO.setName(acmInstitutionDetailMapper.selectAuthorName(a1.get(i)));
                    ArrayList<PaperActivationPO> paperActivationPOS = acmAuthorDetailMapper.selectPaperActivationPOByAuthorId(a1.get(i));
                    institutionAuthorActivationVO.setActivation(calculateActivation(paperActivationPOS));
                    institutionAuthorActivationVOs.add(institutionAuthorActivationVO);
                }
            }
            return ResponseVO.buildSuccess(institutionAuthorActivationVOs);
        }
        ArrayList<InstitutionAuthorActivationVO> institutionAuthorActivationVOs = new ArrayList<>();
        ArrayList<Integer> a1=new ArrayList<Integer>();
        a1=ieeeInstitutionDetailMapper.selectInstitutionAuthor(ieeeInstitutionDetailMapper.selectInstitutionName(instituteId));
        for(int i=0;i<a1.size();i++){
            InstitutionAuthorActivationVO institutionAuthorActivationVO = new InstitutionAuthorActivationVO();
            institutionAuthorActivationVO.setDb(db);
            institutionAuthorActivationVO.setId(a1.get(i));
            institutionAuthorActivationVO.setName(ieeeInstitutionDetailMapper.selectAuthorName(a1.get(i)));
            ArrayList<PaperActivationPO> paperActivationPOS = ieeeAuthorDetailMapper.selectPaperActivationPOByAuthorId(a1.get(i));
            institutionAuthorActivationVO.setActivation(calculateActivation(paperActivationPOS));
            institutionAuthorActivationVOs.add(institutionAuthorActivationVO);
        }
        return ResponseVO.buildSuccess(institutionAuthorActivationVOs);
    }

    @Override
    public ResponseVO getInstitutionSameAuthors(int id, String db) {
        ArrayList<ArrayList<SameAuthorPO>> sameAuthors = new ArrayList<>();
        ArrayList<Integer> ids = db.equals("ACM") ? acmInstitutionDetailMapper.selectSameAuthorIds(id) :
                ieeeInstitutionDetailMapper.selectSameAuthorIds(id);
        for(Integer authorId: ids){
            sameAuthors.add(
                    db.equals("ACM") ? acmInstitutionDetailMapper.selectSameAuthorPO(authorId) :
                            ieeeInstitutionDetailMapper.selectSameAuthorPO(authorId)
            );
        }
        return ResponseVO.buildSuccess(sameAuthors);
    }

    private double calculateActivation(ArrayList<PaperActivationPO> paperActivationPOS) {
        double ret = 0.0;
        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);

        for(PaperActivationPO paperActivationPO:paperActivationPOS){
            ret += (double)paperActivationPO.getCitations()/(year - paperActivationPO.getYear() + 1.0);
        }

        return ret;
    }

}
