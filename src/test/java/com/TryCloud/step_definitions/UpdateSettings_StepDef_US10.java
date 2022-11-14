package com.TryCloud.step_definitions;

import com.TryCloud.pages.BasePage;
import com.TryCloud.pages.UpdateSettingsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class UpdateSettings_StepDef_US10 extends BasePage {


    UpdateSettingsPage updateSettingsPage = new UpdateSettingsPage();

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

        file.click();

    }
    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() throws InterruptedException {

         updateSettingsPage.settings.click();


    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() throws InterruptedException {


        for (int i = 0; i < updateSettingsPage.checkBoxfiles.size()-1; i++) {

            if(!updateSettingsPage.checkBoxfiles.get(i).isSelected()){
                updateSettingsPage.checkBoxfiles.get(i).click();
                Thread.sleep(1000);
            }

        }

    }




















}
