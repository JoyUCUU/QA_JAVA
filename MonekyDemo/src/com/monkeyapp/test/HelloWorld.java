package com.monkeyapp.test;

import org.testng.annotations.Test;
import org.testng.internal.ThreeStateBoolean;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertNotNull;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

@Test
public class HelloWorld {
	static IOSDriver<IOSElement> driver = null;
  public void f()  throws InterruptedException{
	/**
	 * xpath
	 * (new TouchAction(driver)).tap(141, 435).perform()
         (new TouchAction(driver)).tap(361, 40).perform()
	 * 	//XCUIElementTypeOther[@name="Monkey"]/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther
	 */
	  //一、点击
	    (new TouchAction(driver)).tap(141, 435).perform();
	    Thread.sleep(5000);
	    
	    //二、滑动（因为不同的手机有不同的分辨率，所以要先获取分辨率再确定手指的位置）
	   Dimension d = driver.manage().window().getSize();
	   int x = d.getWidth();
	   int y = d.getHeight();
	   driver.swipe(x/3, y/5, x/3, y/2, 3000);
	   //三、有目标的滑动（有时候需要只滑动某一项，可以先得到某一个要滑动的目标的位置）
	  IOSElement element1 = driver.findElement(By.xpath("//XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTable/XCUIElementTypeCell[2]"));
	     //1、获取某一个元素的Y轴
	  int  elementStartY = element1.getLocation().getY();
	     //2、获取元素的宽和高
	  int width = element1.getSize().getWidth();
	  int height = element1.getSize().getHeight();
	     //3、确定滑动的位置
	   int startX = width-100;
	   int startY = height/2 + elementStartY;
	   driver.swipe(startX, startY, startX - 200, startY, 500);
	   Thread.sleep(5000);
	   //四、九宫格解锁，一般使用TouchAction方法，但是一直没有用到过，记录一下
	   //五、模糊查询scrollTo(String text)、精确查找scrollToExact(String text)
	   //String text = "overtrue";
	   //driver.scrollToExact(text);
	   driver.scrollTo("overtrue");
	   
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException{
	  //set up appium
	  File classpathRoot = new File(System.getProperty("user.dir"));
	  File appDir = new File(classpathRoot,"apps");
	  File app = new File(appDir,"/MonekyDemo/apps/Monkey.app");
	  String  app1 = "/Users/joyliu/QA_JAVA/MonekyDemo/apps/Monkey.app";
	  DesiredCapabilities caps = new DesiredCapabilities();
	  //设备平台
	  caps.setCapability("platformName", "iOS");
	  //设备名称
	  caps.setCapability("deviceName", "iPhone 8 Plus");
	  //版本
	  caps.setCapability("platformVersion", "11.0");
	  //app路径
	  caps.setCapability("app", app1);
	  //禁止重签名
	  caps.setCapability("noSign", true);
	  //自动接收提示信息
	  caps.setCapability("autoAcceptAlerts", true);
	  driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
	  System.out.println("running done!");
	 
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("running over!");
	  driver.quit();
  }

}
