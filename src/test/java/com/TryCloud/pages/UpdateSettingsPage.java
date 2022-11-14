package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UpdateSettingsPage {

    public UpdateSettingsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id= "app-settings-header")
    public WebElement settings;

    @FindBy(xpath = "//div[@id='app-settings-content']//label")
    public List<WebElement> checkBoxfiles;
/*
    @FindBy(id= "files-setting-richworkspace")
    public WebElement settingsCheckbox1;

    @FindBy(id= "recommendations-setting-enabled")
    public WebElement settingsCheckboxes2;

    @FindBy(id= "files-setting-showhidden")
    public WebElement settingsCheckboxes3;


*/













}
