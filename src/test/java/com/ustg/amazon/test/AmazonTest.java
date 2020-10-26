package com.ustg.amazon.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;


import com.ust.assignment.pomframework.util.TestBaseImpl;

public class AmazonTest  extends TestBaseImpl {
	
	String expected = "";
	String actuals = "";

	
	@Test(priority = 0)
	public void validloginTest() throws InterruptedException{
		
		 initPages();
		 
		Thread.sleep(2000);
		homePage.clickSignIn();
		Thread.sleep(2000);
        loginPage.enterusername("9014175376");
		Thread.sleep(2000);
		loginPage.clickContinue();
		loginPage.enterpassword("Password@123");
		Thread.sleep(2000);
		loginPage.clickLogin();
		Thread.sleep(2000);
		expected="Hello, Dhanvika";
		Thread.sleep(2000);
		actuals = homePage.welcomeMessage();
		assertEquals(expected,actuals);
		
	}
	
	@Test(priority = 1)
	public void womensCategoryTest() throws InterruptedException{
		
	    initPages();

	homePage.clickHamburgerMenu();
	Thread.sleep(2000);	
	homePage.selectWomensFashionCategory();
	Thread.sleep(2000);
	homePage.selectClothingCategory();
	Thread.sleep(2000);
	
	
	
}
	
	@Test(priority = 2)
	public void  womensFashionListTest() throws InterruptedException  {
		
		initPages();
		
			
		
		Thread.sleep(2000);
		productListPage.selectDressBrand();
		Thread.sleep(2000);
		productListPage.selectDressSize();
		Thread.sleep(2000);
		productListPage.selectDressPrice();
		Thread.sleep(2000);
		productListPage.selectDressRating();
		Thread.sleep(2000);
		productListPage.selectDress();	
		Thread.sleep(2000);	
		expected = "Women's Raspberry Handpainted Suit Set";
		actuals = productListPage.selectedDress();
		assertEquals(expected,actuals);
}
	
	@Test(priority = 3)
	public void  AddToCartPageTest() throws InterruptedException {
		
		initPages();
		
		
		Thread.sleep(2000);
		addToCart.windowHandler();
		Thread.sleep(2000);
		addToCart.select_Size_list("XL");
		Thread.sleep(2000);
		addToCart.clickOnAddToCart();
		Thread.sleep(2000);	
		System.out.println(driver.getTitle());
			
	}
	
@Test(priority = 4)
	
public void  ShopCartPageTest() throws InterruptedException, IOException {
		
		initPages();
		
		Thread.sleep(1000);
		shopCartPage.shopCart();
		Thread.sleep(1000);
		shopCartPage.pageScreenShot("selectedDress");
		Thread.sleep(1000);
		shopCartPage.drpdown_quantity();
		Thread.sleep(1000);
		shopCartPage.pageScreenShot("selectedDressPrice");
		
	}
	
@Test(priority = 5)
public void  ElectronicsCategoryTest() throws InterruptedException {
	
	initPages();
	
	
	Thread.sleep(1000);
	homePage.clickHamburgerMenu();
	Thread.sleep(1000);
	homePage.selectElectronicsCategory();
	Thread.sleep(1000);
	homePage.selectHeadphonesCategory();
	
	
}

@Test(priority = 6)
public void  headphoneListTest() throws InterruptedException, IOException  {
	
	initPages();
	
	
	
	Thread.sleep(1000);
	productListPage.selectHeadphoneBrand();
	Thread.sleep(1000);
	productListPage.selectHeadphoneType();
	Thread.sleep(1000);
	productListPage.selectHeadphoneMinPrice("1000");
	Thread.sleep(1000);
	productListPage.selectHeadphoneMaxPrice("2000");
	Thread.sleep(1000);
	productListPage.clickHeadphonePrice();
	Thread.sleep(1000);
	productListPage.clickHeadphoneRating();
	Thread.sleep(1000);
	shopCartPage.pageScreenShot("headphoneDetails");
	Thread.sleep(1000);
	productListPage.selectHeadphone();
	
}

@Test(priority = 7)
public void  AddToCartPageTest2() throws InterruptedException, IOException {
	
	initPages();
	
	
	Thread.sleep(1000);
	addToCart.windowHandler();
	Thread.sleep(1000);
	shopCartPage.pageScreenShot("selectedHeadphone");
	Thread.sleep(1000);
	addToCart.clickOnAddToCart();
	Thread.sleep(1000);
	shopCartPage.shopCart();
	Thread.sleep(1000);
	shopCartPage.pageScreenShot("viewTheCartPage");
	
}	

@Test(priority = 7)
public void  SignOutAndSignIn() throws InterruptedException, IOException {
	
	initPages();
	
	Thread.sleep(1000);
	homePage.clickHamburgerMenu();
	Thread.sleep(1000);
	homePage.clickOnSignOut();
	Thread.sleep(1000);
	loginPage.enterusername("9014175376");
	Thread.sleep(1000);
	loginPage.clickContinue();
	Thread.sleep(1000);
	loginPage.enterpassword("Password@123");
	Thread.sleep(1000);
	loginPage.clickLogin();
	Thread.sleep(1000);
	expected="Hello, Dhanvika";
	Thread.sleep(1000);
	actuals = homePage.welcomeMessage();
	assertEquals(expected,actuals);
	Thread.sleep(1000);
	homePage.clickOnCart();
	Thread.sleep(1000);
	shopCartPage.pageScreenShot("viewTheFinalCartPage");
	
}	



}
