/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 28 07:16:27 GMT 2020
 */

package com.nju.svcrecommend.serviceImp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.nju.svcrecommend.domain.PaperVO;
import com.nju.svcrecommend.serviceImp.YearCmp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class YearCmp_ESTest extends YearCmp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      YearCmp yearCmp0 = new YearCmp();
      // Undeclared exception!
      try { 
        yearCmp0.compare((Object) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.nju.svcrecommend.serviceImp.YearCmp", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      YearCmp yearCmp0 = new YearCmp();
      PaperVO paperVO0 = new PaperVO();
      // Undeclared exception!
      try { 
        yearCmp0.compare(yearCmp0, paperVO0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.nju.svcrecommend.serviceImp.YearCmp cannot be cast to com.nju.svcrecommend.domain.PaperVO
         //
         verifyException("com.nju.svcrecommend.serviceImp.YearCmp", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      YearCmp yearCmp0 = new YearCmp();
      PaperVO paperVO0 = new PaperVO();
      PaperVO paperVO1 = new PaperVO();
      paperVO0.setYear((-1));
      int int0 = yearCmp0.compare(paperVO1, paperVO0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      YearCmp yearCmp0 = new YearCmp();
      PaperVO paperVO0 = new PaperVO();
      int int0 = yearCmp0.compare(paperVO0, paperVO0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      YearCmp yearCmp0 = new YearCmp();
      PaperVO paperVO0 = new PaperVO();
      PaperVO paperVO1 = new PaperVO();
      paperVO0.setYear((-1));
      int int0 = yearCmp0.compare(paperVO0, paperVO1);
      assertEquals(1, int0);
  }
}
