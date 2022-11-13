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
    public static WebElement inputUsername;


    @FindBy(id = "password")
    public static WebElement inputPassword;

    @FindBy(id = "submit-form")
    public static WebElement loginBtn;


    @FindBy (xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement message;

    public static void setUpURL(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    public static void login(String username, String password){
        inputUsername.sendKeys(ConfigurationReader.getProperty(username));
        inputPassword.sendKeys(ConfigurationReader.getProperty(password));
        loginBtn.click();
    }

}
