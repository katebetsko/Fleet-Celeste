package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountsPage_SH extends BasePage {

    public AccountsPage_SH(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//th[.='Account name']")
    public WebElement accountName;

    @FindBy(xpath = "//th[.='Contact name']")
    public WebElement contactName;

    @FindBy(xpath = "//th[.='Contact email']")
    public WebElement contactEmail;

    @FindBy(xpath = "//th[.='Contact phone']")
    public WebElement contactPhone;

    @FindBy(xpath = "//th[.='Created At']")
    public WebElement createdAt;




    @FindBy(xpath = "//th[.='Updated At']")
    public WebElement updatedAt;

    @FindBy(xpath = "//th[.='Owner']")
    public WebElement owner;


    @FindBy(css = ".grid-header-cell__label")
    public List<WebElement> tableHeaders;

    @FindBy(css = "div[class=\"filter-item oro-drop\"]")
    public List<WebElement> filterDropdowns;

    @FindBy(css = "a[title=\"Filters\"]")

    public WebElement filtersButton;




















//    #Expected filter names:  Account Name, Contact Name, Contact Email,
//# Contact Phone, Owner,  Business Unit, Created At, Updated At
}
