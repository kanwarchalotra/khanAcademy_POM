package frameTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import framework.caps_KhanActivity;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Test_1 extends caps_KhanActivity {

	AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public void setup() throws IOException, InterruptedException

	{

		driver = caps_KhanAcd(deviceName, platformName, appPackage, appActivity);

	}

	@Test
	public void test12() throws Exception {
		Thread.sleep(4000);
		System.out.println("checking if emu is opening....");
		Thread.sleep(3000);
		driver.findElement(MobileBy.AccessibilityId("Search")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Computing']")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Computer science']")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.xpath("//*[@text='Cryptography']")).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("android:id/button2")).click();
		Thread.sleep(5000);
		/*
		 * AndroidElement
		 * element=driver.findElement(MobileBy.xpath("//*[text()='Ciphers']"));
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].scrollIntoView(true);", element);
		 */
		// driver.findElementByAndroidUIAutomator("new UiScrollable(new
		// UiSelector()).scrollIntoView(text(\"Ciphers\"))");
		Thread.sleep(7000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(4000);
		driver.findElement(MobileBy.xpath("//*[@text='Information theory']")).click();
		Thread.sleep(4000);
		driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
		Thread.sleep(3000);
		// driver.findElement(MobileBy.id("android:id/button2")).click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.AccessibilityId("Bookmarks")).click();
		// Ancient information theory
//Ancient cryptography
		Thread.sleep(5000);
		String firstBKM = driver.findElementByAndroidUIAutomator("text(\"Ancient information theory\")").getText();
		String secondBKM = driver.findElementByAndroidUIAutomator("text(\"Ancient cryptography\")").getText();
		Assert.assertEquals(firstBKM,"Ancient information theory");
		Assert.assertEquals(secondBKM,"Ancient cryptography");

		
		System.out.println(firstBKM);
		System.out.println(secondBKM);
		Thread.sleep(5000);
		driver.findElement(MobileBy.xpath("//*[@text='Edit']")).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy
				.xpath("(//android.view.ViewGroup[@content-desc=\"Select bookmark\"])[1]/android.widget.ImageView"))
				.get(0).click();
		Thread.sleep(5000);
		driver.findElement(
				MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Select bookmark\"]/android.widget.ImageView"))
				.click();
		Thread.sleep(5000);
		driver.findElement(MobileBy.xpath("//*[@text='Delete']")).click();
		Thread.sleep(5000);

		

	}

}
