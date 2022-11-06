package com.TryCloud.pages;


import com.TryCloud.utilities.ConfigurationReader;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement inputUsername;


    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;


    @FindBy (xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement message;

    public void setUpURL(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginBtn.click();

    }

}
