package com.fleet.step_definitions;

import com.fleet.pages.DashboardPageKB;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US4_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPageKB dashboardPage = new DashboardPageKB();

    @Given("the user is on the Transmuda login page -KB")
    public void the_user_is_on_the_transmuda_login_page_kb() {
        Driver.getDriver().get("https://qa.transmuda.com/user/login");
    }
    @When("user enters valid {string} and {string} -KB")
    public void user_enters_valid_username_and_password_kb(String username, String password) {
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password);
    }
    @When("user presses LOG IN button -KB")
    public void user_presses_log_in_button_kb() {
        loginPage.submit.click();
    }
    @When("user sees Dashboard page -KB")
    public void user_sees_dashboard_page_kb() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.fleetOption));
        String expectedTitle = "Dashboard";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @When("user hovers over Fleet option -KB")
    public void user_hovers_over_fleet_option_kb() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(dashboardPage.fleetOption).perform();
    }
    @When("user presses Vehicle contracts option under Fleet option -KB")
    public void user_presses_vehicle_contracts_option_under_fleet_option_kb() {
        BrowserUtils.sleep(2);
        dashboardPage.vehicleContractsOption.click();
    }
    @Then("user should see Vehicle contacts page -KB")
    public void user_should_see_vehicle_contacts_page_kb() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("All - Vehicle Contract - Entities - System - Car - Entities - System"));

        String expectedTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

        String expectedUrl = "https://qa.transmuda.com/entity/Extend_Entity_VehicleContract";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @Then("user sees “You do not have permission to perform this action.”	error message -KB")
    public void user_sees_you_do_not_have_permission_to_perform_this_action_error_message_kb() {
        Assert.assertTrue(dashboardPage.errorMessage.isDisplayed());
    }
}
