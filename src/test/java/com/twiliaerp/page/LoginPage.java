package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="login")
    public WebElement username_input;

    @FindBy(id="password")
    public WebElement password_input;

    @FindBy(xpath="//button[.='Log in']")
    public WebElement login_Btn;


    public void login(String username, String password) {
        username_input.sendKeys(username);
        password_input.sendKeys(password);
        login_Btn.click();


    }


}
