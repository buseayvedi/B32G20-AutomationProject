package com.twiliaerp.step_definitions;

import com.twiliaerp.page.InventoryPage_B32G20_140_Sevgi;
import com.twiliaerp.utilities.BrowserUtilities;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProduct_B32G20_140_Sevgi_StepDef {

    InventoryPage_B32G20_140_Sevgi inventoryPage = new InventoryPage_B32G20_140_Sevgi();



    @When("user clicks inventory link")
    public void user_clicks_inventory_link() {
        inventoryPage.inventoryLink.click();
    }
    @And("user clicks Products link")
    public void user_clicks_products_link() {
        BrowserUtilities.hover(inventoryPage.productsLink);
        inventoryPage.productsLink.click();

    }

    @And("user clicks Create button")
    public void user_clicks_create_button_on_top() {
        BrowserUtilities.hover(inventoryPage.createButton);
        inventoryPage.createButton.click();

    }
    @Then("user types {string} on the product name bar")
    public void userTypesOnTheProductNameBar(String string) {
        BrowserUtilities.hover(inventoryPage.nameBar);
        inventoryPage.nameBar.sendKeys(string);
    }
    @And("user clicks Save button")
    public void userClicksSaveButton() {
        inventoryPage.saveButton.click();
    }
    @Then("user click on Products link")
    public void userClickOnProductsLink() {
        inventoryPage.productsLink.click();
    }


    @Then("user click on Edit button")
    public void user_click_on_edit_button() {
        inventoryPage.editButton.click();
    }
    @Then("user click on Save button")
    public void user_click_on_save_button() {
        inventoryPage.saveButton.click();
    }



}
