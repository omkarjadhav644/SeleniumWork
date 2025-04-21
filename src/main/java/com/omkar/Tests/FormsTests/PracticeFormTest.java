package com.omkar.Tests.FormsTests;

import com.omkar.Factory.PageIntantiateFactory;
import com.omkar.Pages.Forms.PracticeFormPage;
import com.omkar.Tests.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {


    @Test
    public void formFilling() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        PracticeFormPage practiceFormPage = PageIntantiateFactory.getInstance(PracticeFormPage.class);

        practiceFormPage.setName("Omkar");
        practiceFormPage.setEmail("Omkar@gmail.com");
        practiceFormPage.setGender("Male");
        practiceFormPage.setMobileNumber("1234567890");
        practiceFormPage.setSubject("Practice Form test");
        practiceFormPage.setHobby("Sports");

        Thread.sleep(40000);


    }

//    @AfterTest
//    public void tearup(){
//        driver.close();
//    }
}
