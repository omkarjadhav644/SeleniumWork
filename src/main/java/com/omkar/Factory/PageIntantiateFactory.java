package com.omkar.Factory;

import com.omkar.Context.WebDriverContext;
import com.omkar.Pages.BasePage;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.InvocationTargetException;

public class PageIntantiateFactory {



public static <T extends BasePage> T getInstance(Class<T> type)  {

    try {
        return type.getConstructor(WebDriver.class).newInstance(WebDriverContext.getDriver());
    } catch (NoSuchMethodException  | InvocationTargetException |InstantiationException | IllegalAccessException e) {
        e.printStackTrace();
        return null;
    }
}
}
