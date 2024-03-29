/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Feb 08 12:06:00 GMT 2022
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
public class InstitutionDetailServiceImp_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.nju.svcdisambiguation.serviceImp.InstitutionDetailServiceImp"; 
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
    java.lang.System.setProperty("user.dir", "D:\\0\\2021Winter\\minjie\\oasisplus\\svc-disambiguation"); 
    java.lang.System.setProperty("java.io.tmpdir", "D:\\Temp\\"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(InstitutionDetailServiceImp_ESTest_scaffolding.class.getClassLoader() ,
      "com.nju.svcdisambiguation.vo.detail.author.AuthorPublicationSummaryVO",
      "com.nju.svcdisambiguation.dataMapper.acm.ACMInstitutionDetailMapper",
      "com.nju.svcdisambiguation.vo.ResponseVO",
      "com.nju.svcdisambiguation.vo.detail.ReferenceVO",
      "com.nju.svcdisambiguation.dataMapper.acm.ACMAuthorDetailMapper",
      "com.nju.svcdisambiguation.po.PaperActivationPO",
      "com.nju.svcdisambiguation.service.InstitutionDetailService",
      "com.nju.svcdisambiguation.vo.detail.author.AuthorDetailVO",
      "com.nju.svcdisambiguation.vo.detail.author.KeywordsAuthorDetailVO",
      "com.nju.svcdisambiguation.po.AuthorInstitutionsPO",
      "com.nju.svcdisambiguation.dataMapper.ieee.IEEEInstitutionDetailMapper",
      "com.nju.svcdisambiguation.po.SameAuthorPO",
      "com.nju.svcdisambiguation.vo.detail.institution.InstitutionInfoVO",
      "com.nju.svcdisambiguation.serviceImp.InstitutionDetailServiceImp",
      "com.nju.svcdisambiguation.po.FieldSummaryPO",
      "com.nju.svcdisambiguation.vo.detail.author.InstitutionAuthorDetailVO",
      "com.nju.svcdisambiguation.vo.PaperVO",
      "com.nju.svcdisambiguation.dataMapper.ieee.IEEEAuthorDetailMapper",
      "com.nju.svcdisambiguation.vo.AuthorVO",
      "com.nju.svcdisambiguation.vo.detail.institution.InstitutionAuthorStatVO"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.nju.svcdisambiguation.dataMapper.acm.ACMAuthorDetailMapper", false, InstitutionDetailServiceImp_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.nju.svcdisambiguation.dataMapper.acm.ACMInstitutionDetailMapper", false, InstitutionDetailServiceImp_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.nju.svcdisambiguation.dataMapper.ieee.IEEEAuthorDetailMapper", false, InstitutionDetailServiceImp_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.nju.svcdisambiguation.dataMapper.ieee.IEEEInstitutionDetailMapper", false, InstitutionDetailServiceImp_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("com.nju.svcdisambiguation.vo.detail.institution.InstitutionInfoVO", false, InstitutionDetailServiceImp_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(InstitutionDetailServiceImp_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.nju.svcdisambiguation.serviceImp.InstitutionDetailServiceImp",
      "com.nju.svcdisambiguation.vo.ResponseVO",
      "com.nju.svcdisambiguation.vo.detail.institution.InstitutionInfoVO",
      "com.nju.svcdisambiguation.vo.detail.institution.InstitutionAuthorStatVO"
    );
  }
}
