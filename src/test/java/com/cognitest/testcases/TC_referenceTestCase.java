package com.cognitest.testcases;

import java.util.List;

import com.config.ConfigurationManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.data.dynamic.FakerDataFactory;
import com.listener.TestListener;
import com.page.base.MenuPage;
import com.page.base.CognitestPageHook;

@Listeners(TestListener.class)
public class TC_referenceTestCase extends CognitestPageHook {

    @BeforeTest(groups = {"Tier1Admin", "Tier1User", "Tier2Admin", "Tier2User"})
    public void setReportValues() {
        testcaseName = "TC_Login_Test";
        testDescription = "Successful login with valid credentials redirects to the dashboard.";
        authors = "YourName";
        category = "Login";
    }

    @Test(priority = 1, groups = {"Tier1Admin", "Tier1User", "Tier2Admin", "Tier2User"})
    public void successfulLogin() {
        startTestCase();
        setNode();

        // Steps for the login test case
        new MenuPage()
                .navigateToLoginPage()  // Method to navigate to login page
                .enterUsername("Admin")  // Method to enter username
                .enterPassword("admin123")  // Method to enter password
                .clickOnLoginButton()// Method to click login
                .clickOnAdminModule() // Assuming this method exists
                .clickOnQualificationsTab()
                .clickOnSkillTab()// Assuming this method exists
                .clickOnAddSkillButton() // Assuming this method exists
                .enterSkillName("New skill addition here") // Assuming this method exists
                .enterSkillDescription("Adding New skill") // Assuming this method exists
                .clickOnSaveButton()
                .clickEditIcon()
                .modifyNameField("Name of the skill")
                .modifyDescriptionField("Advanced Java programming including Spring Boot")
                .clickOnSaveButton()
                .locateSkillAndSelectDeleteOption() // Replace with actual method call to navigate// Replace with actual method call
                .confirmDeletion();
        // Method to verify
    }
}