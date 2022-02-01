/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 31 13:35:44 GMT 2020
 */

package com.nju.svcdisambiguation.controller;

import com.nju.svcdisambiguation.service.AuthorDetailService;
import com.nju.svcdisambiguation.service.InstitutionDetailService;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.nju.svcdisambiguation.controller.InstitutionDetailController;
import com.nju.svcdisambiguation.dataMapper.acm.ACMAuthorDetailMapper;
import com.nju.svcdisambiguation.dataMapper.acm.ACMInstitutionDetailMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEAuthorDetailMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEInstitutionDetailMapper;
import com.nju.svcdisambiguation.serviceImp.InstitutionDetailServiceImp;
import com.nju.svcdisambiguation.vo.ResponseVO;
import com.nju.svcdisambiguation.vo.detail.institution.InstitutionInfoVO;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class InstitutionDetailController_ESTest extends InstitutionDetailController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InstitutionInfoVO institutionInfoVO0 = mock(InstitutionInfoVO.class, new ViolatedAssumptionAnswer());
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEEInstitutionDetailMapper0).selectInstitutionAuthor(anyString());
      doReturn(institutionInfoVO0).when(iEEEInstitutionDetailMapper0).selectInstitutionDetailById(anyInt());
      doReturn((String) null).when(iEEEInstitutionDetailMapper0).selectInstitutionName(anyInt());
      doReturn((ArrayList<String>) null).when(iEEEInstitutionDetailMapper0).selectSameInsByInstitutionId(anyInt());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, (IEEEAuthorDetailMapper) null, aCMAuthorDetailMapper0);
      InstitutionDetailController institutionDetailController0 = new InstitutionDetailController(institutionDetailServiceImp0);
      ResponseVO responseVO0 = institutionDetailController0.getInstitutionInfo(2028, "");
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      InstitutionDetailController institutionDetailController0 = new InstitutionDetailController(institutionDetailServiceImp0);
      // Undeclared exception!
      try { 
        institutionDetailController0.getInstitutionFieldStat(2054, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.InstitutionDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      InstitutionDetailController institutionDetailController0 = new InstitutionDetailController(institutionDetailServiceImp0);
      // Undeclared exception!
      try { 
        institutionDetailController0.getInstitutionAuthorStat((-4094), (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.InstitutionDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      InstitutionDetailController institutionDetailController0 = new InstitutionDetailController(institutionDetailServiceImp0);
      // Undeclared exception!
      try { 
        institutionDetailController0.getInstitutionAuthorActivation(0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.InstitutionDetailServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEEInstitutionDetailMapper0).selectFieldSummaryPOByInstitutionNAME(anyString());
      doReturn((String) null).when(iEEEInstitutionDetailMapper0).selectInstitutionName(anyInt());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, (ACMAuthorDetailMapper) null);
      InstitutionDetailController institutionDetailController0 = new InstitutionDetailController(institutionDetailServiceImp0);
      ResponseVO responseVO0 = institutionDetailController0.getInstitutionFieldStat((-1293), "");
      assertTrue(responseVO0.getSuccess());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEEInstitutionDetailMapper0).selectInstitutionAuthor(anyString());
      doReturn((String) null).when(iEEEInstitutionDetailMapper0).selectInstitutionName(anyInt());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, (ACMAuthorDetailMapper) null);
      InstitutionDetailController institutionDetailController0 = new InstitutionDetailController(institutionDetailServiceImp0);
      ResponseVO responseVO0 = institutionDetailController0.getInstitutionAuthorActivation((-1293), "");
      assertNull(responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((ArrayList) null).when(iEEEInstitutionDetailMapper0).selectInstitutionAuthor(anyString());
      doReturn((String) null).when(iEEEInstitutionDetailMapper0).selectInstitutionName(anyInt());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, (ACMAuthorDetailMapper) null);
      InstitutionDetailController institutionDetailController0 = new InstitutionDetailController(institutionDetailServiceImp0);
      ResponseVO responseVO0 = institutionDetailController0.getInstitutionAuthorStat((-1293), "");
      assertNull(responseVO0.getMessage());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      IEEEInstitutionDetailMapper iEEEInstitutionDetailMapper0 = mock(IEEEInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      doReturn((InstitutionInfoVO) null).when(iEEEInstitutionDetailMapper0).selectInstitutionDetailById(anyInt());
      doReturn((ArrayList) null).when(iEEEInstitutionDetailMapper0).selectSameInsByInstitutionId(anyInt());
      ACMInstitutionDetailMapper aCMInstitutionDetailMapper0 = mock(ACMInstitutionDetailMapper.class, new ViolatedAssumptionAnswer());
      IEEEAuthorDetailMapper iEEEAuthorDetailMapper0 = mock(IEEEAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      ACMAuthorDetailMapper aCMAuthorDetailMapper0 = mock(ACMAuthorDetailMapper.class, new ViolatedAssumptionAnswer());
      InstitutionDetailServiceImp institutionDetailServiceImp0 = new InstitutionDetailServiceImp(iEEEInstitutionDetailMapper0, aCMInstitutionDetailMapper0, iEEEAuthorDetailMapper0, aCMAuthorDetailMapper0);
      InstitutionDetailController institutionDetailController0 = new InstitutionDetailController(institutionDetailServiceImp0);
      // Undeclared exception!
      try { 
        institutionDetailController0.getInstitutionInfo(0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.InstitutionDetailServiceImp", e);
      }
  }

    @Test(timeout = 4000)
    public void test8()  throws Throwable  {
        InstitutionDetailService institutionDetailService0 = mock(InstitutionDetailService.class, new ViolatedAssumptionAnswer());
        doReturn((ResponseVO) null).when(institutionDetailService0).getInstitutionInfo(anyInt() , anyString());
        InstitutionDetailController institutionDetailController0 = new InstitutionDetailController(institutionDetailService0);
        ResponseVO responseVO0 = institutionDetailController0.getInstitutionInfo(1,"");
        assertNull(responseVO0);
    }

    @Test(timeout = 4000)
    public void test9()  throws Throwable  {
        InstitutionDetailService institutionDetailService0 = mock(InstitutionDetailService.class, new ViolatedAssumptionAnswer());
        doReturn((ResponseVO) null).when(institutionDetailService0).getInstitutionFieldStat(anyInt() , anyString());
        InstitutionDetailController institutionDetailController0 = new InstitutionDetailController(institutionDetailService0);
        ResponseVO responseVO0 = institutionDetailController0.getInstitutionFieldStat(1,"");
        assertNull(responseVO0);
    }

    @Test(timeout = 4000)
    public void test10()  throws Throwable  {
        InstitutionDetailService institutionDetailService0 = mock(InstitutionDetailService.class, new ViolatedAssumptionAnswer());
        doReturn((ResponseVO) null).when(institutionDetailService0).getInstitutionAuthorStat(anyInt() , anyString());
        InstitutionDetailController institutionDetailController0 = new InstitutionDetailController(institutionDetailService0);
        ResponseVO responseVO0 = institutionDetailController0.getInstitutionAuthorStat(1,"");
        assertNull(responseVO0);
    }

    @Test(timeout = 4000)
    public void test11()  throws Throwable  {
        InstitutionDetailService institutionDetailService0 = mock(InstitutionDetailService.class, new ViolatedAssumptionAnswer());
        doReturn((ResponseVO) null).when(institutionDetailService0).getInstitutionAuthorActivation(anyInt() , anyString());
        InstitutionDetailController institutionDetailController0 = new InstitutionDetailController(institutionDetailService0);
        ResponseVO responseVO0 = institutionDetailController0.getInstitutionAuthorActivation(1,"");
        assertNull(responseVO0);
    }
}