package com.omkar.Context;

import org.openqa.selenium.WebDriver;

public class WebDriverContext {

    /** The driverinstance. */
    private static InheritableThreadLocal<WebDriver> driverinstance = new InheritableThreadLocal<>();

    /**
     * Gets the driver.
     *
     * @return the driver
     */
    public static WebDriver getDriver() {
        if (driverinstance.get() == null)
            throw new IllegalStateException(
                    "WebDriver has not been set, Please set WebDriver instance by WebDriverContext.setDriver...");
        else
            return driverinstance.get();
    }

    /**
     * Sets the driver.
     *
     * @param driver the new driver
     */
    public static void setDriver(WebDriver driver) {
        driverinstance.set(driver);
    }


}