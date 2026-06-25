package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
@FindBy(how=How.XPATH,using ="//input[@type='text']")
private WebElement Username;

@FindBy(how=How.XPATH,using ="//input[@type='password']")
private WebElement password;

@FindBy(how=How.XPATH,using ="//button[normalize-space()='Sign In']")
private WebElement click;

public WebElement getUsername() {
	return Username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getClick() {
	return click;
}
}
