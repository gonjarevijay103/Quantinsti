package com.example.test.FirstLogin;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ForInterviewPurpose {

	static WebDriver driver;


	public static void Login() throws Exception {

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://quantra.quantinsti.com/");

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"right-navigation\"]/ul/div[1]/li[2]/button")).click(); // Login button
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gonjarevijay103@gmail.com"); // Usernaeme

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vijay@1990"); // password
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/form/div[2]/div[3]/div[3]/div/button")).click(); // Login

		Thread.sleep(8000);

		WebElement we = driver.findElement(By.xpath("//*[@id=\"right-navigation\"]/ul/div[1]/li[4]/span/a")); //
		WebElement we1 = driver
				.findElement(By.xpath("//*[@id=\"right-navigation\"]/ul/div[1]/li[4]/div/div[2]/ul/li[7]/a")); //// *[@id="right-navigation"]/ul/div[1]/li[4]/div/div[2]/ul/li[7]/a
		// Actions action = new Actions(driver);

		// action.moveToElement(we).perform();

		Actions builder = new Actions(driver);
		builder.moveToElement(we).build().perform();
		builder.moveToElement(we1).click().perform();
		Thread.sleep(1000);

		driver.getTitle();
		// String st =
		// driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/main/div/div[1]/div[2]/div/div[1]/h1")).getText();
		// // for title
		// System.out.println(st);
		String str = driver
				.findElement(
						By.xpath("/html/body/div[2]/div[2]/div/main/div/div[1]/div[2]/div/div[2]/div[1]/div[3]/div[2]"))
				.getText();
		// WebElement we2 = driver.findElement(By.xpath("")).getText();
		System.out.println(str);

		driver.findElement(By.xpath("//*[@id=\"courseDetailMenu\"]/div/ul/li[8]/span/button")).click();

		// driver.findElement(By.xpath("//*[@id=\"right-navigation\"]/ul/div[1]/li[4]/div/div[2]/ul/li[7]/a/span")).click();

		List<WebElement> element = driver.findElements(
				By.cssSelector("#right-navigation > ul > div.list.-left > li.item.cart-unit.d-cart-unit > a > span"));

		// System.out.println("Cart size : "+element.size());
		for (WebElement ele : element) {
			System.out.println("Cart Count : " + ele.getText());
		}

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/main/div/div/div/div[2]/div/div[3]/button/span"))
				.click(); // Apply Coupon //
							// /html/body/div[2]/div[2]/div/main/div/div/div/div[2]/div/div[3]/button
		Thread.sleep(2000);

		Actions builder1 = new Actions(driver);
		Action enterText = builder1
				.click(driver.findElement(By.xpath("//*[@id='coupon-modal']/div[2]/div/div/form/div[2]/input"))). // Apply
																													// coupon
				keyDown(Keys.SHIFT).sendKeys("VIJAY").keyUp(Keys.SHIFT).build();
		enterText.perform();

		driver.findElement(By.xpath("//*[@id='coupon-modal']/div[2]/div/div/form/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"coupon-modal\"]/div[2]/div/div/button")).click();

		driver.findElement(By.xpath("//*[@id='right-navigation']/ul/div[1]/li[4]/img")).click();

		driver.findElement(By.xpath("//*[@id='right-navigation']/ul/div[1]/li[4]/div/ul/li[5]")).click();

		System.out.println("Thank You ");
		driver.quit();

	}

	public static void main(String[] args) throws Exception {

		Login();
		// driver.quit();

	}
}
