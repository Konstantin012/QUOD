package com.pages.sidebar;

import com.framework.page.BasePage;
import com.pages.header.Header;
import com.pages.header.HeaderSelectors;
import com.pages.venuepage.VenuePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sidebar extends BasePage {

    @FindBy (xpath = SidebarSelectors.REFERENCE_DATA)
    protected WebElement referenceData;
    @FindBy (xpath = HeaderSelectors.MAIN_BUTTON)
    protected WebElement mainButton;
    @FindBy (xpath = SidebarSelectors.VENUES)
    protected WebElement venues;

    public Sidebar(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }


    public VenuePage goToVenue(){
        clickIfVisible(referenceData, mainButton);
        waitingJava(3000);
        clickIfVisible(venues, referenceData);
        return new VenuePage(driver);
    }
}
