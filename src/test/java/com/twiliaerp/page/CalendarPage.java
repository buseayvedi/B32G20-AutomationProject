package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {
    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="(//td[@class='fc-widget-content'])[5]")
    public WebElement timeBox;

    @FindBy(xpath="input[@name='name']")
    public WebElement event_input;

    @FindBy(css="button[class='btn btn-sm btn-primary']")
    public WebElement create_Btn;
    @FindBy(css="a[class='fc-time-grid-event fc-v-event fc-event fc-start fc-end fc-draggable fc-resizable o_calendar_color_6 fc-short']")
    public WebElement created_event;
    @FindBy(css="div[class='o_group']")
    public WebElement event_details;
    @FindBy(xpath = "//div[@id='modal_11']/div/div")
    public WebElement event_input_page;








}
