package com.twiliaerp.page;

import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage_US04_manal {

    public BasePage_US04_manal(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="login")
    public WebElement username_input;

    @FindBy(id="password")
    public WebElement password_input;

    @FindBy(xpath="//button[.='Log in']")
    public WebElement login_Btn;

    @FindBy(xpath="li[@sty/lle='display: block;']/a[@data-action-id='136']/span")

    public WebElement calendar_Btn;

@FindBy(css="a[class='fc-time-grid-event fc-v-event fc-event fc-start fc-end fc-draggable fc-resizable o_calendar_color_6 fc-short']")
public WebElement timeBox;

@FindBy(xpath="input[@name='name']")
public WebElement event_input;

@FindBy(css="button[class='btn btn-sm btn-primary']")
public WebElement create_Btn;
    @FindBy(css="a[class='fc-time-grid-event fc-v-event fc-event fc-start fc-end fc-draggable fc-resizable o_calendar_color_6 fc-short']")
    public WebElement created_event;
@FindBy(css="div[class='o_group']")
public WebElement event_details;


    public void login(String username, String password){
        username_input.sendKeys(username);
        password_input.sendKeys(password);
        login_Btn.click();


    }

}
