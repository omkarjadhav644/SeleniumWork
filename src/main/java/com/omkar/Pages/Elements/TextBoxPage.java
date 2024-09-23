package com.omkar.Pages.Elements;

import com.omkar.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {

    private WebElement FullName = driver.findElement(By.id("fullname"));

    @FindBy(id ="email")
    private WebElement Email;

    @FindBy(id ="address")
    private WebElement Address;

    @FindBy(id ="password")
    private WebElement Password;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement Button;


    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public TextBoxPage fullName(String key) {
        FullName.sendKeys(key);
        return this;
    }

    public TextBoxPage email(String key){
        Email.sendKeys(key);
        return this;
    }

    public TextBoxPage fullAddress(String key){
        Address.sendKeys(key);
        return this;
    }

    public TextBoxPage password(String key){
        Password.sendKeys(key);
        return this;
    }
    public void clickSubmit() throws InterruptedException {
        Button.submit();
    }
}
