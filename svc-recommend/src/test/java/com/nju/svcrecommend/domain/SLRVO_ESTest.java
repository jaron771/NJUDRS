/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 28 09:04:58 GMT 2020
 */

package com.nju.svcrecommend.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import com.nju.svcrecommend.domain.AuthorVO;
import com.nju.svcrecommend.domain.PaperVO;
import com.nju.svcrecommend.domain.SLRVO;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class SLRVO_ESTest extends SLRVO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayList<PaperVO> arrayList0 = new ArrayList<PaperVO>();
      SLRVO sLRVO0 = new SLRVO(arrayList0, 0);
      int int0 = sLRVO0.getTotal();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SLRVO sLRVO0 = new SLRVO();
      sLRVO0.setTotal((-3150));
      int int0 = sLRVO0.getTotal();
      assertEquals((-3150), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SLRVO sLRVO0 = new SLRVO();
      ArrayList<PaperVO> arrayList0 = new ArrayList<PaperVO>();
      sLRVO0.setDocuments(arrayList0);
      ArrayList<PaperVO> arrayList1 = sLRVO0.getDocuments();
      assertEquals(0, arrayList1.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<PaperVO> arrayList0 = new ArrayList<PaperVO>();
      ArrayList<AuthorVO> arrayList1 = new ArrayList<AuthorVO>();
      PaperVO paperVO0 = new PaperVO((-1661), "", "", "", "", 1, 1, arrayList1, "");
      arrayList0.add(paperVO0);
      SLRVO sLRVO0 = new SLRVO(arrayList0, 0);
      sLRVO0.getDocuments();
      assertEquals(0, sLRVO0.getTotal());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<PaperVO> arrayList0 = new ArrayList<PaperVO>();
      SLRVO sLRVO0 = new SLRVO(arrayList0, 46);
      int int0 = sLRVO0.getTotal();
      assertEquals(46, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SLRVO sLRVO0 = new SLRVO();
      ArrayList<PaperVO> arrayList0 = sLRVO0.getDocuments();
      assertNull(arrayList0);
  }
}
