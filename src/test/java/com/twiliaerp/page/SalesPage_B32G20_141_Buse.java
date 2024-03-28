package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SalesPage_B32G20_141_Buse extends BasePage_US01_Buse {

    public SalesPage_B32G20_141_Buse(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input.o_searchview_input")
    public WebElement searchBox;

    @FindBy(css = "a[href='/web#menu_id=471&action=623']")
    public WebElement quotationsBtn;

    @FindBy(xpath = "//th[text()='Quotation Number']")
    public WebElement quotationNumberTitle;

    @FindBy(css = "th.o_column_sortable")
    public List<WebElement> listTitles_QuotationsPage;

    @FindBy(css = "td.o_data_cell")
    public List<WebElement> searchResultElements;

    public void clickSearchBox(){
        searchBox.click();
    }

    public void clickSalesModule(){
        salesBtn.click();
        wait.until(ExpectedConditions.visibilityOf(quotationNumberTitle));

    }

    public void searchProductInSearchBox(String str){

        searchBox.sendKeys(str + Keys.ENTER);

    }




}
