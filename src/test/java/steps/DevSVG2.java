package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

import pageobjects.MenBaseball;

import static org.junit.Assert.fail;


public class DevSVG2 {

    public MenBaseball pageObjects;

    @Before
    public void buildDriver() {
        pageObjects = new MenBaseball();
    }

    @After
    public void destroyDriver() {
        pageObjects.close();
    }

    @Given("^Navigate to svg masks \"(.*?)\"$")
    public void Navigate_to_svg_masks(String URL) throws Exception {
        pageObjects.getWebDriver().get("http://dev.embodee.com/gcomposer"); //WebDriver.get("http://dev.embodee.com/gcomposer");
        pageObjects.credentials("lucho", "@ccess4Lucho!");
        pageObjects.login();
        pageObjects.getWebDriver().get(URL);
        Thread.sleep(2000);

    }

    @When("^Verify generate and save masks$")
    public void Verify_generate_and_save_masks() throws Exception {
        pageObjects.RebuildMasks().click();
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.xpath("//button[@state='enabled']"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(2000);
        }
        pageObjects.AcceptNextAlert();
        pageObjects.SaveMask().click();
        try {
            Alert alert = pageObjects.getWebDriver().switchTo().alert();
            alert.accept();

        } catch (NoAlertPresentException e) {
            Thread.sleep(2000);
        }
        Thread.sleep(2000);

        Alert alert2 = pageObjects.getWebDriver().switchTo().alert();
        Thread.sleep(1000);
        alert2.accept();

        Thread.sleep(3000);
//
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.xpath("//button[@state='enabled']"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(2000);
        }

    }

    @Then("^Log out$")
    public void Log_out() throws Exception {
        pageObjects.logout();

    }

    private boolean isElementPresent(By by) {
        try {
            pageObjects.getWebDriver();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

/*
    @Given("^Navigate to svg masks \"([^\"]*)\"$")
    public void navigateToSvgMasks(String SVG) throws Throwable {
        pageObjects.getWebDriver().get("http://dev.embodee.com/gcomposer"); //WebDriver.get("http://dev.embodee.com/gcomposer");
        pageObjects.credentials("lucho", "@ccess4Lucho!");
        pageObjects.login();
        pageObjects.getWebDriver().get(SVG);
        Thread.sleep(2000);

    }*/
//s
}
