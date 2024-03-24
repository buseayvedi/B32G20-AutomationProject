package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US17_TC02_TwiliaerpDashboardPage {

    public US17_TC02_TwiliaerpDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='navbar-collapse collapse']//span")
    public List<WebElement> allTopSMMenModules;

    @FindBy(xpath = "//li[@id='menu_more_container']")
    public WebElement moreDropdownModule;

    @FindBy(xpath = "//li[@id='menu_more_container']//span")
    public List<WebElement> allMoreDropdownModules;


    @FindBy(xpath ="(//div[@class='navbar-collapse collapse']//span)[20]" )
    public WebElement smAccountName;
}

