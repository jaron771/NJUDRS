/*
 * This file was automatically generated by EvoSuite
 * Tue Dec 29 10:27:34 GMT 2020
 */

package com.nju.svcdisambiguation.controller;

import com.nju.svcdisambiguation.service.AuthorDetailService;
import com.nju.svcdisambiguation.vo.ResponseVO;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.nju.svcdisambiguation.controller.DisambiguationController;
import com.nju.svcdisambiguation.dataMapper.acm.ACMDisambiguationMapper;
import com.nju.svcdisambiguation.dataMapper.ieee.IEEEDisambiguationMapper;
import com.nju.svcdisambiguation.service.DisambiguationService;
import com.nju.svcdisambiguation.serviceImp.DisambiguationServiceImp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class DisambiguationController_ESTest extends DisambiguationController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      Integer[] integerArray0 = new Integer[0];
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn(integerArray0).when(iEEEDisambiguationMapper0).selectInsIds(anyString() , anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      disambiguationController0.startInsDisambiguation("^y", 'M', 0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      Integer[] integerArray0 = new Integer[4];
      int int0 = 0;
      Integer integer0 = new Integer(0);
      integerArray0[0] = integer0;
      Integer integer1 = new Integer(0);
      integerArray0[1] = integer1;
      Integer integer2 = new Integer(int0);
      integerArray0[2] = integer2;
      Integer integer3 = new Integer(int0);
      integerArray0[3] = integer3;
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn(integerArray0).when(iEEEDisambiguationMapper0).selectAuthorIds(anyString() , anyInt());
      doReturn("", "3rNo;Kp@40s", (String) null, (String) null).when(iEEEDisambiguationMapper0).selectAuthorNameById(anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      disambiguationServiceImp0.calLength("", "");
      disambiguationServiceImp0.calLength("$Q8", "Gcmn,`oDgU");
      disambiguationController0.getInsSimilarity("$Q8", (-1517), 0);
      // Undeclared exception!
      try { 
        disambiguationController0.startAuthorDisambiguation("$Q8", ':', 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.DisambiguationServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn("#LNr}~i", "com.nju.svcdisambiguation.serviceImp.DisambiguationServiceImp", (String) null, (String) null).when(iEEEDisambiguationMapper0).selectAuthorNameById(anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      disambiguationController0.getAuthorSimilarity("", (-2400), 375);
      // Undeclared exception!
      try { 
        disambiguationController0.getInsSimilarity("", (-774), (-774));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.DisambiguationServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn("3", "").when(iEEEDisambiguationMapper0).selectAuthorNameById(anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      // Undeclared exception!
      try { 
        disambiguationController0.getInsSimilarity("", (-795), (-795));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DisambiguationController disambiguationController0 = new DisambiguationController((DisambiguationService) null);
      // Undeclared exception!
      try { 
        disambiguationController0.calLength((String) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.controller.DisambiguationController", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp((ACMDisambiguationMapper) null, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      disambiguationController0.calLength(",Vy@UVvJX4It~(o", ",Vy@UVvJX4It~(o");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(iEEEDisambiguationMapper0).selectAuthorNameById(anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      // Undeclared exception!
      try { 
        disambiguationController0.getAuthorSimilarity("", (-1526), (-907));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.DisambiguationServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, (IEEEDisambiguationMapper) null);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      // Undeclared exception!
      try { 
        disambiguationController0.startInsDisambiguation("qlbO", '}', 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.DisambiguationServiceImp", e);
      }
  }

}
