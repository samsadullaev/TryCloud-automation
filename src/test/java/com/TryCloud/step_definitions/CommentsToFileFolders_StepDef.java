package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.FilePage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class CommentsToFileFolders_StepDef {
    FilePage filePage = new FilePage();

    BasePage basePage = new BasePage();
    String expectedFavoriteThreeDat;
    LoginPage loginPage = new LoginPage();
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        LoginPage.setUpURL();
        LoginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        basePage.file.click();
    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Failed Title", expectedTitle,actualTitle);
    }
    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
        int num = 4;// we pik num random
        filePage.threeDot.get(num - 1).click(); //index num -> List start from 0
        expectedFavoriteThreeDat = filePage.allRowOfTheTable.get(num - 1).getAttribute("data-file");

    }
    @And("the user choose the {string} option")
    public void theUserChooseTheOption(String string) {
        filePage.detailsBtn.click();
    }
    @When("user write a comment {string} inside the input box")
    public void user_write_a_comment_inside_the_input_box(String message) {

        filePage.commentsBtn.click();
        filePage.inputCommentBox.sendKeys(message);

    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {

        filePage.submitBtn.click();
    }
    @Then("Verify the comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section() {
        String expectedPostText = "message";
        String actualPostText = filePage.postMessageText.getText();

        Assert.assertTrue(actualPostText.contains(expectedPostText));
    }
}
