/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Oct 31 13:29:37 GMT 2020
 */

package com.nju.svcdisambiguation.serviceImp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class SearchServiceImp_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.nju.svcdisambiguation.serviceImp.SearchServiceImp"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "GBK"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\Lenovo\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "CN"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\Lenovo\\Desktop\\Project4\\oasisplus\\svc-disambiguation\\target\\classes"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Lenovo"); 
    java.lang.System.setProperty("user.language", "zh"); 
    java.lang.System.setProperty("user.name", "Lenovo"); 
    java.lang.System.setProperty("user.timezone", "Asia/Shanghai"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SearchServiceImp_ESTest_scaffolding.class.getClassLoader() ,
      "com.nju.svcdisambiguation.vo.ResponseVO",
      "com.nju.svcdisambiguation.vo.search.DSRRankedByCitationsVO",
      "com.nju.svcdisambiguation.vo.search.AuthorSearchResultVO",
      "com.nju.svcdisambiguation.vo.search.DocumentSearchResultVO",
      "com.nju.svcdisambiguation.po.ieee.IEEEPaperPO",
      "com.nju.svcdisambiguation.vo.search.SearchResultTimeVO",
      "com.nju.svcdisambiguation.po.acm.ACMPaperPO",
      "com.nju.svcdisambiguation.vo.search.SearchResultCitationVO",
      "com.nju.svcdisambiguation.dataMapper.acm.ACMSearchMapper",
      "com.nju.svcdisambiguation.vo.search.DSRRankedByTimeVO",
      "com.nju.svcdisambiguation.service.SearchService",
      "com.nju.svcdisambiguation.serviceImp.SearchServiceImp",
      "com.nju.svcdisambiguation.dataMapper.ieee.IEEESearchMapper"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.nju.svcdisambiguation.dataMapper.acm.ACMSearchMapper", false, SearchServiceImp_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.nju.svcdisambiguation.dataMapper.ieee.IEEESearchMapper", false, SearchServiceImp_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SearchServiceImp_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.nju.svcdisambiguation.serviceImp.SearchServiceImp",
      "com.nju.svcdisambiguation.vo.search.SearchResultTimeVO",
      "com.nju.svcdisambiguation.vo.ResponseVO",
      "com.nju.svcdisambiguation.vo.search.SearchResultCitationVO",
      "com.nju.svcdisambiguation.po.ieee.IEEEPaperPO",
      "com.nju.svcdisambiguation.vo.search.DocumentSearchResultVO",
      "com.nju.svcdisambiguation.vo.search.DSRRankedByTimeVO",
      "com.nju.svcdisambiguation.vo.search.DSRRankedByCitationsVO",
      "com.nju.svcdisambiguation.po.acm.ACMPaperPO",
      "com.nju.svcdisambiguation.vo.search.AuthorSearchResultVO"
    );
  }
}
