package com.omkar.Pages.Elements;

import com.omkar.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ButtonPage extends BasePage {
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public ButtonPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath ="//button[@class='btn btn-primary']")
    private WebElement ClickMe;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    private WebElement RightClickMe;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElement DoubleClickMe;



    public void clickSubmit(){
        ClickMe.click();

        Actions action = new Actions(driver);
        action.doubleClick(DoubleClickMe).perform();

        String ClickMeText = driver.findElement(By.xpath("//*[@id='welcomeDiv']")).getText();
        String DoubleClickMeText = driver.findElement(By.xpath("//*[@id='doublec']")).getText();


        Assert.assertEquals(ClickMeText,"You have done a dynamic click");
        Assert.assertEquals(DoubleClickMeText,"You have Double clicked");

        action.contextClick(RightClickMe).perform();

    }

}
