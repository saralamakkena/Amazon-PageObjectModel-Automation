package com.ustg.level2.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductListPage {
	//Women's Fashion category filters
	@FindBy(how = How.XPATH, using = "//span[text()='ANNI DESIGNER']") 
	private WebElement  selectDressBrand;
	@FindBy(how = How.XPATH, using = "//*[@id=\"p_n_size_five_browse-vebin/1975369031\"]/span/a/span/span/button/span") 
	private WebElement  selectDressSize;
	@FindBy(how = How.XPATH, using = "//*[@id=\"p_36/4595085031\"]/span/a/span") 
	private WebElement  selectDressPrice;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"p_72/1318477031\"]/span/a/section") 
	private WebElement  selectDressRating;
	@FindBy(how = How.LINK_TEXT, using = "Women's Raspberry Handpainted Suit Set") 
	private WebElement  selectDress;
	
	//Electronic's category details 
	@FindBy(how = How.XPATH, using = "//input[@name='s-ref-checkbox-OnePlus']") 
	private WebElement  selectHeadphoneBrand;
	@FindBy(how = How.XPATH, using = "//*[@id=\"p_n_feature_six_browse-bin/15564048031\"]/span/a/div") 
	private WebElement  selectHeadphoneType;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Min']") 
	private WebElement  selectHeadphoneMinPrice;
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Max']") 
	private WebElement  selectHeadphoneMaxPrice;
	@FindBy(how = How.XPATH, using = "//input[@class='a-button-input']") 
	private WebElement  HeadphonePrice;
	@FindBy(how = How.XPATH, using = "//*[@id=\"p_72/1318476031\"]/span/a/section") 
	private WebElement  selectHeadphoneRating;
	@FindBy(how = How.XPATH, using = "//span[text()='OnePlus Bullets Wireless Z in-Ear Bluetooth Earphones with Mic (Black)']") 
	private WebElement  selectHeadphone;

	 WebDriver driver;
	
	public ProductListPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Test Methods for Women's Fashion category
	
	 public void selectDressSize() {
		 selectDressSize.click();
} 
	 public void selectDressBrand() {
		 selectDressBrand.click();
	
}
	 public void selectDressPrice() {
		 selectDressPrice.click();
	
} 
	 public void selectDressRating() {
		 selectDressRating.click();
	}
	 
	 public String selectedDress() {
	    	return driver.findElement(By.linkText("Women's Raspberry Handpainted Suit Set")).getText();
	    }
	    
	 public void selectDress() {
		 selectDress.click();
	
}  
	 
	 //Test Methods for Headphones category
	 public void selectHeadphoneBrand() {
		 selectHeadphoneBrand.click();
}
	 public void selectHeadphoneType() {
		 selectHeadphoneType.click();
} 
	 public void selectHeadphoneMinPrice(String min) {
		 selectHeadphoneMinPrice.click();
		 selectHeadphoneMinPrice.sendKeys(min);
} 
	 public void selectHeadphoneMaxPrice(String max) {
		 selectHeadphoneMaxPrice.click();
		 selectHeadphoneMaxPrice.sendKeys(max);
}	 
	 public void clickHeadphonePrice() {
		 HeadphonePrice.click();
}
	 
	 public void clickHeadphoneRating() {
		 selectHeadphoneRating.click();
}
	 
	 
	 public void selectHeadphone() {
		 selectHeadphone.click();
}
}