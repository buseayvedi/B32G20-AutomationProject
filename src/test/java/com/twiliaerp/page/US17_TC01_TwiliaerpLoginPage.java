package com.twiliaerp.page;


import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US17_TC01_TwiliaerpLoginPage {

    public US17_TC01_TwiliaerpLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css="input#login")
    public WebElement emailLoginInput;

    @FindBy(css="input#password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;

    public void login(String username, String password){
        emailLoginInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
}
