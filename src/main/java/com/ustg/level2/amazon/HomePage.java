package com.ustg.level2.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {
	
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]/div/span")
	private WebElement btn_Signin;
	
	@FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
	private WebElement categorylist;
	
	@FindBy(partialLinkText="Dhanvika")
	private WebElement welcometext;

	@FindBy(partialLinkText="Women's Fashion")
	private WebElement selectWomensCategory;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[3]/a")
	private WebElement selectClothingCategory;
	
	@FindBy(partialLinkText = "TV, Appliances, Electronics")
	private WebElement selectElectronicsCategory;
	
	@FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[5]/a")
	private WebElement selectHeadphonesCategory;
	
	@FindBy(linkText="Sign Out")
	private WebElement btn_Signout;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	private WebElement btn_cartPage;
	
	WebDriver driver;
	

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	 public void clickSignIn() {
		 btn_Signin.click();
	 }
	
    public String welcomeMessage() {
    	return driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div/span")).getText();
    }
    
    public void clickHamburgerMenu() {
    	categorylist.click();
    }
    
    public void selectWomensFashionCategory() {
		selectWomensCategory.click();
	}

    public void selectClothingCategory() {
		selectClothingCategory.click();
    }	
	
    public void selectElectronicsCategory() {
		selectElectronicsCategory.click();
	}
    
    public void selectHeadphonesCategory() {
		selectHeadphonesCategory.click();
	}
    
    public void clickOnSignOut() {
    	btn_Signout.click();
	}
    
    public void clickOnCart() {
    	btn_cartPage.click();
	}
    
}
