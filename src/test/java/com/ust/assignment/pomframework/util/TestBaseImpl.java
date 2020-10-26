package com.ust.assignment.pomframework.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.ustg.level2.amazon.ShopCartPage;
import com.ustg.level2.amazon.HomePage;
import com.ustg.level2.amazon.LoginPage;
import com.ustg.level2.amazon.AddToCartPage;
import com.ustg.level2.amazon.ProductListPage;

public class TestBaseImpl implements DriverInterface {
	public static WebDriver driver;
	
	protected LoginPage loginPage;
	protected HomePage homePage;
	protected ProductListPage productListPage;
	protected AddToCartPage addToCart;
	protected ShopCartPage shopCartPage;
	

	@Override
	public WebDriver setFirefoxDriver() {
		System.setProperty("webdriver.firefox.driver", "C:\\Firefoxdriver\\firefoxdriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	@Override
	public WebDriver setChromeDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;
	}

	@BeforeSuite
	public void setUp() {
		setDriver("chrome");
		driver.get("https://www.amazon.in/");

	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}

	public void initPages() {

		loginPage = new LoginPage(driver);
		loginPage = PageFactory.initElements(driver, LoginPage.class);

		homePage = new HomePage(driver);
		homePage = PageFactory.initElements(driver, HomePage.class);

		productListPage = new ProductListPage(driver);
		productListPage = PageFactory.initElements(driver, ProductListPage.class);

		addToCart = new AddToCartPage(driver);
		addToCart = PageFactory.initElements(driver, AddToCartPage.class);
		
		shopCartPage = new ShopCartPage(driver);
		shopCartPage = PageFactory.initElements(driver, ShopCartPage.class);

		

	}

}
