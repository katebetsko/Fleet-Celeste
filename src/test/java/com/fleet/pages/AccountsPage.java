package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountsPage {

    public AccountsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//th[.='Account name']")
    public static WebElement accountName;

    @FindBy(xpath = "//th[.='Contact name']")
    public static WebElement contactName;

    @FindBy(xpath = "//th[.='Contact email']")
    public static WebElement contactEmail;

    @FindBy(xpath = "//th[.='Contact phone']")
    public static WebElement contactPhone;

    @FindBy(xpath = "//th[.='Created At']")
    public static WebElement createdAt;

    @FindBy(xpath = "//th[.='Updated At']")
    public static WebElement updatedAt;











//    #Expected filter names:  Account Name, Contact Name, Contact Email,
//# Contact Phone, Owner,  Business Unit, Created At, Updated At
}
