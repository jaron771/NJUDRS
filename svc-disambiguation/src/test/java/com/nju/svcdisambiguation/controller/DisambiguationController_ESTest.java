/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 08 12:31:51 GMT 2022
 */

package com.nju.svcdisambiguation.controller;

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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class DisambiguationController_ESTest extends DisambiguationController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(iEEEDisambiguationMapper0).selectAuthorNameById(anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      // Undeclared exception!
      try { 
        disambiguationController0.getInsSimilarity("", (-669), 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.DisambiguationServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      Integer[] integerArray0 = new Integer[0];
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn(integerArray0).when(iEEEDisambiguationMapper0).selectInsIds(anyString() , anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      disambiguationController0.startInsDisambiguation("", '}', 0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer[] integerArray0 = new Integer[1];
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn(integerArray0).when(iEEEDisambiguationMapper0).selectAuthorIds(anyString() , anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp((ACMDisambiguationMapper) null, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      disambiguationController0.startAuthorDisambiguation(";9J5ak", ']', 0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      disambiguationController0.calLength("&G't[Kt", "Jq_N,8|<~Px:F5-zm1o");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn("", "z>7{w").when(iEEEDisambiguationMapper0).selectAuthorNameById(anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      double double0 = disambiguationController0.getInsSimilarity("", (-1), (-1));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null).when(iEEEDisambiguationMapper0).getMaxAuthorAlias();
      doReturn("", "").when(iEEEDisambiguationMapper0).selectAuthorNameById(anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      // Undeclared exception!
      try { 
        disambiguationController0.getInsSimilarity("", (-1), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.DisambiguationServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn("", "2$XO1").when(iEEEDisambiguationMapper0).selectAuthorNameById(anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      double double0 = disambiguationController0.getAuthorSimilarity("2$XO1", (-1877), 674);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null).when(iEEEDisambiguationMapper0).getMaxAuthorAlias();
      doReturn("", "").when(iEEEDisambiguationMapper0).selectAuthorNameById(anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      // Undeclared exception!
      try { 
        disambiguationController0.getAuthorSimilarity("s+", (-1), 945);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.serviceImp.DisambiguationServiceImp", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ACMDisambiguationMapper aCMDisambiguationMapper0 = mock(ACMDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      IEEEDisambiguationMapper iEEEDisambiguationMapper0 = mock(IEEEDisambiguationMapper.class, new ViolatedAssumptionAnswer());
      doReturn("", "D").when(iEEEDisambiguationMapper0).selectAuthorNameById(anyInt());
      DisambiguationServiceImp disambiguationServiceImp0 = new DisambiguationServiceImp(aCMDisambiguationMapper0, iEEEDisambiguationMapper0);
      DisambiguationController disambiguationController0 = new DisambiguationController(disambiguationServiceImp0);
      // Undeclared exception!
      try { 
        disambiguationController0.getInsSimilarity("&G't[Kt", 0, 0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DisambiguationController disambiguationController0 = new DisambiguationController((DisambiguationService) null);
      // Undeclared exception!
      try { 
        disambiguationController0.calLength("", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.controller.DisambiguationController", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DisambiguationController disambiguationController0 = new DisambiguationController((DisambiguationService) null);
      // Undeclared exception!
      try { 
        disambiguationController0.startAuthorDisambiguation(" N1Zi*<G3|to{", '\'', 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.controller.DisambiguationController", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DisambiguationController disambiguationController0 = new DisambiguationController((DisambiguationService) null);
      // Undeclared exception!
      try { 
        disambiguationController0.startInsDisambiguation("", 'w', (-183));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcdisambiguation.controller.DisambiguationController", e);
      }
  }
}
