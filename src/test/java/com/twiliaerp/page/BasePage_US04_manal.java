package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage_US04_manal {

    public BasePage_US04_manal(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="input[@id='login']")
    public WebElement username_input;

    @FindBy(xpath="input[@id='password']")
    public WebElement password_input;

    @FindBy(xpath="button[.='Log in']")
    public WebElement login_Btn;




}
