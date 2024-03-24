package com.twiliaerp.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DocumentationPage_Buse extends BasePage_US01_Buse{

    @FindBy(css = "h1.text-white")
    public WebElement odooDocMessage;

    @FindBy(css = "div.col-lg-6>h2>a")
    public List<WebElement> mainTopicsOdooDocPage;

    public List<String> getMainTopicsOfOdooDocPage(){
        List<String> list = new ArrayList<>();
        for (WebElement each : mainTopicsOdooDocPage){
            list.add(each.getText());
        }
        return list;
    }

}
