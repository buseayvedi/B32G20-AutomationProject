package com.twiliaerp.page;

import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_US01 {

    public LoginPage_US01(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement usernameInputBox;

    @FindBy(id ="password")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement errorMessage;



    //---------------------------

//    public void loginBy(){
//        usernameInputBox.sendKeys(ConfigurationReader.getProperty("POS_username"));
//        passwordInputBox.sendKeys(ConfigurationReader.getProperty("POS_password"));
//        loginBtn.click();
//    }

}
