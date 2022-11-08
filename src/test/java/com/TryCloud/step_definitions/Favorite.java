package com.TryCloud.step_definitions;

import com.TryCloud.pages.Login;
import com.TryCloud.utilities.ConfigurationReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.joda.time.Seconds;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class Favorite  {

    Login login = new Login();

    Actions action = new Actions(Driver.getDriver());

    Select select;



    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        login.inputUsername.sendKeys("user7");
        login.inputPassword.sendKeys("Userpass123");
        login.loginBtn.click();



    }
    @When("the user clicks the Files module")
    public void the_user_clicks_the_module() {

       login.fileLogo.click();



    }
    @When("the user clicks action-icon  from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {

        login.action_icon.click();
       // Thread.sleep(100000);
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) throws InterruptedException{

      if(!login.favorite.isSelected()) {
          login.favorite.click();
      }



        Thread.sleep(10000);


    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string)throws InterruptedException {

        login.favorites_file.click();
        Thread.sleep(10000);
    }
    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {

    }


}
