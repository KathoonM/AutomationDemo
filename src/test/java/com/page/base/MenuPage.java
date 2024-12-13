package com.page.base;

public class MenuPage extends CognitestPageHook {
    // Locator for username field
    protected String usernameField = "//input[@name = 'username']";

    // Locator for password field
    protected String passwordField = "//input[@name = 'password']";

    // Locator for login button
    protected String loginButton = "//button[@type= 'submit']";


    public MenuPage navigateToLoginPage() {
        getPage().navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        return this;
    }

    public MenuPage enterUsername(String username) {
        typeWithType("//input[@name = 'username']", "Admin", "Username");
        return this;
    }

    public MenuPage enterPassword(String password) {
        typeWithType("//input[@name = 'password']", "admin123", "Password");
        return this;
    }

    public MenuPage clickOnLoginButton() {
        click("//button[@type= 'submit']", "Login");
        return this;
    }

    protected String adminModuleLocator = "(//span[.= 'Admin'])[1]";
    protected String qualificationsTabLocator = "//span[.='Qualifications ']";
    protected String skillTabLocator = "//a[.='Skills']";
    protected String addSkillButtonLocator = "(//button[@type = 'button'])[4]";
    protected String skillNameFieldLocator = "(//input[@class = 'oxd-input oxd-input--active'])[2]";
    protected String skillDescriptionFieldLocator = "//textarea[@placeholder = 'Type description here']";
    protected String saveButtonLocator = "//button[@type = 'submit']";

    public MenuPage clickOnAdminModule() {
        click("(//span[.= 'Admin'])[1]", "Admin");
        return this;
    }

    public MenuPage clickOnQualificationsTab() {
        click("//span[.='Qualifications ']", "Qualifications");
        return this;
    }

    public MenuPage clickOnSkillTab() {
        click("//a[.='Skills']", "Skills");
        return this;
    }

    public MenuPage clickOnAddSkillButton() {
        click("(//button[@type = 'button'])[4]", "+ Add");
        return this;
    }

    public MenuPage enterSkillName(String skillName) {
        typeWithType("(//input[@class = 'oxd-input oxd-input--active'])[2]", "New skill addition here", "Name");
        return this;
    }

    public MenuPage enterSkillDescription(String skillDescription) {
        typeWithType("//textarea[@placeholder = 'Type description here']", "Adding new skill", "Description");
        return this;
    }

    public MenuPage clickOnSaveButton() {
        click("//button[@type = 'submit']", "Save");
        return this;
    }

    protected String editIcon = "(//button[@type = 'button'])[6]";
    protected String locateSkillAndSelectDeleteOption = "(//button[@type = 'button'])[5]";
    protected String confirmDeletion = "(//button[@class = 'oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin'])";
    // Locator for Name Field
    protected String nameField = "(//input[@class = 'oxd-input oxd-input--active'])[2]";

    // Locator for Description Field
    protected String descriptionField = "//textarea[@placeholder = 'Type description here']";

    // Locator for Save Button
    protected String saveButton = "//button[@type = 'submit']";


    public MenuPage clickEditIcon() {
        click("(//button[@type = 'button'])[6]", "Edit Icon");
        return this;
    }

    public MenuPage modifyNameField(String newName) {
        typeWithType("(//input[@class = 'oxd-input oxd-input--active'])[2]", "Content creation", "Name");
        return this;
    }

    public MenuPage modifyDescriptionField(String newDescription) {
        typeWithType("//textarea[@placeholder = 'Type description here']", "Advanced Java programming including Spring Boot", "Description");
        return this;
    }

    public MenuPage locateSkillAndSelectDeleteOption() {
        click("(//button[@type = 'button'])[5]", "Delete icon");
        return this;
    }

    public MenuPage confirmDeletion() {
        // Locator for confirm deletion button
        click("(//button[@class = 'oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin'])", "Confirm Deletion");
        return this;

    }
}

