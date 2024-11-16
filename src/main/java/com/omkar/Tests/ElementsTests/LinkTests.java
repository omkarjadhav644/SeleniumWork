package com.omkar.Tests.ElementsTests;

import com.omkar.Factory.PageIntantiateFactory;
import com.omkar.Pages.Elements.LinksPage;
import com.omkar.Tests.BaseTest;
import org.testng.annotations.Test;

public class LinkTests extends BaseTest {

    @Test(description = "Test the navigation of link Home")
    public void HomeLinkTest(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        LinksPage linksPage= PageIntantiateFactory.getInstance(LinksPage.class);
        linksPage.verifyHomeLinkNavigation();
    }

    @Test(description = "Test the navigation of link HomewPWPULink")
    public void verifyHomewPWPULinkLinkNavigation(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        LinksPage linksPage= PageIntantiateFactory.getInstance(LinksPage.class);
        linksPage.verifyHomewPWPULinkLinkNavigation();

    }

    @Test(description = "Test the Status Codes and success message on UI")
    public void verifyAllStatusCodesLink() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        LinksPage linksPage= PageIntantiateFactory.getInstance(LinksPage.class);

        linksPage.StatusLinkClick("Created");
        linksPage.verifyLinkAndSuccessMessage("201","Created");

        linksPage.StatusLinkClick("No Content");
        linksPage.verifyLinkAndSuccessMessage("204","No Content");


    }

}
