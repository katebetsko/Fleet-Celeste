package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US06_VehiclePage {

    public US06_VehiclePage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetDropdown;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehiclesOption;

    @FindBy(xpath ="(//div[@class='dropdown'])[1]")
    public WebElement threeDots;

    @FindBy(xpath ="(//i[@class='fa-trash-o hide-text'])[1]")
    public WebElement deleteIcon;

    @FindBy(xpath ="(//i[@class='fa-pencil-square-o hide-text'])[1]")
    public WebElement editIcon;

    @FindBy(xpath = "(//i[@class='fa-eye hide-text'])[1]")
    public WebElement viewIcon;

}
