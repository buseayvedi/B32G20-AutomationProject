package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventInputPage {

    public EventInputPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="input[@name='name']")
    public WebElement event_input;

    @FindBy(css="button[class='btn btn-sm btn-primary']")
    public WebElement create_Btn;
    @FindBy(xpath = "//div[@class='modal-content']")
    public WebElement eventInputPage;



}
