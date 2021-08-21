package com.pages.homepage;

import com.framework.page.BasePage;
import com.pages.mainpage.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {

    @FindBy(id = LogInSelectors.LOGIN_INPUT)
    protected WebElement loginInput;

    @FindBy(id = LogInSelectors.PASSWORD_INPUT)
    protected WebElement passwordInput;

    @FindBy(xpath = LogInSelectors.LOGIN_BUTTON)
    protected WebElement loginButton;

    @FindBy(xpath = LogInSelectors.LOGIN_BUTTON)
    protected WebElement verifyPage;

    public HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public static HomePage openStartWindow(WebDriver driver, String baseUrl){
        driver.get(baseUrl);
        driver.manage().window().maximize();
        return new HomePage(driver);
    }


    public MainPage logIn(String userName, String password){
        inputTextField(loginInput ,userName);
        inputTextField(passwordInput ,password);
        loginButton.click();
        waitingUntilPresent(By.xpath(".//*[text()='General']"),1);
        return new MainPage();
    }




}
