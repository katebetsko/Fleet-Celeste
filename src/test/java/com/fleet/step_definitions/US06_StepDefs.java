package com.fleet.step_definitions;

import com.fleet.pages.LoginPage;
import com.fleet.pages.US06_VehiclePage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Credentials;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Map;

public class US06_StepDefs {

    LoginPage login = new LoginPage();

    US06_VehiclePage vehiclePage = new US06_VehiclePage();

    Actions action = new Actions(Driver.getDriver());
    @Given("User is already on the Login Page")
    public void user_is_already_on_the_login_page() {
        Driver.getDriver().get("https://qa.transmuda.com/user/login");

    }
    @Then("User Enters {string} and {string} Credentials for Store Manager")
    public void userEntersAndCredentialsForStoreManager(String username, String password) {
        login.login(username, password);
    }
    @When("User hovers over the Fleet menu")
    public void user_hovers_over_the_fleet_menu() {
        BrowserUtils.waitFor(2);
        action.moveToElement(vehiclePage.fleetDropdown).perform();


    }
    @When("User selects Vehicle page from the Fleet menu dropdown")
    public void user_selects_vehicle_page_from_the_fleet_menu_dropdown() {

        vehiclePage.vehiclesOption.click();
        BrowserUtils.waitFor(2);
    }
    @Given("User hovers over the ... dots and should be able to see “view, edit, delete” options")
    public void user_hovers_over_the_dots() {
        action.moveToElement(vehiclePage.threeDots).perform();

        BrowserUtils.waitFor(2);

        vehiclePage.deleteIcon.isDisplayed();
        vehiclePage.editIcon.isDisplayed();
        vehiclePage.viewIcon.isDisplayed();


    }





}
