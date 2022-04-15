/*
 * This file was automatically generated by EvoSuite
 * Mon Dec 28 09:02:03 GMT 2020
 */

package com.nju.svcrecommend.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import com.nju.svcrecommend.domain.ReviewerRes;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class ReviewerRes_ESTest extends ReviewerRes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ReviewerRes reviewerRes0 = new ReviewerRes();
      reviewerRes0.setName("iDubk{v");
      String string0 = reviewerRes0.getName();
      assertEquals("iDubk{v", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ReviewerRes reviewerRes0 = new ReviewerRes("q??;)7;j2 0>", 0, "q??;)7;j2 0>", arrayList0, arrayList0);
      reviewerRes0.setName("");
      reviewerRes0.getName();
      assertEquals(0, reviewerRes0.getId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ReviewerRes reviewerRes0 = new ReviewerRes("q??;)7;j2 0>", 0, "q??;)7;j2 0>", arrayList0, arrayList0);
      reviewerRes0.getKeywords();
      assertEquals(0, reviewerRes0.getId());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add((String) null);
      ReviewerRes reviewerRes0 = new ReviewerRes((String) null, 0, (String) null, arrayList0, arrayList0);
      reviewerRes0.getKeywords();
      assertEquals(0, reviewerRes0.getId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ReviewerRes reviewerRes0 = new ReviewerRes("", 0, "", arrayList0, arrayList0);
      reviewerRes0.getInstitutions();
      assertEquals(0, reviewerRes0.getId());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ReviewerRes reviewerRes0 = new ReviewerRes("q??;)7;j2 0>", 0, "q??;)7;j2 0>", arrayList0, arrayList0);
      arrayList0.add((String) null);
      reviewerRes0.getInstitutions();
      assertEquals(0, reviewerRes0.getId());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ReviewerRes reviewerRes0 = new ReviewerRes((String) null, 0, (String) null, arrayList0, arrayList0);
      int int0 = reviewerRes0.getId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ReviewerRes reviewerRes0 = new ReviewerRes("\\$", 1, "\\$", (ArrayList<String>) null, (ArrayList<String>) null);
      int int0 = reviewerRes0.getId();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ReviewerRes reviewerRes0 = new ReviewerRes("q??;)7;j2 0>", 0, "q??;)7;j2 0>", arrayList0, arrayList0);
      reviewerRes0.getDb();
      assertEquals(0, reviewerRes0.getId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ReviewerRes reviewerRes0 = new ReviewerRes("", 335, "", (ArrayList<String>) null, (ArrayList<String>) null);
      reviewerRes0.getDb();
      assertEquals(335, reviewerRes0.getId());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ReviewerRes reviewerRes0 = new ReviewerRes();
      reviewerRes0.setInstitutions((ArrayList<String>) null);
      assertNull(reviewerRes0.getName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ReviewerRes reviewerRes0 = new ReviewerRes((String) null, (-14), (String) null, arrayList0, arrayList0);
      reviewerRes0.setDb((String) null);
      assertEquals((-14), reviewerRes0.getId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ReviewerRes reviewerRes0 = new ReviewerRes((String) null, (-14), (String) null, arrayList0, arrayList0);
      reviewerRes0.setId((-14));
      assertEquals((-14), reviewerRes0.getId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ReviewerRes reviewerRes0 = new ReviewerRes((String) null, (-14), (String) null, arrayList0, arrayList0);
      int int0 = reviewerRes0.getId();
      assertEquals((-14), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      ReviewerRes reviewerRes0 = new ReviewerRes((String) null, (-14), (String) null, arrayList0, arrayList0);
      reviewerRes0.getDb();
      assertEquals((-14), reviewerRes0.getId());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ReviewerRes reviewerRes0 = new ReviewerRes();
      String string0 = reviewerRes0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ReviewerRes reviewerRes0 = new ReviewerRes();
      reviewerRes0.setKeywords((ArrayList<String>) null);
      assertNull(reviewerRes0.getName());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ReviewerRes reviewerRes0 = new ReviewerRes();
      ArrayList<String> arrayList0 = reviewerRes0.getKeywords();
      assertNull(arrayList0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ReviewerRes reviewerRes0 = new ReviewerRes();
      ArrayList<String> arrayList0 = reviewerRes0.getInstitutions();
      assertNull(arrayList0);
  }
}
