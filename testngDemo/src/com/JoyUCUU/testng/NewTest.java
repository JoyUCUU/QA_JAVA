package com.JoyUCUU.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	/**
	 * 除了以下几种方法还有
	 * @Factory 作为一个工厂，返回testNG的测试类对象，该方法必须返回Object[]
	 * @Listeners 定义一个测试类的监听器
	 * @parameters 介绍如何将参数传递给@Test方法
	 */
  @Test(dataProvider = "dp")
  /**
   * 测试类或者方法
   * @param n
   * @param s
   */
  public void f(Integer n, String s) {
	  System.out.println("this is @Test " + n + "\t" + s);
  }
  @BeforeMethod
  /**
   * 注解的方法运行次数与@Test个数有关，运行@Test前运行，如果有N个@Test运行N次
   */
  public void beforeMethod() {
	  System.out.println("This is  @BeforeMethod");
  }

  @AfterMethod
  /**
   * 注解的方法运行次数与@Test个数有关，运行@Test后运行，如果有N个@Test运行N次
   */
  public void afterMethod() {
	  System.out.println("This is  @AfterMethod");
  }


  @DataProvider
  /**
   * 为一个方法提供数据，必须返回Object[][]，如果一个方法想获取数据，必须用dataProvider接收数据
   * @return
   */
  public Object[][] dp() {
	  System.out.println("This is @DataProvider"); 
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  /**
   * 注释的方法只运行一次，运行在此套件类前
   */
  public void beforeClass() {
	  System.out.println("This is @BeforeClass"); 
  }

  @AfterClass
  /**
   * 注释的方法只运行一次，运行在此套件类后
   */
  public void afterClass() {
	  System.out.println("This is @AfterClass"); 
  }

  @BeforeTest
  /**
   * 注释的方法只运行一次，运行在此套件前
   */
  public void beforeTest() {
	  System.out.println("This is @BeforeTest"); 
  }

  @AfterTest
  /**
   * 注释的方法只运行一次,运行在此套件后
   */
  public void afterTest() {
	  System.out.println("This is @AfterTest"); 
  }
 
  @BeforeSuite
  /**
   * 注释的方法只运行一次，运行此套件中所有测试方法前运行
   */
  public void beforeSuite() {
	  System.out.println("This is @BeforeSuite"); 
  }

  @AfterSuite
  /**
   * 注释的方法只运行一次，运行完此套件的所有测试方法后运行
   */
  public void afterSuite() {
	  System.out.println("This is @AfterSuite"); 
  }

}
