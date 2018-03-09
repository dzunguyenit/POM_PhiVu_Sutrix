package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.How;

import com.configs.Configs;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Support {
	public static WebDriver driver;
	
	public void launch() {
		switch(Configs.browser.toLowerCase()) {
		case "chrome":
			ChromeDriverManager.getInstance().version("2.35").setup();
			driver = new ChromeDriver();
			break;
		}
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	public void openPage(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public WebElement getElement(How how, String locator) throws Exception {
		Thread.sleep(5000);
        switch (how){
            case CLASS_NAME:
                return driver.findElement(By.className(locator));
            case CSS:
                return driver.findElement(By.cssSelector(locator));
            case ID:
                return driver.findElement(By.id(locator));
            case ID_OR_NAME:
                return driver.findElement(By.id(locator));
            case LINK_TEXT:
                return driver.findElement(By.linkText(locator));
            case NAME:
                return driver.findElement(By.name(locator));
            case PARTIAL_LINK_TEXT:
                return driver.findElement(By.partialLinkText(locator));
            case TAG_NAME:
                return driver.findElement(By.tagName(locator));
            case XPATH:
                return driver.findElement(By.xpath(locator));
            case UNSET:
                break;
        }
        return null;
    }
	
	public void fillText(WebElement e, String text) {
		e.sendKeys(text);
	}
	
	public void click(WebElement e) {
		e.click();
	}
	
	public void keyEvent(WebElement e, String key) {
		switch(key.toLowerCase()) {
		case "enter":
			e.sendKeys(Keys.ENTER);
			break;
		}
	}
}
