package com.omkar.Tests.ElementsTests;

import com.omkar.Factory.PageIntantiateFactory;
import com.omkar.Pages.Elements.CheckboxPage;
import com.omkar.Tests.BaseTest;
import org.testng.annotations.Test;

public class CheckboxTests extends BaseTest {

    @Test(description = "Test to handle checkboxes")
    public void checkBoxHandling(){

        driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        CheckboxPage checkboxPage = PageIntantiateFactory.getInstance(CheckboxPage.class);
        checkboxPage.expandCheckboxes("Main Level 1 ");
        checkboxPage.checkOrUncheckCheckbox("Main Level 1 ");

        checkboxPage.expandCheckboxes("Sub Level 1 ");
        checkboxPage.expandCheckboxes("Sub Level 2");

        //Verify
        checkboxPage.verifyCheck("Main Level 1 ",true);
        checkboxPage.verifyCheck("Sub Level 1 ",true);
        checkboxPage.verifyCheck("Sub Level 2",true);

    }
}
