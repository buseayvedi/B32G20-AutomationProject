package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscussPage {

    public DiscussPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="(//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder'])/li[2]")

    public WebElement calendar_Btn;







}
