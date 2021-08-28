package com.pages.mainpage;

import com.framework.page.BasePage;
import com.pages.header.Header;
import com.pages.sidebar.Sidebar;
import com.pages.venuepage.VenuePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    private Sidebar sidebar;

    @FindBy(xpath = MainPageSelectors.REFERENCE_DATA)
    protected WebElement referenceData;
    @FindBy(xpath = MainPageSelectors.VENUES)
    protected WebElement venues;

    public MainPage(WebDriver driver){
        super(driver);
        this.sidebar = new Sidebar(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public Sidebar getSidebar(){
        return sidebar;
    }


//    public VenuePage goToVenue(){
//        waitingUntilPresent(By.xpath(MainPageSelectors.REFERENCE_DATA),10);
//        referenceData.click();
//        venues.click();
//        return new VenuePage(driver);
//    }
}
