package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import io.cucumber.java.bs.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class RepairsPage_B32G20_141_Buse extends BasePage_US01_Buse{

    public RepairsPage_B32G20_141_Buse(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "th.o_column_sortable")
    public List<WebElement> listTitles;

    @FindBy(css = "input.o_searchview_input")
    public WebElement searchBox;

    @FindBy(css = "tr.o_data_row>td.o_data_cell")
    public List<WebElement> searchResultElements;

    @FindBy(xpath = "//th[text()='Repair Reference']")
    public WebElement repairReferenceBtn;

    public List<String> titlesList(){
        List<String> list = new ArrayList<>();
        for (WebElement each : listTitles){
            list.add(each.getText());
        }
        return list;
    }

    public List<String> searchResultElements(){
        List<String> list = new ArrayList<>();
        for (WebElement each : searchResultElements){
            list.add(each.getText());
        }
        return list;
    }

}
