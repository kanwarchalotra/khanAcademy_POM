package frameTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.caps_KhanActivity;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Test_2 extends caps_KhanActivity{

	AndroidDriver<AndroidElement> driver;
	
	@Test
	public void test2() throws InterruptedException, IOException
	{
		Thread.sleep(4000);
		driver = caps_KhanAcd(deviceName, platformName, appPackage, appActivity);
		Thread.sleep(5000);

		driver.findElement(MobileBy.AccessibilityId("Search")).click();
		Thread.sleep(6000);
		//driver.findElement(MobileBy.AccessibilityId("Search")).click();
		//Thread.sleep(6000);

		driver.findElement(MobileBy.xpath("//*[@text='Life skills']")).click();
		Thread.sleep(3000);

		driver.findElement(MobileBy.xpath("//*[@text='Financial Literacy']")).click();

		Thread.sleep(3000);

		driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).click();
		Thread.sleep(3000);

		driver.findElement(MobileBy.xpath("//*[@text='Welcome to Financial Literacy']")).click();
		Thread.sleep(15000);
		
		driver.findElement(MobileBy.xpath("//*[@text='Home']")).click();
		Thread.sleep(6000);
		
		String videoPlay=driver.findElement(MobileBy.xpath("//*[@text='Intro to Financial Literacy']")).getText();
         System.out.println(videoPlay);
		Assert.assertEquals(videoPlay,"Intro to Financial Literacy");
		
		Thread.sleep(3000);
		driver.quit();
	}
	
}
