package com.omkar.Pages.Elements;

import com.omkar.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckboxPage extends BasePage {
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    public String xPathForExpand(String expandSection) {
        return "//span[text()='"+expandSection+"']//parent::li/span[@class='plus']";
    }


    public String xPathForCheckbox(String checkBox) {
        return "//span[text()='"+checkBox+"']//parent::li/input";
    }


    public CheckboxPage expandCheckboxes(String expandSection) {

        WebElement expand = driver.findElement(By.xpath(xPathForExpand(expandSection)));
        expand.click();
        return this;
    }

    public CheckboxPage checkOrUncheckCheckbox(String checkBoxname) {

        WebElement checkOrUncheck = driver.findElement(By.xpath(xPathForCheckbox(checkBoxname)));
        if(!checkOrUncheck.isSelected()&&checkOrUncheck.isEnabled())
            checkOrUncheck.click();

        Assert.assertTrue(checkOrUncheck.isSelected(),"Checkbox not enabled");

        return this;
    }

    public void verifyCheck(String checkBoxname,boolean checked) {

        WebElement checkOrUncheck = driver.findElement(By.xpath(xPathForCheckbox(checkBoxname)));

        if(!checkOrUncheck.isSelected()&& checked==true)
            Assert.fail(checkBoxname+" is not Checked");

    }



}

