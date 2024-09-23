package com.omkar.Pages.Elements;

import com.omkar.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RadioButtonPage extends BasePage {
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }


    private WebElement radioButton;

    public void selectAndVerifyRadioBox(String value){
        String xpath="//div[@class='form-check form-check-inline']/*[text()='"+value+"']/preceding::input[1]";
        radioButton = driver.findElement(By.xpath(xpath));
        radioButton.click();
        WebElement assertMessage = driver.findElement(By.xpath(xpath + "/parent::div/following::div[1]/b"));
        Assert.assertEquals(assertMessage.getText(), value);
    }

    public void verifyDisabledCheckBox(String value){
        String xpath="//div[@class='form-check form-check-inline']/*[text()='"+value+"']/preceding::input[1]";
        radioButton = driver.findElement(By.xpath(xpath));
        Assert.assertFalse(radioButton.isEnabled(),"The Checkbox is not disabled");
    }


}
