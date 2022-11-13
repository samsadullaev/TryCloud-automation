package com.TryCloud.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class BrowserUtils {
    //methods are static so we can call through class name and we dont want to create an object
    public static void sleep(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e){
            e.printStackTrace();

        }



        }
    public static void verifyTitle( String expectedTitle){
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }
    public static void waitForInvisibilityOf(WebElement element){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);

        wait.until(ExpectedConditions.invisibilityOf(element));

    }

    /**
     * This method will accept dropdwn as a WebElement
     * and return all the options' text in a List of String
     * @return List<String>
     */
    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){
        Select select = new Select(dropdownElement);

        List<WebElement> optionsElement = select.getOptions();
        List<String> optionsString = new ArrayList<>();

        for (WebElement each : optionsElement) {
            optionsString.add(each.getText());
        }

        return optionsString;
    }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue){

        for(WebElement each : radioButtons){
            if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }

    }

    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
