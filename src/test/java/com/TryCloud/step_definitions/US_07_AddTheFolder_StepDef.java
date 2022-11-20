package com.TryCloud.step_definitions;
import com.TryCloud.pages.FilePage;
import com.TryCloud.utilities.BrowserUtils;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_07_AddTheFolder_StepDef {


    FilePage us7_page = new FilePage();
    //LocalTime myObj = LocalTime.now();
    //  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
    String folderName= "smth";



    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        BrowserUtils.waitFor(1);
        us7_page.addBtn.click();


    }

    @When("user click 'new folder'")
    public void user_click_new_folder() {
        us7_page.newFolderBtn.click();

    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {

        us7_page.inputFolder.sendKeys(folderName);

    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        //us7_page.inputFolder.sendKeys(folderName + Keys.ENTER);
        us7_page.arrowBtn.click();

    }

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        BrowserUtils.waitFor(1);
        boolean a = false;
        for (int i = 0; i < us7_page.folderNameList.size(); i++) {
            if (us7_page.folderNameList.get(i).getText().equals(folderName)) {
                a = true;
                newFolderIndex = i + 1;
                break;
            }
        }
        Assert.assertTrue(a);
    }
    @And("user choose a folder from the page")
    public void user_choose_a_folder_from_the_page() {
        WebElement chooseFolder = Driver.getDriver().findElement(By.xpath("//tr[@data-file='smth']"));
        chooseFolder.click();
                }

    @When("the user clicks  the add button")
    public void theUserClicksTheAddButton() {
        us7_page.addBtn.click();
    }


    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {
        String pathToFile= "C:/Users/chern/OneDrive/Desktop/test.txt";
       // us7_page.uploadFile.click();
        us7_page.inputFile.sendKeys(pathToFile);
    }


    String uploadedFile="test";
    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {

        Driver.getDriver().findElement(By.xpath("//tr[@data-file='test.txt']")).isDisplayed();
    }



    public int newFolderIndex;

    @And("delete uploaded file")
    public void deleteUploadedFile() {
        us7_page.fileBtn.click();
        WebElement newFolderCheckBox = Driver.getDriver().findElement(By.xpath("//tr[@data-file='smth']/td[@class='selection']"));
        newFolderCheckBox.click();
        us7_page.actionsBtn.click();
        BrowserUtils.waitFor(1);
        us7_page.deleteBtn.click();
        BrowserUtils.waitFor(1);
    }



}










