/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 08 11:22:30 GMT 2022
 */

package com.nju.svcdisambiguation.serviceImp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.nju.svcdisambiguation.dataMapper.acm.ACMAuthorDetailMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEAuthorDetailMapper;
import com.nju.svcdisambiguation.po.AuthorInstitutionsPO;
import com.nju.svcdisambiguation.po.FieldSummaryPO;
import com.nju.svcdisambiguation.po.PaperActivationPO;
import com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp;
import com.nju.svcdisambiguation.vo.AuthorVO;
import com.nju.svcdisambiguation.vo.PaperVO;
import com.nju.svcdisambiguation.vo.ResponseVO;
import com.nju.svcdisambiguation.vo.detail.ReferenceVO;
import com.nju.svcdisambiguation.vo.detail.author.AuthorDetailVO;
import com.nju.svcdisambiguation.vo.detail.author.AuthorPublicationSummaryVO;
import com.nju.svcdisambiguation.vo.detail.author.InstitutionAuthorDetailVO;
import com.nju.svcdisambiguation.vo.detail.author.KeywordsAuthorDetailVO;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class AuthorDetailServiceImp_ESTest extends AuthorDetailServiceImp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(aCMAuthorDetailMapper0).selectPaperVOByAuthorId(anyInt());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorPapers((-369), "ACM", (-4273), (-348));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer((-1727960354));
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(iEEEAuthorDetailMapper0).selectAuthorReferred(anyInt());
      doReturn(integer1).when(iEEEAuthorDetailMapper0).selectDocCnt(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorInfluence((-1), "9HecDqepM>\"DGWu{b<Z");
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer((-2109876870));
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null).when(iEEEAuthorDetailMapper0).selectDocCnt(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorInfluence((-70136727), "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer((-2021695510));
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(iEEEAuthorDetailMapper0).selectAuthorReferred(anyInt());
      doReturn(integer0).when(iEEEAuthorDetailMapper0).selectDocCnt(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorInfluence(4, "AFM");
      assertNull(responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer((-595));
      ArrayList<ReferenceVO> arrayList0 = new ArrayList<ReferenceVO>();
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(iEEEAuthorDetailMapper0).selectReferenceVOByAuthorId(anyInt() , anyInt() , anyInt());
      doReturn(integer0).when(iEEEAuthorDetailMapper0).selectReferenceVONumByAuthorId(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorRefer(4289, "", (-1035), (-202));
      assertEquals("-595", responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp((IEEEAuthorDetailMapper) null, (ACMAuthorDetailMapper) null);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorPublicationSummary((-2180), "ACM");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEEAuthorDetailMapper0).selectPaperVOByAuthorId(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorPapers((-2005025203), "", (-2005025203), (-2005025203));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp((IEEEAuthorDetailMapper) null, (ACMAuthorDetailMapper) null);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorInstitutions((-1), "AFM");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp((IEEEAuthorDetailMapper) null, (ACMAuthorDetailMapper) null);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorFieldSummary((-239334), "D)|j'|8C");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<PaperVO> arrayList0 = new ArrayList<PaperVO>();
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEEAuthorDetailMapper0).selectPaperVOByAuthorId(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      PaperVO paperVO0 = new PaperVO((-919), "", "", "g8Mv:D5%`.DuX", (String) null, (-595), 4289, (ArrayList<AuthorVO>) null, "com.nju.svcdisambiguation.po.FieldSummaryPO");
      arrayList0.add(paperVO0);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorPapers((-2531), "", 1, 2072);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<PaperVO> arrayList0 = new ArrayList<PaperVO>();
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(iEEEAuthorDetailMapper0).selectPaperVOByAuthorId(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      PaperVO paperVO0 = new PaperVO();
      paperVO0.setPublication(":o(2");
      arrayList0.add(paperVO0);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorPapers((-2531), "", 1, 2072);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AuthorDetailVO authorDetailVO0 = mock(AuthorDetailVO.class, new ViolatedAssumptionAnswer());
      ArrayList<AuthorInstitutionsPO> arrayList0 = new ArrayList<AuthorInstitutionsPO>();
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer((-402723528));
      Integer integer2 = new Integer(1414125);
      Integer integer3 = new Integer(764);
      ArrayList<FieldSummaryPO> arrayList1 = new ArrayList<FieldSummaryPO>();
      ArrayList<AuthorPublicationSummaryVO> arrayList2 = new ArrayList<AuthorPublicationSummaryVO>();
      ArrayList<PaperVO> arrayList3 = new ArrayList<PaperVO>();
      ArrayList<ReferenceVO> arrayList4 = new ArrayList<ReferenceVO>();
      Integer integer4 = new Integer(764);
      Integer integer5 = new Integer((-402723528));
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEEAuthorDetailMapper0).selectPaperVOByAuthorId(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorPapers((-1), "3R!Vrsb>8HG~8", (-1727867122), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(aCMAuthorDetailMapper0).selectAuthorInstitutions(anyInt());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorInstitutions(266, "ACM");
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null).when(aCMAuthorDetailMapper0).selectDocCnt(anyInt());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorInfluence((-1618645460), "ACM");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Integer integer0 = new Integer(1);
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(iEEEAuthorDetailMapper0).selectAuthorReferred(anyInt());
      doReturn(integer0).when(iEEEAuthorDetailMapper0).selectDocCnt(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorInfluence(1, "3R!Vrsb>8HG~8");
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null).when(aCMAuthorDetailMapper0).selectAuthorReferred(anyInt());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorReferred((-84), "ACM");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = new Integer(1);
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(integer0).when(iEEEAuthorDetailMapper0).selectAuthorReferred(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorReferred(1414125, "3R!Vrsb>8HG~8");
      assertNull(responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ArrayList<ReferenceVO> arrayList0 = new ArrayList<ReferenceVO>();
      ReferenceVO referenceVO0 = new ReferenceVO();
      arrayList0.add(referenceVO0);
      Integer integer0 = new Integer((-902));
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(aCMAuthorDetailMapper0).selectAuthorsByPaperId(anyInt());
      doReturn((ArrayList) null).when(aCMAuthorDetailMapper0).selectKeywordsByPaperId(anyInt());
      doReturn(arrayList0).when(aCMAuthorDetailMapper0).selectReferenceVOByAuthorId(anyInt() , anyInt() , anyInt());
      doReturn(integer0).when(aCMAuthorDetailMapper0).selectReferenceVONumByAuthorId(anyInt());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorRefer((-1083030869), "ACM", (-1083030869), (-1083030869));
      assertEquals("-902", responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArrayList<ReferenceVO> arrayList0 = new ArrayList<ReferenceVO>();
      Integer integer0 = new Integer(5);
      ReferenceVO referenceVO0 = new ReferenceVO();
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList<String>) null).when(iEEEAuthorDetailMapper0).selectAuthorsByPaperId(anyInt());
      doReturn((ArrayList<String>) null).when(iEEEAuthorDetailMapper0).selectKeywordsByPaperId(anyInt());
      doReturn(arrayList0).when(iEEEAuthorDetailMapper0).selectReferenceVOByAuthorId(anyInt() , anyInt() , anyInt());
      doReturn(integer0).when(iEEEAuthorDetailMapper0).selectReferenceVONumByAuthorId(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      arrayList0.add(referenceVO0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorRefer(5, "AFM", 5, 5);
      assertEquals("5", responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Integer integer0 = new Integer((-1482));
      Integer integer1 = new Integer((-1882940614));
      ArrayList<InstitutionAuthorDetailVO> arrayList0 = new ArrayList<InstitutionAuthorDetailVO>();
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ArrayList<KeywordsAuthorDetailVO> arrayList1 = new ArrayList<KeywordsAuthorDetailVO>();
      AuthorDetailVO authorDetailVO0 = mock(AuthorDetailVO.class, new ViolatedAssumptionAnswer());
      Integer integer2 = new Integer((-1882940614));
      ArrayList<PaperActivationPO> arrayList2 = new ArrayList<PaperActivationPO>();
      PaperActivationPO paperActivationPO0 = new PaperActivationPO(0, (-897), (-6));
      arrayList2.add(paperActivationPO0);
      ReferenceVO referenceVO0 = new ReferenceVO(3431, "", "", "", (-897), (ArrayList<String>) null, (ArrayList<String>) null);
      referenceVO0.getKeywords();
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(aCMAuthorDetailMapper0).selectReferenceVOByAuthorId(anyInt() , anyInt() , anyInt());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorRefer(0, "ACM", 2400, (-897));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArrayList<FieldSummaryPO> arrayList0 = new ArrayList<FieldSummaryPO>();
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(iEEEAuthorDetailMapper0).selectFieldSummaryPOByAuthorId(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      FieldSummaryPO fieldSummaryPO0 = new FieldSummaryPO(1, "4Q0j2HnRu5rT0z", 1);
      arrayList0.add(fieldSummaryPO0);
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorFieldSummary(2777, ":4Z");
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ArrayList<FieldSummaryPO> arrayList0 = new ArrayList<FieldSummaryPO>();
      FieldSummaryPO fieldSummaryPO0 = new FieldSummaryPO();
      arrayList0.add(fieldSummaryPO0);
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(aCMAuthorDetailMapper0).selectFieldSummaryPOByAuthorId(anyInt());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorFieldSummary(14310, "ACM");
      assertNull(responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ArrayList<AuthorPublicationSummaryVO> arrayList0 = new ArrayList<AuthorPublicationSummaryVO>();
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(aCMAuthorDetailMapper0).selectAuthorPublicationSummaryByAuthorId(anyInt());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorPublicationSummary(4708, "ACM");
      assertNull(responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEEAuthorDetailMapper0).selectAuthorPublicationSummaryByAuthorId(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorPublicationSummary(1414125, "3R!Vrsb>8HG~8");
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Integer integer0 = new Integer((-1482));
      ArrayList<InstitutionAuthorDetailVO> arrayList0 = new ArrayList<InstitutionAuthorDetailVO>();
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ArrayList<KeywordsAuthorDetailVO> arrayList1 = new ArrayList<KeywordsAuthorDetailVO>();
      AuthorDetailVO authorDetailVO0 = mock(AuthorDetailVO.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList1).when(authorDetailVO0).getFieldList();
      ArrayList<PaperActivationPO> arrayList2 = new ArrayList<PaperActivationPO>();
      PaperActivationPO paperActivationPO0 = new PaperActivationPO(0, (-897), (-6));
      arrayList2.add(paperActivationPO0);
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(authorDetailVO0).when(aCMAuthorDetailMapper0).selectAuthorDetailById(anyInt());
      doReturn(integer0).when(aCMAuthorDetailMapper0).selectDocCountByAuthorId(anyInt());
      doReturn(arrayList0).when(aCMAuthorDetailMapper0).selectInstitutionByAuthorId(anyInt());
      doReturn(arrayList1).when(aCMAuthorDetailMapper0).selectKeywordsAuthorDetailByAuthorId(anyInt());
      doReturn(arrayList2).when(aCMAuthorDetailMapper0).selectPaperActivationPOByAuthorId(anyInt());
      doReturn((ArrayList<String>) null).when(aCMAuthorDetailMapper0).selectSameAuthorsByAuthorId(anyInt());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorDetail((-6), "ACM");
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayList<KeywordsAuthorDetailVO> arrayList0 = new ArrayList<KeywordsAuthorDetailVO>();
      AuthorDetailVO authorDetailVO0 = mock(AuthorDetailVO.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(authorDetailVO0).getFieldList();
      ArrayList<InstitutionAuthorDetailVO> arrayList1 = new ArrayList<InstitutionAuthorDetailVO>();
      Integer integer0 = new Integer((-2110));
      ArrayList<PaperActivationPO> arrayList2 = new ArrayList<PaperActivationPO>();
      KeywordsAuthorDetailVO keywordsAuthorDetailVO0 = new KeywordsAuthorDetailVO();
      arrayList0.add(keywordsAuthorDetailVO0);
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(authorDetailVO0).when(iEEEAuthorDetailMapper0).selectAuthorDetailById(anyInt());
      doReturn(integer0).when(iEEEAuthorDetailMapper0).selectDocCountByAuthorId(anyInt());
      doReturn(arrayList1).when(iEEEAuthorDetailMapper0).selectInstitutionByAuthorId(anyInt());
      doReturn(arrayList0).when(iEEEAuthorDetailMapper0).selectKeywordsAuthorDetailByAuthorId(anyInt());
      doReturn(arrayList2).when(iEEEAuthorDetailMapper0).selectPaperActivationPOByAuthorId(anyInt());
      doReturn((ArrayList<String>) null).when(iEEEAuthorDetailMapper0).selectSameAuthorsByAuthorId(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(aCMAuthorDetailMapper0).selectPAVOByFieldNameAndAuthorId(anyString() , anyInt());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorDetail(4, "com.nju.svcdisambiguation.po.PaperActivationPO");
      assertNull(responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      AuthorDetailVO authorDetailVO0 = mock(AuthorDetailVO.class, new ViolatedAssumptionAnswer());
      ArrayList<AuthorInstitutionsPO> arrayList0 = new ArrayList<AuthorInstitutionsPO>();
      ArrayList<AuthorInstitutionsPO> arrayList1 = new ArrayList<AuthorInstitutionsPO>();
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(0);
      ArrayList<InstitutionAuthorDetailVO> arrayList2 = new ArrayList<InstitutionAuthorDetailVO>();
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(authorDetailVO0).when(iEEEAuthorDetailMapper0).selectAuthorDetailById(anyInt());
      doReturn(arrayList2).when(iEEEAuthorDetailMapper0).selectInstitutionByAuthorId(anyInt());
      doReturn((ArrayList) null).when(iEEEAuthorDetailMapper0).selectPaperActivationPOByAuthorId(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorDetail(2601, "com.nju.svcdisambiguation.vo.ResponseVO");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      AuthorDetailVO authorDetailVO0 = mock(AuthorDetailVO.class, new ViolatedAssumptionAnswer());
      ArrayList<InstitutionAuthorDetailVO> arrayList0 = new ArrayList<InstitutionAuthorDetailVO>();
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((AuthorDetailVO) null).when(iEEEAuthorDetailMapper0).selectAuthorDetailById(anyInt());
      doReturn((ArrayList) null).when(iEEEAuthorDetailMapper0).selectInstitutionByAuthorId(anyInt());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionAuthorDetailVO institutionAuthorDetailVO0 = new InstitutionAuthorDetailVO(0, "gPXvZIj%!./aZpp", "gPXvZIj%!./aZpp");
      arrayList0.add(institutionAuthorDetailVO0);
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorDetail((-1875), "IEEE");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Integer integer0 = new Integer((-1482));
      ArrayList<InstitutionAuthorDetailVO> arrayList0 = new ArrayList<InstitutionAuthorDetailVO>();
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ArrayList<KeywordsAuthorDetailVO> arrayList1 = new ArrayList<KeywordsAuthorDetailVO>();
      AuthorDetailVO authorDetailVO0 = mock(AuthorDetailVO.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList1).when(authorDetailVO0).getFieldList();
      ArrayList<PaperActivationPO> arrayList2 = new ArrayList<PaperActivationPO>();
      KeywordsAuthorDetailVO keywordsAuthorDetailVO0 = new KeywordsAuthorDetailVO((-1482), (String) null, 0, (-1882940614));
      arrayList1.add(keywordsAuthorDetailVO0);
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(authorDetailVO0).when(aCMAuthorDetailMapper0).selectAuthorDetailById(anyInt());
      doReturn(integer0).when(aCMAuthorDetailMapper0).selectDocCountByAuthorId(anyInt());
      doReturn(arrayList0).when(aCMAuthorDetailMapper0).selectInstitutionByAuthorId(anyInt());
      doReturn((ArrayList<KeywordsAuthorDetailVO>) null).when(aCMAuthorDetailMapper0).selectKeywordsAuthorDetailByAuthorId(anyInt());
      doReturn((ArrayList) null).when(aCMAuthorDetailMapper0).selectPAVOByFieldNameAndAuthorId(anyString() , anyInt());
      doReturn(arrayList2).when(aCMAuthorDetailMapper0).selectPaperActivationPOByAuthorId(anyInt());
      doReturn((ArrayList<String>) null).when(aCMAuthorDetailMapper0).selectSameAuthorsByAuthorId(anyInt());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      ResponseVO responseVO0 = authorDetailServiceImp0.getAuthorDetail(0, "ACM");
      assertNull(responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      AuthorDetailVO authorDetailVO0 = mock(AuthorDetailVO.class, new ViolatedAssumptionAnswer());
      ArrayList<InstitutionAuthorDetailVO> arrayList0 = new ArrayList<InstitutionAuthorDetailVO>();
      InstitutionAuthorDetailVO institutionAuthorDetailVO0 = new InstitutionAuthorDetailVO();
      arrayList0.add(institutionAuthorDetailVO0);
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn(authorDetailVO0).when(aCMAuthorDetailMapper0).selectAuthorDetailById(anyInt());
      doReturn(arrayList0).when(aCMAuthorDetailMapper0).selectInstitutionByAuthorId(anyInt());
      doReturn((ArrayList) null).when(aCMAuthorDetailMapper0).selectPaperActivationPOByAuthorId(anyInt());
      AuthorDetailServiceImp authorDetailServiceImp0 = new AuthorDetailServiceImp(iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      // Undeclared exception!
      try { 
        authorDetailServiceImp0.getAuthorDetail((-1), "ACM");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.AuthorDetailServiceImp", e);
      }
  }
}
