package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageKB {
    public DashboardPageKB(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[normalize-space(text())='Fleet'])[1]")
    public WebElement fleetOption;

    @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement vehicleContractsOption;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement errorMessage;


}
