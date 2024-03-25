package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage_B32G20_140_Sevgi {

    public InventoryPage_B32G20_140_Sevgi() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//a[@href='/web#menu_id=378&action=521']" )
    public WebElement productsLink;

    @FindBy(xpath ="//span[text()[normalize-space()='Inventory']]" )
    public WebElement inventoryLink;

    @FindBy(xpath = "//button[@accessKey='c']")
    public WebElement createButton;


    @FindBy(xpath = "(//input[contains(@id,'o_field_input')])[2]")
    public WebElement nameBar;

    @FindBy(xpath = "//button[text()[normalize-space()='Save']]")
    public WebElement saveButton;

    @FindBy(xpath = "//button[text()[normalize-space()='Edit']]")
    public WebElement editButton;

    @FindBy(xpath = "//span[@name='name']")
    public WebElement productName;

    @FindBy(xpath = "//span[contains(text(),'test')]")
    public WebElement testProduct;

    @FindBy (xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

}

