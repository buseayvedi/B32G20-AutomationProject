package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage_US01_Buse {

    public BasePage_US01_Buse(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div.navbar-collapse.collapse>ul>li")
    public List<WebElement> allHeaderPages;

    @FindBy(css = "ul#menu_more>li")
    public List<WebElement> moreHeaderPages;

    @FindBy(css = "li.o_user_menu")
    public WebElement accountName;

    @FindBy(css = "i.fa.fa-comments")
    public WebElement chatBtn;

    @FindBy(css = "li.o_mail_navbar_item.o_no_notification")
    public WebElement notificationBtn;

    @FindBy(xpath = "(//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//li)[1]")
    public WebElement discussBtn;

    @FindBy(xpath = "(//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//li)[2]")
    public WebElement calendarBtn;

    @FindBy(xpath = "(//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//li)[3]")
    public WebElement notesBtn;

    @FindBy(xpath = "(//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//li)[4]")
    public WebElement contactsBtn;

    @FindBy(xpath = "(//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//li)[5]")
    public WebElement crmBtn;

    @FindBy(xpath = "(//ul[@class='nav navbar-nav navbar-left oe_application_menu_placeholder']//li)[6]")
    public WebElement salesBtn;

    @FindBy(id = "login")
    public WebElement usernameInputBox;

    @FindBy(id = "password")
    public WebElement passwordInputBox;



















}
