package com.omkar.Context;

import java.util.ResourceBundle;

public class Constants {



    /** The Constant WORKING_DIRECTORY. */
    public static final String WORKING_DIRECTORY = System.getProperty("user.dir");

    /** The Constant CHROME_DRIVER_PATH. */
    public final static String CHROME_DRIVER_PATH = WORKING_DIRECTORY + "/src/main/resources/chromedriver_"+ ResourceBundle.getBundle("Selenium").getString("chrome.version");
}
