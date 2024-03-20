package com.twiliaerp.page;

import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import com.twiliaerp.utilities.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage_US01_Buse {

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

    @FindBy(xpath = "")
    public WebElement discussBtn;

    @FindBy(xpath = "")
    public WebElement calendarBtn;

    @FindBy(xpath = "")
    public WebElement notesBtn;

    @FindBy(xpath = "(")
    public WebElement contactsBtn;

    @FindBy(xpath = "")
    public WebElement crmBtn;

    @FindBy(css = "a[href='/web#menu_id=445&action=']")
    public WebElement salesBtn;

    public void loginWithExcelFileCredentials(String sheetName, int rowNum){
        ExcelUtil excelUtil = new ExcelUtil("src/testData/loginCredentials.xlsx",sheetName);

        Driver.getDriver().get(ConfigurationReader.getProperty("login.page.url"));
        Driver.getDriver().findElement(By.id("login")).sendKeys(excelUtil.getCellData(rowNum,1));
        Driver.getDriver().findElement(By.id("password")).sendKeys(excelUtil.getCellData(rowNum,2));
        Driver.getDriver().findElement(By.cssSelector("button[type='submit']")).click();


    }



















}
