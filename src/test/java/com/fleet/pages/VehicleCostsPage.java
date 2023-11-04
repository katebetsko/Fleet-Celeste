package com.fleet.pages;

import com.fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleCostsPage {

    public VehicleCostsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//div[@class='btn-group dropdown'])[1]//input[@type='checkbox']")
    public WebElement firstCheckbox;
       //(//tr[@class='grid-header-row'])[1]//input[@type='checkbox']

    @FindBy (css =".grid-header-cell__link")
    public List<WebElement> allColumns;






}
