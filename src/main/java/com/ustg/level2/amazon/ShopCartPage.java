package com.ustg.level2.amazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ShopCartPage {


	@FindBy(how = How.XPATH, using = "//*[@id=\"hlb-view-cart-announce\"]")
	private WebElement  viewCart;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"a-autoid-0-announce\"]")
	private WebElement  drpdown_quantity;
	
	@FindBy(how = How.LINK_TEXT, using = "2")
	private WebElement  select_quantity;
	
	
	
	 WebDriver driver;
	 
	 public ShopCartPage(WebDriver driver) {
			this.driver=driver;
		}

	 public void shopCart(){
	 viewCart.click(); 
	
	 }
	 
public void pageScreenShot(String filename) throws IOException {

  File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 String imagePath=System.getProperty("user.dir")+"/screenshots/";
 FileUtils.copyFile(screenshot, new File(imagePath+filename+".png"));

}
public void drpdown_quantity(){
    
	 drpdown_quantity.click();
	 
	 select_quantity.click();
 }
/*public void viewThePrice() throws IOException {

	  File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String imagePath2=System.getProperty("user.dir")+"/screenshots/viewtheprice.png";
	 FileUtils.copyFile(screenshot, new File(imagePath2));

	}*/
}