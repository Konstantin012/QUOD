package com.pages.header;

import com.framework.page.BasePage;
import com.pages.sidebar.Sidebar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header extends BasePage {

    @FindBy(xpath = HeaderSelectors.MAIN_BUTTON)
    protected WebElement mainButton;

    public Header(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Sidebar selectSidebar(){
        mainButton.click();
        return new Sidebar(driver);
    }

}
