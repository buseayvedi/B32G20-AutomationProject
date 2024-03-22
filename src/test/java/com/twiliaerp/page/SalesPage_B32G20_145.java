package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesPage_B32G20_145 {

    public SalesPage_B32G20_145(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a/span[contains(.,'Sales')])[1]")
    public WebElement SalesMenuOption;



}
