package com.ustg.level2.amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPage  {
    
	@FindBy(how = How.NAME, using = "dropdown_selected_size_name")
	private WebElement  drp_selectSize;
	
	@FindBy(how = How.ID, using = "add-to-cart-button")
	private WebElement  addToCart;
	

      WebDriver driver;

     public AddToCartPage(WebDriver driver) {
		this.driver=driver;
	}


     public void windowHandler() {
    	 
    	 String addToCart = driver.getWindowHandle();
         Set<String> atc = driver.getWindowHandles();
         Iterator<String> bn =  atc.iterator();
         while (bn.hasNext()) {
        	 driver.switchTo().window(bn.next());
        	 System.out.println(driver.getTitle());	
         }
     }
     
     
public void select_Size_list(String size){
    Select sizeDropdown=new Select(drp_selectSize);
    sizeDropdown.selectByVisibleText(size);
 }

public void clickOnAddToCart(){
	
	addToCart.click();
}

}