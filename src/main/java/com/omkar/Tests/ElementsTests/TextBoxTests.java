package com.omkar.Tests.ElementsTests;

import com.omkar.Factory.PageIntantiateFactory;
import com.omkar.Pages.Elements.TextBoxPage;
import com.omkar.Tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest {


    @Test(description = "In this test we will be filling the form for give URL")
   public void formFillingTest() throws InterruptedException {

        String url="https://www.tutorialspoint.com/selenium/practice/text-box.php";
        driver.get(url);
        TextBoxPage tpage= PageIntantiateFactory.getInstance(TextBoxPage.class);
        tpage.fullName("ABC").email("garbage@gmail.com").fullAddress("Kiran Songir pashan-sus road")
                .password("Pass@123").clickSubmit();
        String successUrl =  driver.getCurrentUrl();
        Assert.assertEquals(successUrl,url+"#");
    }
}
