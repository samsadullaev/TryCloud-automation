package com.TryCloud.step_definitions;
import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class MainModules_Stp_Def {

    BasePage basePage = new BasePage();
    @When("the users  log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }

    @Then("Verify the user see the following modules")
    public void verify_the_user_see_the_following_modules(List<String> expectedMainModules) {
        List<String> actualModulesAsString = new ArrayList<>();

        for (WebElement each : basePage.modules) {
            actualModulesAsString.add(each.getAttribute("aria-label"));
            if (actualModulesAsString.size() == expectedMainModules.size()){break;}
        }
        Assert.assertEquals(expectedMainModules, actualModulesAsString);
    }

}
