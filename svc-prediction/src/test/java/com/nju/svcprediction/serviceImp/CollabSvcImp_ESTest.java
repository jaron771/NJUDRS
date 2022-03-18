/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 01 06:13:30 GMT 2020
 */

package com.nju.svcprediction.serviceImp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.nju.svcprediction.dataMapper.acm.ACMCollabMapper;
import com.nju.svcprediction.dataMapper.acm.ACMInterestMapper;
import com.nju.svcprediction.dataMapper.ieee.IEEECollabMapper;
import com.nju.svcprediction.dataMapper.ieee.IEEEInterestMapper;
import com.nju.svcprediction.domain.CollabPredictRes;
import com.nju.svcprediction.domain.Document;
import com.nju.svcprediction.domain.EdgePO;
import com.nju.svcprediction.domain.InterestRes;
import com.nju.svcprediction.domain.ResponseVO;
import com.nju.svcprediction.domain.VeticleContent;
import com.nju.svcprediction.serviceImp.CollabSvcImp;
import com.nju.svcprediction.serviceImp.InterestSvcImp;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class CollabSvcImp_ESTest extends CollabSvcImp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ACMCollabMapper aCMCollabMapper0 = mock(ACMCollabMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(aCMCollabMapper0).getFutureCollab(anyString());
      IEEECollabMapper iEEECollabMapper0 = mock(IEEECollabMapper.class, new ViolatedAssumptionAnswer());
      ACMInterestMapper aCMInterestMapper0 = mock(ACMInterestMapper.class, new ViolatedAssumptionAnswer());
      IEEEInterestMapper iEEEInterestMapper0 = mock(IEEEInterestMapper.class, new ViolatedAssumptionAnswer());
      InterestSvcImp interestSvcImp0 = new InterestSvcImp(aCMInterestMapper0, iEEEInterestMapper0);
      CollabSvcImp collabSvcImp0 = new CollabSvcImp(aCMCollabMapper0, iEEECollabMapper0, interestSvcImp0);
      ArrayList<Document> arrayList0 = new ArrayList<Document>();
      // Undeclared exception!
      try { 
        collabSvcImp0.getFutureCollab(arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcprediction.serviceImp.CollabSvcImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ACMCollabMapper aCMCollabMapper0 = mock(ACMCollabMapper.class, new ViolatedAssumptionAnswer());
      IEEECollabMapper iEEECollabMapper0 = mock(IEEECollabMapper.class, new ViolatedAssumptionAnswer());
      IEEEInterestMapper iEEEInterestMapper0 = mock(IEEEInterestMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEEInterestMapper0).getInterestHistoryByAuthorId(anyInt());
      InterestSvcImp interestSvcImp0 = new InterestSvcImp((ACMInterestMapper) null, iEEEInterestMapper0);
      CollabSvcImp collabSvcImp0 = new CollabSvcImp(aCMCollabMapper0, iEEECollabMapper0, interestSvcImp0);
      // Undeclared exception!
      try { 
        collabSvcImp0.collaboratePrediction(1824, "com.nju.svcprediction.domain.VeticleContent");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcprediction.serviceImp.InterestSvcImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ACMCollabMapper aCMCollabMapper0 = mock(ACMCollabMapper.class, new ViolatedAssumptionAnswer());
      doReturn((CollabPredictRes) null).when(aCMCollabMapper0).getDataById(anyInt());
      doReturn(arrayList0).when(aCMCollabMapper0).getFutureCollab(anyString());
      Integer integer0 = new Integer((-2013));
      arrayList0.add(integer0);
      IEEECollabMapper iEEECollabMapper0 = mock(IEEECollabMapper.class, new ViolatedAssumptionAnswer());
      ACMInterestMapper aCMInterestMapper0 = mock(ACMInterestMapper.class, new ViolatedAssumptionAnswer());
      IEEEInterestMapper iEEEInterestMapper0 = mock(IEEEInterestMapper.class, new ViolatedAssumptionAnswer());
      InterestSvcImp interestSvcImp0 = new InterestSvcImp(aCMInterestMapper0, iEEEInterestMapper0);
      CollabSvcImp collabSvcImp0 = new CollabSvcImp(aCMCollabMapper0, iEEECollabMapper0, interestSvcImp0);
      ArrayList<Document> arrayList1 = new ArrayList<Document>(785);
      collabSvcImp0.getFutureCollab(arrayList1);
      assertEquals(0, arrayList1.size());
      assertTrue(arrayList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      CollabPredictRes collabPredictRes0 = new CollabPredictRes(341, "ACM", "f", 341, 341, "com.nju.svcpreiction.domain.VeticleContent");
      ACMCollabMapper aCMCollabMapper0 = mock(ACMCollabMapper.class, new ViolatedAssumptionAnswer());
      doReturn((CollabPredictRes) null).when(aCMCollabMapper0).getDataById(anyInt());
      doReturn(arrayList0).when(aCMCollabMapper0).getFutureCollab(anyString());
      Integer integer0 = new Integer((-2013));
      arrayList0.add(integer0);
      IEEECollabMapper iEEECollabMapper0 = mock(IEEECollabMapper.class, new ViolatedAssumptionAnswer());
      ACMInterestMapper aCMInterestMapper0 = mock(ACMInterestMapper.class, new ViolatedAssumptionAnswer());
      IEEEInterestMapper iEEEInterestMapper0 = mock(IEEEInterestMapper.class, new ViolatedAssumptionAnswer());
      InterestSvcImp interestSvcImp0 = new InterestSvcImp(aCMInterestMapper0, iEEEInterestMapper0);
      CollabSvcImp collabSvcImp0 = new CollabSvcImp(aCMCollabMapper0, iEEECollabMapper0, interestSvcImp0);
      ArrayList<Document> arrayList1 = new ArrayList<Document>(785);
      collabSvcImp0.getFutureCollab(arrayList1);
      assertEquals(1, arrayList0.size());
      assertTrue(arrayList1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ACMCollabMapper aCMCollabMapper0 = mock(ACMCollabMapper.class, new ViolatedAssumptionAnswer());
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      CollabPredictRes collabPredictRes0 = new CollabPredictRes();
      IEEECollabMapper iEEECollabMapper0 = mock(IEEECollabMapper.class, new ViolatedAssumptionAnswer());
      doReturn(collabPredictRes0).when(iEEECollabMapper0).getDataById(anyInt());
      doReturn(arrayList0).when(iEEECollabMapper0).getFutureCollab(anyString());
      ACMInterestMapper aCMInterestMapper0 = mock(ACMInterestMapper.class, new ViolatedAssumptionAnswer());
      ArrayList<InterestRes> arrayList1 = new ArrayList<InterestRes>();
      IEEEInterestMapper iEEEInterestMapper0 = mock(IEEEInterestMapper.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList1).when(iEEEInterestMapper0).getInterestHistoryByAuthorId(anyInt());
      doReturn("%y)wXZ'ymX}|)").when(iEEEInterestMapper0).getInterestPrediction(anyInt() , anyInt());
      InterestRes interestRes0 = new InterestRes(0, "30LFu1VR&Rn|6");
      arrayList1.add(interestRes0);
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      InterestSvcImp interestSvcImp0 = new InterestSvcImp(aCMInterestMapper0, iEEEInterestMapper0);
      CollabSvcImp collabSvcImp0 = new CollabSvcImp(aCMCollabMapper0, iEEECollabMapper0, interestSvcImp0);
      collabSvcImp0.collaboratePrediction(0, "/arS");
      assertEquals(1, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ACMCollabMapper aCMCollabMapper0 = mock(ACMCollabMapper.class, new ViolatedAssumptionAnswer());
      doReturn((CollabPredictRes) null).when(aCMCollabMapper0).getDataById(anyInt());
      doReturn(arrayList0).when(aCMCollabMapper0).getFutureCollab(anyString());
      IEEECollabMapper iEEECollabMapper0 = mock(IEEECollabMapper.class, new ViolatedAssumptionAnswer());
      ArrayList<InterestRes> arrayList1 = new ArrayList<InterestRes>();
      ACMInterestMapper aCMInterestMapper0 = mock(ACMInterestMapper.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList1).when(aCMInterestMapper0).getInterestHistoryByAuthorId(anyInt());
      doReturn(",Rq];").when(aCMInterestMapper0).getInterestPrediction(anyInt() , anyInt());
      IEEEInterestMapper iEEEInterestMapper0 = mock(IEEEInterestMapper.class, new ViolatedAssumptionAnswer());
      InterestSvcImp interestSvcImp0 = new InterestSvcImp(aCMInterestMapper0, iEEEInterestMapper0);
      CollabSvcImp collabSvcImp0 = new CollabSvcImp(aCMCollabMapper0, iEEECollabMapper0, interestSvcImp0);
      InterestRes interestRes0 = new InterestRes((-1881267169), "}'Xhc-7({F;N");
      arrayList1.add(interestRes0);
      Integer integer0 = new Integer((-111170808));
      arrayList0.add(integer0);
      ResponseVO responseVO0 = collabSvcImp0.collaboratePrediction(0, "ACM");
      assertNull(responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<EdgePO> arrayList0 = new ArrayList<EdgePO>();
      ACMCollabMapper aCMCollabMapper0 = mock(ACMCollabMapper.class, new ViolatedAssumptionAnswer());
      doReturn("}'Xhc-7({F;N", (String) null).when(aCMCollabMapper0).getAuthorName(anyInt());
      doReturn(arrayList0).when(aCMCollabMapper0).getEdgesByAuthorId(anyInt());
      doReturn((VeticleContent) null, (VeticleContent) null).when(aCMCollabMapper0).getVeticleContent(anyInt());
      IEEECollabMapper iEEECollabMapper0 = mock(IEEECollabMapper.class, new ViolatedAssumptionAnswer());
      ACMInterestMapper aCMInterestMapper0 = mock(ACMInterestMapper.class, new ViolatedAssumptionAnswer());
      IEEEInterestMapper iEEEInterestMapper0 = mock(IEEEInterestMapper.class, new ViolatedAssumptionAnswer());
      InterestSvcImp interestSvcImp0 = new InterestSvcImp(aCMInterestMapper0, iEEEInterestMapper0);
      CollabSvcImp collabSvcImp0 = new CollabSvcImp(aCMCollabMapper0, iEEECollabMapper0, interestSvcImp0);
      EdgePO edgePO0 = new EdgePO((-1995031782), (-1995031782), 2481);
      arrayList0.add(edgePO0);
      collabSvcImp0.getCollaborateMap(0, "ACM");
      assertEquals(1, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<EdgePO> arrayList0 = new ArrayList<EdgePO>();
      ACMCollabMapper aCMCollabMapper0 = mock(ACMCollabMapper.class, new ViolatedAssumptionAnswer());
      IEEECollabMapper iEEECollabMapper0 = mock(IEEECollabMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(iEEECollabMapper0).getAuthorName(anyInt());
      doReturn(arrayList0).when(iEEECollabMapper0).getEdgesByAuthorId(anyInt());
      doReturn((VeticleContent) null, (VeticleContent) null).when(iEEECollabMapper0).getVeticleContent(anyInt());
      InterestSvcImp interestSvcImp0 = new InterestSvcImp((ACMInterestMapper) null, (IEEEInterestMapper) null);
      CollabSvcImp collabSvcImp0 = new CollabSvcImp(aCMCollabMapper0, iEEECollabMapper0, interestSvcImp0);
      EdgePO edgePO0 = new EdgePO();
      arrayList0.add(edgePO0);
      collabSvcImp0.getCollaborateMap(0, "$0{Z~!z:Ixg&9R?%x`");
      assertEquals(1, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<EdgePO> arrayList0 = new ArrayList<EdgePO>();
      VeticleContent veticleContent0 = new VeticleContent();
      ACMCollabMapper aCMCollabMapper0 = mock(ACMCollabMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(aCMCollabMapper0).getAuthorName(anyInt());
      doReturn(arrayList0).when(aCMCollabMapper0).getEdgesByAuthorId(anyInt());
      doReturn((VeticleContent) null, (VeticleContent) null).when(aCMCollabMapper0).getVeticleContent(anyInt());
      IEEECollabMapper iEEECollabMapper0 = mock(IEEECollabMapper.class, new ViolatedAssumptionAnswer());
      InterestSvcImp interestSvcImp0 = new InterestSvcImp((ACMInterestMapper) null, (IEEEInterestMapper) null);
      CollabSvcImp collabSvcImp0 = new CollabSvcImp(aCMCollabMapper0, iEEECollabMapper0, interestSvcImp0);
      EdgePO edgePO0 = new EdgePO();
      arrayList0.add(edgePO0);
      collabSvcImp0.getCollaborateMap(0, "ACM");
      assertEquals(1, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<EdgePO> arrayList0 = new ArrayList<EdgePO>();
      ACMCollabMapper aCMCollabMapper0 = mock(ACMCollabMapper.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(aCMCollabMapper0).getEdgesByAuthorId(anyInt());
      IEEECollabMapper iEEECollabMapper0 = mock(IEEECollabMapper.class, new ViolatedAssumptionAnswer());
      InterestSvcImp interestSvcImp0 = new InterestSvcImp((ACMInterestMapper) null, (IEEEInterestMapper) null);
      CollabSvcImp collabSvcImp0 = new CollabSvcImp(aCMCollabMapper0, iEEECollabMapper0, interestSvcImp0);
      // Undeclared exception!
      try { 
        collabSvcImp0.getCollaborateMap(0, "ACM");
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ACMCollabMapper aCMCollabMapper0 = mock(ACMCollabMapper.class, new ViolatedAssumptionAnswer());
      ACMInterestMapper aCMInterestMapper0 = mock(ACMInterestMapper.class, new ViolatedAssumptionAnswer());
      IEEEInterestMapper iEEEInterestMapper0 = mock(IEEEInterestMapper.class, new ViolatedAssumptionAnswer());
      InterestSvcImp interestSvcImp0 = new InterestSvcImp(aCMInterestMapper0, iEEEInterestMapper0);
      CollabSvcImp collabSvcImp0 = new CollabSvcImp(aCMCollabMapper0, (IEEECollabMapper) null, interestSvcImp0);
      // Undeclared exception!
      try { 
        collabSvcImp0.getCollaborateMap(293, "com.nju.svcprediction.serviceImp.CollabSvcImp");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcprediction.serviceImp.CollabSvcImp", e);
      }
  }
}