package com.loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageObject.LoginPom;
import com.utility.BaseClass;

public class verifyTest001 extends BaseClass {

	@Test
	public void verifyLogin() {
		
		LoginPom login= PageFactory.initElements(driver, LoginPom.class);
		login.getUsername().sendKeys("Pradnya.b@metphi.in");
		login.getPassword().sendKeys("admin");
		login.getClick().click();

		
		
		

//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pradnya.b@metaphi.in");
//	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
//	 driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
//	 
	 
	}
	
	
	
}
