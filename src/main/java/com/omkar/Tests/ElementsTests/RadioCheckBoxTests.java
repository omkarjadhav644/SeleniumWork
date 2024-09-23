package com.omkar.Tests.ElementsTests;

import com.omkar.Factory.PageIntantiateFactory;
import com.omkar.Pages.Elements.RadioButtonPage;
import com.omkar.Tests.BaseTest;
import org.testng.annotations.Test;

public class RadioCheckBoxTests extends BaseTest {

    @Test(description = "Test to select radio Button and verify th success message")
    public void radioButtonSelect() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
        RadioButtonPage radioButtonPage= PageIntantiateFactory.getInstance(RadioButtonPage.class);
        radioButtonPage.selectAndVerifyRadioBox("Yes");
        Thread.sleep(3000);
        radioButtonPage.selectAndVerifyRadioBox("Impressive");

    }

    @Test(description = "Test to check that the radio button is disabled")
    public void disabledRadioButtonVerify(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
        RadioButtonPage radioButtonPage= PageIntantiateFactory.getInstance(RadioButtonPage.class);
        radioButtonPage.verifyDisabledCheckBox("No (Disable)");

    }





}
