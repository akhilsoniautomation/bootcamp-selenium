package com.selenium.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        
//        System.setProperty("webdriver.chrome.driver","/Users/akhilsoni/Documents/BootCamp/chromedriver-mac-arm64/chromedriver");
    	WebDriverManager.chromedriver().setup();
    	
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http:\\www.facebook.com");


        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("akhilsoniautomation@gmail.com");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Password#1234");

        WebElement login = driver.findElement(By.name("login"));
        login.click();
        
        driver.quit();

        System.out.println("Login successfull");

        
        
    }
}
