package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.pages.homepage.HomePage.openStartWindow;

public class FirstTest {
    WebDriver driver;
    protected String chromeDriverP = "chromedriver.exe";
    protected String baseUrl = "http://10.0.22.40:5180/quodadmin/qakharkiv314NewDesign/#/auth/login";
//    protected String baseUrl = "http://10.0.22.40:4480/quodadmin/qakharkiv308NewDesign/#/auth/login";

    @Test
    public void TestMethod() {
        System.setProperty("webdriver.chrome.driver", chromeDriverP);
        driver = new ChromeDriver();
        openStartWindow(driver, baseUrl).
                logIn("adm037", "adm037");


    }
}
