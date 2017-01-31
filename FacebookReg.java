package testpacknew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\aishwaryaraov\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.facebook.com/");
		String s = dr.getCurrentUrl();
		System.out.println(s);
		//if(dr.findElement(By.xpath("//input[@name='q']")).isEnabled())
			//	System.out.println("Enabled");
		
		dr.findElement(By.xpath("//*[@id='u_0_1']")).sendKeys("fname");
		dr.findElement(By.xpath("//*[@id='u_0_3']")).sendKeys("lname");
		dr.findElement(By.xpath("//*[@id='u_0_6']")).sendKeys("a@gm.com");
		dr.findElement(By.xpath("//*[@id='u_0_9']")).sendKeys("a@gm.com");
		dr.findElement(By.xpath("//*[@id='u_0_b']")).sendKeys("a1234%");
	//	dr.findElement(By.xpath("//*[@id='month']")
			/*	WebElement mySelectElm = dr.findElement(By.xpath("//*[@id='month']")); 
		Select mySelect= new Select(mySelectElm);
				mySelect.selectByIndex(0);
				mySelectElm = dr.findElement(By.xpath("//*[@id='day']")); 
				 mySelect= new Select(mySelectElm);
				 mySelect.selectByIndex(0);
				 mySelectElm = dr.findElement(By.xpath("//*[@id='year']")); 
				 mySelect= new Select(mySelectElm);
				 mySelect.selectByIndex(0);*/
				 dr.findElement(By.xpath("//*[@id='month']")).findElement(By.xpath("//*[@id='month']/option[2]")).click();
				 dr.findElement(By.xpath("//*[@id='day']")).findElement(By.xpath("//*[@id='day']/option[2]")).click();
				 dr.findElement(By.xpath("//*[@id='year']")).findElement(By.xpath("//*[@id='year']/option[20]")).click();
				 dr.findElement(By.xpath("//*[@id='u_0_j']")).click();
				 dr.findElement(By.xpath("//*[@id='u_0_f']")).click();
		dr.close();
		
	}

}
