package com.nju.svcprediction.serviceImp;

import com.nju.svcprediction.dataMapper.acm.ACMCollabMapper;
import com.nju.svcprediction.dataMapper.ieee.IEEECollabMapper;
import com.nju.svcprediction.domain.*;
import com.nju.svcprediction.service.CollabSvc;
import com.nju.svcprediction.service.InterestSvc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CollabSvcImp implements CollabSvc {

    private final ACMCollabMapper acmCollabMapper;
    private final IEEECollabMapper ieeeCollabMapper;
    private final InterestSvc interestSvc;

    public CollabSvcImp(ACMCollabMapper acmCollabMapper, IEEECollabMapper ieeeCollabMapper, InterestSvc interestSvc) {
        this.acmCollabMapper = acmCollabMapper;
        this.ieeeCollabMapper = ieeeCollabMapper;
        this.interestSvc = interestSvc;
    }

    @Override
    public ResponseVO getCollaborateMap(int id, String db) {
        ArrayList<Veticle> veticles = new ArrayList<>();
        ArrayList<Edge> edges = new ArrayList<>();
        ArrayList<EdgePO> edgePOS;
        edgePOS = db.equals("ACM") ? acmCollabMapper.getEdgesByAuthorId(id) : ieeeCollabMapper.getEdgesByAuthorId(id);

        for(EdgePO edgePO:edgePOS){
            edges.add(new Edge(
                    edgePO.getV1(),
                    edgePO.getV2(),
                    new EdgeContent(edgePO.getCommonWorks())));
        }

        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(edges.get(0).getV1());
        for(Edge edge:edges){
            ids.add(edge.getV2());
        }
        for(Integer authorId:ids){
            Veticle tmp = new Veticle(
                    false,
                    authorId,
                    0,
                    db.equals("ACM") ? acmCollabMapper.getVeticleContent(authorId) : ieeeCollabMapper.getVeticleContent(authorId)
            );
            if(tmp.getContent() == null){
                tmp.setContent(new VeticleContent());
                tmp.getContent().setName(db.equals("ACM") ? acmCollabMapper.getAuthorName(authorId) : ieeeCollabMapper.getAuthorName(authorId));
                tmp.getContent().setAffiliation("");
                tmp.getContent().setDb(db);
                tmp.getContent().setId(authorId);
            }
            veticles.add(tmp);
        }
        veticles.get(0).setCore(true);
        veticles.get(0).setCategory(1);

        for(int i = 0; i < veticles.size(); ++i){
            veticles.get(i).setId(i);
        }

        for(int i = 0; i < edges.size(); ++i){
            edges.get(i).setV1(0);
            edges.get(i).setV2(i+1);
        }

        return ResponseVO.buildSuccess(new CollaborateRes(veticles, edges));
    }

    @Override
    public ResponseVO collaboratePrediction(int id, String db) {
        String futureInterest = ((ArrayList<InterestRes>) interestSvc.getFutureKeywords(id, db).getContent()).get(0).getWord();
        ArrayList<Integer> futureAuthorIds = db.equals("ACM") ? acmCollabMapper.getFutureCollab(futureInterest) : ieeeCollabMapper.getFutureCollab(futureInterest);
        ArrayList<CollabPredictRes> data = new ArrayList<>();
        for(Integer integer:futureAuthorIds){
            data.add(db.equals("ACM") ? acmCollabMapper.getDataById(integer) : ieeeCollabMapper.getDataById(integer));
        }
        ArrayList<CollabPredictRes> ret = new ArrayList<>();
        for(CollabPredictRes collabPredictRes:data){
            if (collabPredictRes!=null){
                ret.add(collabPredictRes);
            }
        }
        return ResponseVO.buildSuccess(ret);
    }

    @Override
    public ResponseVO getFutureCollab(ArrayList<Document> documents) {
        String futureInterest = interestSvc.getFutureKeywords(documents).getWord();
        ArrayList<Integer> futureAuthorIds = acmCollabMapper.getFutureCollab(futureInterest);
        ArrayList<CollabPredictRes> data = new ArrayList<>();
        for(Integer integer:futureAuthorIds){
            data.add(acmCollabMapper.getDataById(integer));
        }
        ArrayList<CollabPredictRes> ret = new ArrayList<>();
        for(CollabPredictRes collabPredictRes:data){
            if (collabPredictRes!=null){
                ret.add(collabPredictRes);
            }
        }
        return ResponseVO.buildSuccess(ret);
    }
}
