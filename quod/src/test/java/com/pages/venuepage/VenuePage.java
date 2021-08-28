package com.pages.venuepage;

import com.framework.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;


public class VenuePage extends BasePage {

    @FindBy(xpath = VenueSelectors.VENUES_TABLE)
    protected WebElement venuesTable;

    @FindBy(xpath = VenueSelectors.VENUE_NAME)
    protected WebElement venue;

    public VenuePage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public VenuePage extractAllVenues(){
        waitingUntilPresent(By.xpath(VenueSelectors.VENUE_NAME),10);
        List<WebElement> venues = driver.findElements(By.xpath(VenueSelectors.VENUES_TABLE));
        System.out.println(venues);
        System.out.println("-------------------------------------------------------------------------------" +
                "" + venues.stream().map(WebElement::getText).collect(Collectors.toList()));

        return new VenuePage(driver);
    }

    public VenuePage extractTest(){
        waitingUntilPresent(By.xpath(VenueSelectors.VENUE_NAME),10);
        List<WebElement> venues = driver.findElements(By.xpath("//div[@class='ag-header ag-pivot-off']"));
        System.out.println(venues);
        System.out.println("-------------------------------------------------------------------------------" +
                "" + venues.stream().map(WebElement::getText).collect(Collectors.toList()));

        return new VenuePage(driver);
    }



}
