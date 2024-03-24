package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage_B32G20_140 {

    public InventoryPage_B32G20_140() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath ="//span[text()[normalize-space()='Products']]" )
    public WebElement productsLink;

    @FindBy(xpath ="//span[text()[normalize-space()='Inventory']]" )
    public WebElement inventoryLink;

    @FindBy(xpath = "//button[@accessKey='c']")
    public WebElement createButton;

    @FindBy(xpath = "/input[@placeholder='Product Name']")
    public WebElement nameBar;


    @FindBy(xpath = "//button[text()[normalize-space()='Save']]")
    public WebElement saveButton;

    @FindBy(xpath = "//button[text()[normalize-space()='Edit']]")
    public WebElement editButton;

    @FindBy(xpath = "//span[@name='name']")
    public WebElement productName;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

   @FindBy(xpath = "//div[@class='oe_kanban_global_click o_kanban_record']")
   public WebElement testProduct;


}

