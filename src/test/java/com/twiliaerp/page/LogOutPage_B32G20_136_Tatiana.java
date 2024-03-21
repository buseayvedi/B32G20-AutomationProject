package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage_B32G20_136_Tatiana extends BasePage_US01_Buse{

    public LogOutPage_B32G20_136_Tatiana(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(css = "a[data-menu='logout']")
    public WebElement logOutButtn;

    public void logOut(){
        logOutButtn.click();
    }

}
