package com.sohuvideo.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AppiumDriver driver;
		DesiredCapabilities cap = new  DesiredCapabilities();
		cap.setCapability("deviceName", "127.0.0.1:62001");
		cap.setCapability("platformVersion", "4.4.2");
		cap.setCapability("appPackage", "com.sohu.sohuvideo");
		cap.setCapability("appActivity","com.sohu.sohuvideo.FirstNavigationActivityGroup" );
		
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
	}

}
