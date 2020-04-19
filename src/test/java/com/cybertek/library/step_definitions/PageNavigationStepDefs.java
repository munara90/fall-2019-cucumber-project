package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.DashBoardPage;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class PageNavigationStepDefs {
    DashBoardPage dashBoardPage = new DashBoardPage();

    @When("I click on {string} link")
    public void i_click_on_link(String link) {
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        switch (link.toLowerCase()) {
            case "dashboard":
                dashBoardPage.dashboard.click();
                break;
            case "users":
                dashBoardPage.users.click();
                break;
            case "books":
                dashBoardPage.books.click();
                break;
        }
    }

    @Then("{string} page should be displayed")
    public void page_should_be_displayed(String page) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith(page.toLowerCase()));
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        switch (page.toLowerCase()) {
            case "users":
                String actual = dashBoardPage.pageHeader.getText();
                Assert.assertEquals("User Management", actual);
                break;
            case "books":
                actual = dashBoardPage.pageHeader.getText();
                Assert.assertEquals("Book Management", actual);
                break;
        }
        Driver.getDriver().close();
    }

    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String arg0) {
    }



}

