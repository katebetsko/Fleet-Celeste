package com.fleet.step_definitions;

import com.fleet.pages.AccountsPage;
import com.fleet.pages.LoginPage;
import com.fleet.utilities.BrowserUtils;
import com.fleet.utilities.Driver;
import com.fleet.utilities.RandomUserGenerator;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.ls.LSException;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerInfoFilters {
    LoginPage loginPage = new LoginPage();
    AccountsPage accountsPage = new AccountsPage();


    @Given("the user is in the accounts page")
    public void the_user_is_in_the_accounts_page() {
//        loginPage.userName.sendKeys(RandomUserGenerator.getUserName("storemanager"));
//        loginPage.password.sendKeys(RandomUserGenerator.getPassword());
//        loginPage.submit.click();
        BrowserUtils.sleep(2);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(loginPage.customersButton).perform();
        loginPage.accountsButton.click();


    }

    @Then("user should see these eight filter items on the Accounts page")
    public void user_should_see_filter_items_on_the_accounts_page(List<String> expectedColumns) {
        BrowserUtils.sleep(2);

        List<String> nonExistenColumnNamesList = new ArrayList<>();
        List<String> actualColumnNames = BrowserUtils.getElementsText(accountsPage.tableHeaders);
        Boolean contains;




        for (String expectedColumn : expectedColumns){
            contains=false;
             for (String actualColumnName : actualColumnNames){
                 if(expectedColumn.equalsIgnoreCase(actualColumnName)){
                   contains=true;
                   break;
               }
            }
            if(contains==false){
                nonExistenColumnNamesList.add(expectedColumn);
            }
        }

        if(nonExistenColumnNamesList.isEmpty()==false){
            System.out.print("The following columns do not exist " +nonExistenColumnNamesList );
            Assert.assertTrue(false);
        }




    }


}
