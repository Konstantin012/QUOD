package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver driver;
    protected String chromeDriverP = "chromedriver.exe";
    protected String baseUrl = "https://rozetka.com.ua/";
    @Test
    public void TestMethod(){
        System.setProperty("webdriver.chrome.driver", chromeDriverP);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
}
