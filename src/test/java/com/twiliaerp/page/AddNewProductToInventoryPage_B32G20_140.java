package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewProductToInventoryPage_B32G20_140 extends BasePage_US01_Buse  {

    public AddNewProductToInventoryPage_B32G20_140(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "login")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath="//button[.='Log in']")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[@href='/web#menu_id=347&action=']")
    public WebElement inventoryHeader;

    @FindBy(xpath = "//a[@href='/web#menu_id=378&action=521']")
    public WebElement productBtn;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createBtn;

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editBtn;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveBtn;
    @FindBy(xpath = "//div[@class='oe_kanban_details']")
    public WebElement getProductBtn;



    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;


}
