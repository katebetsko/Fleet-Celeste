package com.fleet.step_definitions;

import com.fleet.pages.BasePage;
import com.fleet.pages.LoginPage;
import com.fleet.pages.VehicleCostsPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US13_VehicleCosts_StepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();




    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {

        Driver.getDriver().get("https://qa.transmuda.com/user/login");
    }

    @And("user go on the Vehicle Costs page at the Fleet module")
    public void userGoOnTheVehicleCostsPageAtTheFleetModule() {
        navigateToModule("Fleet", "Vehicle Costs");

    }

            @Then("user should be able to see following columns:")
            public void userShouldBeAbleToSeeFollowingColumns(List<String> expectedColumns) {

                List<String> actualColumns = new ArrayList<>();
                BrowserUtils.sleep(5);
                for (WebElement eachColumn : vehicleCostsPage.allColumns) {
                    if (eachColumn.getText().equalsIgnoreCase("TYPE") ||
                            eachColumn.getText().equalsIgnoreCase("TOTAL PRICE") ||
                            eachColumn.getText().equalsIgnoreCase("DATE"))

                        actualColumns.add(eachColumn.getText());
                }
                    System.out.println("expectedColumns = " + expectedColumns);
                    System.out.println("actualColumns = " + actualColumns);

                    Assert.assertTrue(actualColumns.containsAll(expectedColumns));

                    }

            @When("user login with a driver credentials")
            public void userLoginWithADriverCredentials() {
                loginPage.login("user1", "UserUser123");
                waitUntilLoaderScreenDisappear();
            }

            @When("user login with a sales manager credentials")
            public void userLoginWithASalesManagerCredentials() {
                loginPage.login("salesmanager101", "UserUser123");
                waitUntilLoaderScreenDisappear();
            }


            @When("user login with a store manager credentials")
            public void userLoginWithAStoreManagerCredentials() {
                loginPage.login("storemanager85", "UserUser123");
                waitUntilLoaderScreenDisappear();
            }

    @Then("user should be able click on the first checkbox to check all the vehicle costs")
    public void userShouldBeAbleClickOnTheFirstCheckboxToCheckAllTheVehicleCosts() {
        vehicleCostsPage.firstCheckbox.click();
        Assert.assertTrue(vehicleCostsPage.firstCheckbox.isDisplayed());
        BrowserUtils.sleep(5);


    }

    @Given("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String username, String password) {

        loginPage.login(username,password);
    }
}