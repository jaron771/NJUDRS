/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 07:13:58 GMT 2020
 */

package com.nju.svcrecommend.serviceImp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.nju.svcrecommend.dataMapper.acm.ACMReviewerMapper;
import com.nju.svcrecommend.dataMapper.ieee.IEEEReviewerMapper;
import com.nju.svcrecommend.domain.ResponseVO;
import com.nju.svcrecommend.domain.ReviewerReq;
import com.nju.svcrecommend.serviceImp.ReviewerSvcImp;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class ReviewerSvcImp_ESTest extends ReviewerSvcImp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      arrayList0.add(integer0);
      ACMReviewerMapper aCMReviewerMapper0 = mock(ACMReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn("[pnH_2$9lC-x7C").when(aCMReviewerMapper0).getPublication(anyString());
      doReturn((ArrayList<String>) null).when(aCMReviewerMapper0).getReviewerIns(anyInt());
      doReturn((ArrayList<String>) null).when(aCMReviewerMapper0).getReviewerKeywords(anyInt());
      doReturn("").when(aCMReviewerMapper0).getReviewerName(anyInt());
      doReturn(arrayList0).when(aCMReviewerMapper0).getSameInsAuthorIDs(anyString());
      IEEEReviewerMapper iEEEReviewerMapper0 = mock(IEEEReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn("").when(iEEEReviewerMapper0).getPublication(anyString());
      ReviewerSvcImp reviewerSvcImp0 = new ReviewerSvcImp(aCMReviewerMapper0, iEEEReviewerMapper0);
      arrayList0.add((Integer) null);
      ReviewerReq reviewerReq0 = new ReviewerReq((String) null, "IEEE", "3FL^`oPX=Da", "IEEE");
      // Undeclared exception!
      try { 
        reviewerSvcImp0.getShieldReviewers(reviewerReq0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcrecommend.serviceImp.ReviewerSvcImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ACMReviewerMapper aCMReviewerMapper0 = mock(ACMReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(aCMReviewerMapper0).getPublication(anyString());
      Integer integer0 = new Integer(1);
      arrayList0.add(integer0);
      arrayList0.add(integer0);
      IEEEReviewerMapper iEEEReviewerMapper0 = mock(IEEEReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn("com.nju.svcrecommend.domain.ResponseVO").when(iEEEReviewerMapper0).getPublication(anyString());
      doReturn((ArrayList) null).when(iEEEReviewerMapper0).getReviewerIns(anyInt());
      doReturn((ArrayList) null).when(iEEEReviewerMapper0).getReviewerKeywords(anyInt());
      doReturn((String) null).when(iEEEReviewerMapper0).getReviewerName(anyInt());
      doReturn(arrayList0, arrayList0).when(iEEEReviewerMapper0).getSameInsAuthorIDs(anyString());
      ReviewerSvcImp reviewerSvcImp0 = new ReviewerSvcImp(aCMReviewerMapper0, iEEEReviewerMapper0);
      ReviewerReq reviewerReq0 = new ReviewerReq("", "|~?DP|4+1;/g{^", "|~?DP|4+1;/g{^", "|~?DP|4+1;/g{^");
      ResponseVO responseVO0 = reviewerSvcImp0.getShieldReviewers(reviewerReq0);
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ACMReviewerMapper aCMReviewerMapper0 = mock(ACMReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, " A", " A", "q-PSL0CafWj2{u_=y ").when(aCMReviewerMapper0).getPublication(anyString());
      doReturn(arrayList0, arrayList0, arrayList0, arrayList0, (ArrayList) null).when(aCMReviewerMapper0).getSameInsAuthorIDs(anyString());
      IEEEReviewerMapper iEEEReviewerMapper0 = mock(IEEEReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn("q-PSL0CafWj2{u_=y ", "", " A", "", "").when(iEEEReviewerMapper0).getPublication(anyString());
      doReturn(arrayList0, arrayList0).when(iEEEReviewerMapper0).getRecommendReviewersId(anyString() , anyString());
      doReturn(arrayList0, arrayList0).when(iEEEReviewerMapper0).getSameInsAuthorIDs(anyString());
      ReviewerSvcImp reviewerSvcImp0 = new ReviewerSvcImp(aCMReviewerMapper0, iEEEReviewerMapper0);
      ReviewerReq reviewerReq0 = new ReviewerReq("0Ee%rx6X{Ke<", "|~?DP|4+1;/g{^", "|~?DP|4+1;/g{^", "|~?DP|4+1;/g{^");
      reviewerSvcImp0.getShieldReviewers(reviewerReq0);
      reviewerSvcImp0.getRecommendReviewers(reviewerReq0);
      reviewerSvcImp0.getShieldReviewers(reviewerReq0);
      reviewerSvcImp0.getShieldReviewers(reviewerReq0);
      // Undeclared exception!
      try { 
        reviewerSvcImp0.getShieldReviewers(reviewerReq0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ACMReviewerMapper aCMReviewerMapper0 = mock(ACMReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, "com.nju.svcrecommend.domain.ResponseVO").when(aCMReviewerMapper0).getPublication(anyString());
      doReturn(arrayList0, (ArrayList) null).when(aCMReviewerMapper0).getRecommendReviewersId(anyString() , anyString());
      Integer integer0 = new Integer(1);
      arrayList0.add(integer0);
      IEEEReviewerMapper iEEEReviewerMapper0 = mock(IEEEReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn("com.nju.svcrecommend.domain.ResponseVO", "", "com.nju.svcrecommend.domain.ResponseVO").when(iEEEReviewerMapper0).getPublication(anyString());
      doReturn(arrayList0, arrayList0).when(iEEEReviewerMapper0).getRecommendReviewersId(anyString() , anyString());
      doReturn((ArrayList) null, (ArrayList) null).when(iEEEReviewerMapper0).getReviewerIns(anyInt());
      doReturn((ArrayList) null, (ArrayList) null).when(iEEEReviewerMapper0).getReviewerKeywords(anyInt());
      doReturn((String) null, (String) null).when(iEEEReviewerMapper0).getReviewerName(anyInt());
      doReturn(arrayList0, arrayList0).when(iEEEReviewerMapper0).getSameInsAuthorIDs(anyString());
      ReviewerSvcImp reviewerSvcImp0 = new ReviewerSvcImp(aCMReviewerMapper0, iEEEReviewerMapper0);
      ReviewerReq reviewerReq0 = new ReviewerReq("", "|~?DP|4+1;/g{^", "|~?DP|4+1;/g{^", "|~?DP|4+1;/g{^");
      reviewerSvcImp0.getShieldReviewers(reviewerReq0);
      reviewerSvcImp0.getRecommendReviewers(reviewerReq0);
      // Undeclared exception!
      try { 
        reviewerSvcImp0.getRecommendReviewers(reviewerReq0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ACMReviewerMapper aCMReviewerMapper0 = mock(ACMReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(aCMReviewerMapper0).getPublication(anyString());
      Integer integer0 = new Integer(1);
      Integer integer1 = Integer.getInteger("com.nju.svcrecommend.domain.ResponseVO", 0);
      arrayList0.add(integer1);
      Integer integer2 = new Integer(6);
      arrayList0.add(integer2);
      Integer integer3 = new Integer(5);
      arrayList0.add(integer3);
      arrayList0.add(integer0);
      IEEEReviewerMapper iEEEReviewerMapper0 = mock(IEEEReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn("com.nju.svcrecommend.domain.ResponseVO").when(iEEEReviewerMapper0).getPublication(anyString());
      doReturn(arrayList0, arrayList0).when(iEEEReviewerMapper0).getRecommendReviewersId(anyString() , anyString());
      doReturn((ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null).when(iEEEReviewerMapper0).getReviewerIns(anyInt());
      doReturn((ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null, (ArrayList) null).when(iEEEReviewerMapper0).getReviewerKeywords(anyInt());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(iEEEReviewerMapper0).getReviewerName(anyInt());
      ReviewerSvcImp reviewerSvcImp0 = new ReviewerSvcImp(aCMReviewerMapper0, iEEEReviewerMapper0);
      ReviewerReq reviewerReq0 = new ReviewerReq("", "|~?DP|4+1;/g{^", "|~?DP|4+1;/g{^", "|~?DP|4+1;/g{^");
      Integer integer4 = new Integer(2333);
      arrayList0.add(integer4);
      Integer integer5 = new Integer(3);
      arrayList0.add(integer5);
      ResponseVO responseVO0 = reviewerSvcImp0.getRecommendReviewers(reviewerReq0);
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ACMReviewerMapper aCMReviewerMapper0 = mock(ACMReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(aCMReviewerMapper0).getPublication(anyString());
      IEEEReviewerMapper iEEEReviewerMapper0 = mock(IEEEReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn("com.nju.svcrecommend.domain.ResponseVO").when(iEEEReviewerMapper0).getPublication(anyString());
      ReviewerSvcImp reviewerSvcImp0 = new ReviewerSvcImp(aCMReviewerMapper0, iEEEReviewerMapper0);
      ReviewerReq reviewerReq0 = new ReviewerReq();
      ResponseVO responseVO0 = reviewerSvcImp0.getShieldReviewers(reviewerReq0);
      assertEquals("Publication not exist.", responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ACMReviewerMapper aCMReviewerMapper0 = mock(ACMReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(aCMReviewerMapper0).getPublication(anyString());
      IEEEReviewerMapper iEEEReviewerMapper0 = mock(IEEEReviewerMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(iEEEReviewerMapper0).getPublication(anyString());
      ReviewerSvcImp reviewerSvcImp0 = new ReviewerSvcImp(aCMReviewerMapper0, iEEEReviewerMapper0);
      ReviewerReq reviewerReq0 = new ReviewerReq("IEEE", "IEEE", "IEEE", "XDUTU>o*/:v*>AI.}");
      ResponseVO responseVO0 = reviewerSvcImp0.getRecommendReviewers(reviewerReq0);
      assertEquals("Publication not exist.", responseVO0.getMessage());
      assertFalse(responseVO0.getSuccess());
  }
}
