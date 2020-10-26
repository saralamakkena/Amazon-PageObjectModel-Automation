package com.ust.assignment.pomframework.util;

import org.openqa.selenium.WebDriver;

public interface DriverInterface {

	default void setDriver(String browserType) {
		switch (browserType) {
		case "chrome":
			setChromeDriver();
			break;
		case "firefox":
			setFirefoxDriver();
			break;
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Chrome as browser of choice..");
			setChromeDriver();
		}
	}

	WebDriver setFirefoxDriver();

	WebDriver setChromeDriver();

}
