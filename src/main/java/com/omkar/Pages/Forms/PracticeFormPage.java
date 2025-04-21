package com.omkar.Pages.Forms;

import com.omkar.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends BasePage {
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    String xPathfInput = "//form[@id=\"practiceForm\"]//descendant::label[@for='%s']//parent::div//descendant::input";

    public void setName(String inputName){
        String xpath = String.format(xPathfInput,"name");
        driver.findElement(By.xpath(xpath)).sendKeys(inputName);
    }

    public void setEmail(String inputEmail){
        String xpath = String.format(xPathfInput,"email");
        driver.findElement(By.xpath(xpath)).sendKeys(inputEmail);
    }

    public void setGender(String inputGender){
        String xpath = xPathfInput+"//following-sibling::label[text()='%s']//preceding-sibling::input";
        xpath = String.format(xpath, "gender", inputGender);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void setMobileNumber(String mobileNumber){
        String xpath = String.format(xPathfInput,"mobile");
        driver.findElement(By.xpath(xpath)).sendKeys(mobileNumber);
    }

    public void setSubject(String subject){
        String xpath = String.format(xPathfInput,"subjects");
        driver.findElement(By.xpath(xpath)).sendKeys(subject);
    }

    public void setHobby(String hobby){
        String xpath = "//form[@id='practiceForm']//descendant::label[@for='hobbies']//parent::div//descendant::label[text()='%s']//preceding-sibling::input";
        xpath= String.format(xpath, hobby);
        driver.findElement(By.xpath(xpath)).click();
    }

    public void selectStateAndCity(String state,String city){

    }

}
