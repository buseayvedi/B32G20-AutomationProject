package com.twiliaerp.step_definitions;

import com.twiliaerp.page.InventoryPage_B32G20_140;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProduct_B32G20_140_Sevgi_StepDef {

    InventoryPage_B32G20_140 inventoryPage = new InventoryPage_B32G20_140();



    @When("user clicks inventory button")
    public void user_clicks_inventory_button() {
        inventoryPage.inventoryLink.click();
    }
    @And("user clicks Products button on the left side")
    public void user_clicks_products_button_on_the_left_side() {
        inventoryPage.productsLink.click();
    }
    @And("user clicks Create button on top")
    public void user_clicks_create_button_on_top() {
        inventoryPage.createButton.click();
    }
    @Then("user types {string} on the product name bar")
    public void userTypesOnTheProductNameBar(String string) {
        inventoryPage.nameBar.clear();
        inventoryPage.nameBar.sendKeys(string);
    }
    @And("user clicks Save button")
    public void userClicksSaveButton() {
        inventoryPage.saveButton.click();
    }
    @Then("user click on Products button again")
    public void userClickOnProductsButtonAgain() {
        inventoryPage.productsLink.click();
    }
    @When("user types {string} on the search box")
    public void userTypesOnTheSearchBox(String string) {
        inventoryPage.searchBox.sendKeys(string);
    }
    @Then("user click on the product {string}")
    public void user_click_on_the_product(String string) {
        inventoryPage.testProduct.click();
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
