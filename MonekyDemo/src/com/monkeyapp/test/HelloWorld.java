package com.monkeyapp.test;

import org.testng.annotations.Test;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;

public class HelloWorld {
	static IOSDriver<IOSElement> driver = null;
  @Test
  public void f()  throws InterruptedException{
	
	  Thread.sleep(3000);
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
