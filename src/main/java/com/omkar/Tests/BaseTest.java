package com.omkar.Tests;

import com.omkar.Context.Constants;
import com.omkar.Context.WebDriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    /** The driver. */
    protected WebDriver driver;

    /**
     * Setup.
     */
    @BeforeClass
    protected void setup(){

        if(Boolean.parseBoolean(seleniumProperty("chrome.enable"))){
            System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);

            if(Boolean.parseBoolean(seleniumProperty("headless")))
            {
            ChromeOptions ops= new ChromeOptions();
            ops.addArguments("disable-infobars");
            ops.addArguments("--headless");
            driver=new ChromeDriver(ops);
            }
            else {
                driver=new ChromeDriver();
            }
            WebDriverContext.setDriver(driver);
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
        else if(Boolean.parseBoolean(seleniumProperty("firefox.enable"))){
            driver=new FirefoxDriver();
            WebDriverContext.setDriver(driver);
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    /**
     * Wrap up.
     */
    @AfterClass
    public void wrapUp() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    /**
     * Function will return the selenium property associated with provided key
     */
    public String seleniumProperty(String key){
        return ResourceBundle.getBundle("Selenium").getString(key);
    }

}
