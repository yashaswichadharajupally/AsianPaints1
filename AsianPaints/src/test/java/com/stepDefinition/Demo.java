package com.stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Users\\yasac\\OneDrive\\Documents\\selenium\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver = new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.asianpaints.com/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='__st_preview_frame_bpn']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Allow']")).click();
		
		System.out.println("Done");
	}

}
