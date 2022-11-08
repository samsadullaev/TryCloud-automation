package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    public Login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement inputUsername;


    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//div[@id='submit-wrapper']/input")
    public WebElement loginBtn;

    @FindBy(xpath = "//ul[@id='appmenu']/li[2]/a")
    public WebElement fileLogo;

    @FindBy(xpath = "//tr[@data-id='30074']/td/a/span[3]/a[2]")
    public WebElement action_icon;

    @FindBy(xpath = "//a[@class='menuitem action action-favorite permanent']")
    public WebElement favorite;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement favorites_file;
}
