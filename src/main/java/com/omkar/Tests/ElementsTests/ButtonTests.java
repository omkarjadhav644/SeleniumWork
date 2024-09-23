package com.omkar.Tests.ElementsTests;

import com.omkar.Factory.PageIntantiateFactory;
import com.omkar.Pages.Elements.ButtonPage;
import com.omkar.Tests.BaseTest;
import org.testng.annotations.Test;

public class ButtonTests extends BaseTest {

    @Test(description = "Test to click, double click and right click buttons")
    public void allButtonSelect() {
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        ButtonPage buttonPage = PageIntantiateFactory.getInstance(ButtonPage.class);
        buttonPage.clickSubmit();

    }
}
