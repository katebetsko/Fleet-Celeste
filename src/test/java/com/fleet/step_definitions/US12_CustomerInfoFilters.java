package com.fleet.step_definitions;

import com.fleet.pages.AccountsPage_SH;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US12_CustomerInfoFilters {
    LoginPage loginPage = new LoginPage();
    AccountsPage_SH accountsPage = new AccountsPage_SH();


    @Given("the user is in the accounts page SH")
    public void the_user_is_in_the_accounts_page_SH() {
        BrowserUtils.sleep(2);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(loginPage.customersButton).perform();
        loginPage.accountsButton.click();


    }

    @Then("user should see these eight filter items on the Accounts page SH")
    public void user_should_see_filter_items_on_the_accounts_page_SH(List<String> expectedColumns) {

        List<String> nonExistenFiltersList = new ArrayList<>();
        List<String> actualColumnNames = BrowserUtils.getElementsText(accountsPage.filterDropdowns);
        Boolean contains;

        for (String expectedColumn : expectedColumns){
            contains=false;
             for (String actualColumnName : actualColumnNames){
                 if(expectedColumn.equalsIgnoreCase(actualColumnName.replace(": All",""))){//over here we take out the ": All" text because it is not important for our test case
                   contains=true;
                   break;
               }
            }
            if(contains==false){
                nonExistenFiltersList.add(expectedColumn);
            }
        }

        if(nonExistenFiltersList.isEmpty()==false){
            Assert.assertTrue("The following columns do not exist "
                    +nonExistenFiltersList,false);
        }




    }


    @When("the user clicks on the filters icon")
    public void theUserClicksOnTheFiltersIcon() {

        accountsPage.filtersButton.click();
    }
}
