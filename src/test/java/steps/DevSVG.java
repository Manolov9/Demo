/*
package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import pageobjects.MenBaseball;

public class DevSVG {

    private WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {

        //System.setProperty("webdriver.gecko.driver","C:\\webdrivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @Given("^Navigate to svg masks$")
    public void Navigate_to_svg_masks() throws Exception {
        driver.get("http://dev.embodee.com/gcomposer");
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).clear();
        driver.findElement(By.name("user")).sendKeys("lucho");
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys("@ccess4Lucho!");
        driver.findElement(By.cssSelector("input.form-control.btn.btn-default")).click();
        driver.get("http://dev.embodee.com/gcomposer/svgmasks/747226");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@state='enabled']")).click();

        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.xpath("//button[@state='enabled']"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(2000);
        }

        acceptNextAlert = true;
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(@id, 'svg-mask-save')]")).click();
        //assertTrue(closeAlertAndGetItsText().matches("^Save masks to the default UD[\\s\\S]$"));


        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();

        } catch (NoAlertPresentException e) {
            Thread.sleep(2000);
        }
        Thread.sleep(2000);

        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(1000);
        alert2.accept();

        Thread.sleep(3000);

    }


    @When("^Verify generate and save masks$")
    public void Verify_generate_and_save_masks() throws Exception {

        */
/*WebElement dropdown = driver.findElement(By.id("combo-gender"));

        List<WebElement> options = dropdown.findElements(By.tagName("option"));

        for (WebElement option : options) {
            if("Men Soccer".equals(option.getText()))
                option.click();
        }*//*


        new Select(driver.findElement(By.id("combo-gender"))).selectByVisibleText("Men Soccer");
        new Select(driver.findElement(By.id("combo-type"))).selectByVisibleText("bottom");
        new Select(driver.findElement(By.id("combo-product-id"))).selectByVisibleText("728955");

    }


    @Then("^Log out$")
    public void Log_out() throws Exception {

        driver.findElement(By.linkText("Admin")).click();

        driver.findElement(By.linkText("Sign Out")).click();

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}
*/
