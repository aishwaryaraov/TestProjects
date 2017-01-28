package testpacknew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testclass {
	
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\aishwaryaraov\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.google.com");
		String s = dr.getCurrentUrl();
		System.out.println(s);
		if(dr.findElement(By.xpath("//input[@name='q']")).isEnabled())
				System.out.println("Enabled");
		dr.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("test by xpath");
		//dr.findElement(By.id("lst-ib")).sendKeys("test by id");
		dr.findElement(By.xpath("//button[@name='btnG']")).click();
		System.out.println("button clicked");
		dr.findElement(By.xpath("//div[@class='srg']/div[@class='rc']")).click();
		System.out.println(dr.getCurrentUrl());
		dr.close();
	}

}
