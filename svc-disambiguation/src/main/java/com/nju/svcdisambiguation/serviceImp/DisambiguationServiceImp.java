package com.nju.svcdisambiguation.serviceImp;

import com.nju.svcdisambiguation.dataMapper.acm.ACMDisambiguationMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEDisambiguationMapper;
import com.nju.svcdisambiguation.po.CalLengthPO;
import com.nju.svcdisambiguation.service.DisambiguationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DisambiguationServiceImp implements DisambiguationService {

    private final ACMDisambiguationMapper acmDisambiguationMapper;
    private final IEEEDisambiguationMapper ieeeDisambiguationMapper;

    public DisambiguationServiceImp(ACMDisambiguationMapper acmDisambiguationMapper, IEEEDisambiguationMapper ieeeDisambiguationMapper) {
        this.acmDisambiguationMapper = acmDisambiguationMapper;
        this.ieeeDisambiguationMapper = ieeeDisambiguationMapper;
    }

    @Override
    public double getAuthorSimilarity(String db, int id1, int id2) {
        String name1 = db.equals("ACM") ? acmDisambiguationMapper.selectAuthorNameById(id1) : ieeeDisambiguationMapper.selectAuthorNameById(id1);
        String name2 = db.equals("ACM") ? acmDisambiguationMapper.selectAuthorNameById(id2) : ieeeDisambiguationMapper.selectAuthorNameById(id2);
        double ret = getAuthorNameSimilarity(name1, name2);
        if (ret > 0){
            int maxAlias = db.equals("ACM") ? acmDisambiguationMapper.getMaxAuthorAlias() : ieeeDisambiguationMapper.getMaxAuthorAlias();
            int alias1 = db.equals("ACM") ? acmDisambiguationMapper.selectAuthorAliasById(id1) : ieeeDisambiguationMapper.selectAuthorAliasById(id1);
            int alias2 = db.equals("ACM") ? acmDisambiguationMapper.selectAuthorAliasById(id2) : ieeeDisambiguationMapper.selectAuthorAliasById(id2);
            int targetAlias = -1;
            if(alias1 == 0 && alias2 == 0){
                targetAlias = maxAlias + 1;
            }
            else if(alias1 == 0 && alias2 != 0){
                targetAlias = alias2;
            }
            else{
                targetAlias = alias1;
            }
            if (db.equals("ACM")){
                acmDisambiguationMapper.setAuthorAlias(id1, targetAlias);
                acmDisambiguationMapper.setAuthorAlias(id2, targetAlias);
                System.out.print(db+" ");
                System.out.print(id1);
                System.out.print(" ");
                System.out.println(id2);
            }
            else {
                ieeeDisambiguationMapper.setAuthorAlias(id1, targetAlias);
                ieeeDisambiguationMapper.setAuthorAlias(id2, targetAlias);
                System.out.print(db+" ");
                System.out.print(id1);
                System.out.print(" ");
                System.out.println(id2);
            }
        }
        return ret;
    }

    @Override
    public double getInsSimilarity(String db, int id1, int id2) {
        String name1 = db.equals("ACM") ? acmDisambiguationMapper.selectInsNameById(id1) : ieeeDisambiguationMapper.selectInsNameById(id1);
        String name2 = db.equals("ACM") ? acmDisambiguationMapper.selectInsNameById(id2) : ieeeDisambiguationMapper.selectInsNameById(id2);
        double ret = getInsNameSimilarity(name1, name2);
        if (ret > 0) {
            int maxAlias = db.equals("ACM") ? acmDisambiguationMapper.getMaxInsAlias() : ieeeDisambiguationMapper.getMaxInsAlias();
            int alias1 = db.equals("ACM") ? acmDisambiguationMapper.selectInsAliasById(id1) : ieeeDisambiguationMapper.selectInsAliasById(id1);
            int alias2 = db.equals("ACM") ? acmDisambiguationMapper.selectInsAliasById(id2) : ieeeDisambiguationMapper.selectInsAliasById(id2);
            int targetAlias = -1;
            if(alias1 == 0 && alias2 == 0){
                targetAlias = maxAlias + 1;
            }
            else if(alias1 == 0 && alias2 != 0){
                targetAlias = alias2;
            }
            else{
                targetAlias = alias1;
            }
            if (db.equals("ACM")){
                acmDisambiguationMapper.setInsAlias(id1, targetAlias);
                acmDisambiguationMapper.setInsAlias(id2, targetAlias);
            }
            else {
                ieeeDisambiguationMapper.setInsAlias(id1, targetAlias);
                ieeeDisambiguationMapper.setInsAlias(id2, targetAlias);
            }
        }
        return ret;
    }

    @Override
    public void startAuthorDisambiguation(String db, char alpha, int length) {
        Integer[] ids = db.equals("ACM") ? acmDisambiguationMapper.selectAuthorIds(alpha +"%", length) : ieeeDisambiguationMapper.selectAuthorIds(alpha+"%", length);
        for(int i=0;i<ids.length-1;++i){
            for(int j=i+1;j<ids.length;++j){
                getAuthorSimilarity(db, ids[i], ids[j]);
                System.out.print(alpha+" ");
                System.out.print(i);
                System.out.print(" ");
                System.out.print(j);
                System.out.print(" ");
                double percent = (double)((2*ids.length-2-i)*(i+1)/2+j-i)/(double)(ids.length*(ids.length-1)/2);
                System.out.println(percent);
            }
        }
    }

    @Override
    public void startInsDisambiguation(String db, char alpha, int length) {
        Integer[] ids = db.equals("ACM") ? acmDisambiguationMapper.selectInsIds(alpha +"%", length) : ieeeDisambiguationMapper.selectInsIds(alpha+"%", length);
        for(int i=0;i<ids.length-1;++i){
            for(int j=i+1;j<ids.length;++j){
                getInsSimilarity(db, ids[i], ids[j]);
                System.out.print(alpha+" ");
                System.out.print(i);
                System.out.print(" ");
                System.out.print(j);
                System.out.print(" ");
                double percent = (double)((2*ids.length-2-i)*(i+1)/2+j-i)/(double)(ids.length*(ids.length-1)/2);
                System.out.println(percent);
            }
        }
    }

    @Override
    public void calLength(String table, String db) {
        if(table.equals("ins")){
            ArrayList<CalLengthPO> calLengthPOS = db.equals("ACM") ?
                    acmDisambiguationMapper.selectInsCalLengthPO() : ieeeDisambiguationMapper.selectInsCalLengthPO();
            for(CalLengthPO calLengthPO: calLengthPOS){
                calLengthPO.setLength(calLengthPO.getName().replace('.', '\0').replace(',', ' ').split("\\s+").length);
                if(db.equals("ACM")){
                    acmDisambiguationMapper.updateInsLength(calLengthPO.getId(), calLengthPO.getLength());
                }
                else {
                    ieeeDisambiguationMapper.updateInsLength(calLengthPO.getId(), calLengthPO.getLength());
                }
                System.out.print("ins "+db+" ");
                System.out.println(calLengthPO.toString());
            }
        }
        else if(table.equals("author")){
            ArrayList<CalLengthPO> calLengthPOS = db.equals("ACM") ?
                    acmDisambiguationMapper.selectAuthorCalLengthPO() : ieeeDisambiguationMapper.selectAuthorCalLengthPO();
            for(CalLengthPO calLengthPO: calLengthPOS){
                calLengthPO.setLength(calLengthPO.getName().replace('.', ' ').replace(',', ' ').split("\\s+").length);
                if(db.equals("ACM")){
                    acmDisambiguationMapper.updateAuthorLength(calLengthPO.getId(), calLengthPO.getLength());
                }
                else {
                    ieeeDisambiguationMapper.updateAuthorLength(calLengthPO.getId(), calLengthPO.getLength());
                }
                System.out.print("author "+db+" ");
                System.out.println(calLengthPO.toString());
            }
        }
    }

    private double getAuthorNameSimilarity(String name1, String name2){
        String[] s1 = name1.replace('.', ' ').replace(',', ' ').split("\\s+");
        String[] s2 = name2.replace('.', ' ').replace(',', ' ').split("\\s+");

        if(s1.length != s2.length){
            return 0;
        }
        else {
            for(int i=0; i<s1.length; ++i){
                if(!CompareWordAndWordFirstAlpha(s1[i], s2[i])){
                    return 0;
                }
            }
            return 1;
        }
    }

    private double getInsNameSimilarity(String name1, String name2){
        String[] s1 = name1.replace('.', '\0').replace(',', ' ').split("\\s+");
        String[] s2 = name2.replace('.', '\0').replace(',', ' ').split("\\s+");

        if(s1.length != s2.length){
            return 0;
        }
        else {
            for(int i=0; i<s1.length; ++i){
                if(!CompareWordAndWordFirstAlpha(s1[i], s2[i])){
                    return 0;
                }
            }
            return 1;
        }
    }

    private boolean CompareWordAndWordFirstAlpha(String word1, String word2){
        if(word1.equals(word2)){
            return true;
        }
        if(word1.length()==1 && word1.charAt(0) == word2.charAt(0)){
            return true;
        }
        if(word2.length()==1 && word1.charAt(0) == word2.charAt(0)){
            return true;
        }
        return false;
    }

    private String toString(String[] strings){
        String ret = "";
        for(String s: strings){
            ret+=s;
        }
        return ret;
    }
}
