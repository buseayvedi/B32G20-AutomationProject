package com.twiliaerp.page;

import com.twiliaerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    public void clickingDocumentationButton(String str){

        WebElement element = Driver.getDriver().findElement(By.xpath("//a[text()='" +str+ "']"));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();

    }

}
