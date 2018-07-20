package com.sohuvideo.test;

import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class AppTest1 {

	AndroidDriver<WebElement> driver;
	@Before
	public void setUp() throws Exception {
		
		DesiredCapabilities cap = new  DesiredCapabilities();
		cap.setCapability("deviceName", "127.0.0.1:62001");
		cap.setCapability("platformVersion", "4.4.2");
		cap.setCapability("appPackage", "com.qiyi.video");
		cap.setCapability("appActivity","com.qiyi.video.WelcomeActivity" );
		cap.setCapability("automationName", "Appium");
		cap.setCapability("platformName", "Android");
		
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	}

	@After
	public void tearDown() throws Exception {
//		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
//		fail("Not yet implemented");
		//List<WebElement> LinearList = (List<WebElement>) driver.findElementByClassName("android.widget.LinearLayout");
		//WebElement Linear4 = LinearList.get(4); 
		Thread.sleep(6000);
//		driver.findElement(By.id("com.qiyi.video:id/phone_qiyi_guide_enter")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[contains(@index,0)]")).click();

		Thread.sleep(6000);
	}

}
