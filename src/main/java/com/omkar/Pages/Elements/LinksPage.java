package com.omkar.Pages.Elements;

import com.omkar.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

public class LinksPage extends BasePage {
    /**
     * Instantiates a new base page.
     *
     * @param driver the driver
     */
    public LinksPage(WebDriver driver) {
        super(driver);
    }

    WebElement HomeLink= driver.findElement(By.xpath("//*[text()='Home']"));

    WebElement HomewPWPULink = driver.findElement(By.xpath("//*[text()='HomewPWPU']"));


    public void verifyHomeLinkNavigation(){
        String currentHandle = driver.getWindowHandle();
        HomeLink.click();
        Set<String> windowHandles= new HashSet<>();
        windowHandles = driver.getWindowHandles();

        for (String handle: windowHandles){
            if(handle!=currentHandle){
                driver.switchTo().window(handle);
            }
        }
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.tutorialspoint.com/index.htm");
    }

    public void verifyHomewPWPULinkLinkNavigation(){
        String currentHandle = driver.getWindowHandle();
        HomewPWPULink.click();

        Set<String> windowHandles= new HashSet<>();
        windowHandles = driver.getWindowHandles();
        for (String handle: windowHandles){
            if(!handle.equals(currentHandle)){
                driver.switchTo().window(handle);

            }
        }
        Assert.assertEquals(driver.getCurrentUrl(),"about:blank");

        driver.switchTo().window(currentHandle);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.tutorialspoint.com/selenium/practice/links.php");

    }

    public LinksPage StatusLinkClick(String linkText){
        driver.findElement(By.xpath(linkXpath(linkText))).click();
        return this;
    }
    public void verifyLinkAndSuccessMessage(String statuscode,String status){
        String success_message= "Link has responded with staus "+statuscode+" and status text "+status;
        Assert.assertEquals(success_message,success_messageOnUI(statuscode,status));
    }

    public String linkXpath(String linkText){
        return "//a[text()='"+linkText+"']";
    }
    public String success_messageOnUI(String statuscode,String status){

        String message=driver.findElement(By.xpath("//*[@class='col-md-8 col-lg-8 col-xl-8']/div[@style='display: block;']")).getText();
        return message;
    }
}
