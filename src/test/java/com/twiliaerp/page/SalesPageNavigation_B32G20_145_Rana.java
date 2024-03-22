package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPageNavigation_B32G20_145_Rana {

    public SalesPageNavigation_B32G20_145_Rana(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a/span[contains(.,'Sales')])[1]")
    public WebElement SalesMenuOption;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement selectAllCheckBox;



}
