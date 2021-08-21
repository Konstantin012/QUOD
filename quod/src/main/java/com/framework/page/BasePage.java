package com.framework.page;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void inputTextField(WebElement textField, String value) {
        Actions actions = new Actions(driver);
        textField.click();
        textField.clear();
        textField.sendKeys(value);
        actions.sendKeys(Keys.TAB).build().perform();
    }

    protected void waitingUntilPresent(By locator, int time) {
        boolean check1 = true;
        try {
            new WebDriverWait(driver, Duration.ofSeconds(time))
                    .until(ExpectedConditions.presenceOfElementLocated(
                            locator
                    ));
        } catch (TimeoutException e) {
            check1 = false;
        }
        Assert.assertTrue(check1, "Home Page is not founded");
    }

    //TODO for Darina

    /**
     * timeout in second
     */
    protected boolean waitForPageLoad(int timeout) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String jsCommand = "return document.readyState";
        boolean check1 = true;
        // Validate readyState before doing any waits
        if (js.executeScript(jsCommand).toString().equals("complete")) {
            return check1;
        }
        for (int i = 0; i < timeout; i++) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            TimeManager.waitInSeconds(3);
            if (js.executeScript(jsCommand).toString().equals("complete")) {
                break;
            }
        }
        return check1 = false;
    }


    protected void waitingElementVisible(WebElement locator, int time) {
        new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.visibilityOf(
                        locator
                ));
    }

    protected void waitingExpectedElementContaince(WebElement locator, int time, String value) {
        new WebDriverWait(driver, Duration.ofSeconds(time))
                .until(ExpectedConditions.attributeContains(
                        locator, "text", value
                ));
    }

    protected void checkTextFromLocator(WebElement element, String expectedText) {
        String actualText = element.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    protected void getAtributeAdnCheck(WebElement element, String attribute, String expectedValue) {
        String actualValue = element.getAttribute(attribute);
        Assert.assertEquals(actualValue, expectedValue);
    }

    protected void waitingJava(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected boolean tryFindElement(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


}