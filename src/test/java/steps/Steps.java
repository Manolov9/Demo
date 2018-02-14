package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;


public class Steps {
    //public static final String USERNAME = "ilianavajarova1";
    //public static final String AUTOMATE_KEY = "anQesbpRtAnE2aYhxQxd";
    //public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    private WebDriver driver;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {

        //System.setProperty("webdriver.gecko.driver","C:\\webdrivers\\geckodriver.exe");
        driver = new FirefoxDriver();

    }


    @Given("^: Add book test in amazon$")
    public void Amazon_Book() throws Exception {
        driver.get("http://dev.embodee.com/gbuilder/index.html?garment=881257&rules=temp");
        Assert.assertEquals("Text", driver.findElement(By.id("Text")).getText());

        driver.findElement(By.id("Text")).click();

        TimeUnit.SECONDS.sleep(10);
    }


    @When("^: Verify book steps in amazon$")
    public void Verify_Steps() throws Exception {
        driver.findElement(By.id("hlb-view-cart-announce")).click();
        try {
            Assert.assertEquals("A Game of Thrones (A Song of Ice and Fire, Book 1)", driver.findElement(By.xpath("//form[@id='activeCartViewForm']/div[2]/div/div[4]/div[2]/div/div/div/div[2]/ul/li/span/a/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            Assert.assertEquals("Paperback", driver.findElement(By.xpath("//form[@id='activeCartViewForm']/div[2]/div/div[4]/div[2]/div/div/div/div[2]/ul/li[2]/span/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            Assert.assertEquals("£3.85", driver.findElement(By.xpath("//form[@id='activeCartViewForm']/div[2]/div/div[4]/div[2]/div[2]/p/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            Assert.assertEquals("Quantity", driver.findElement(By.xpath("//form[@id='activeCartViewForm']/div/div/div[3]/span")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }
        try {
            Assert.assertEquals("1", driver.findElement(By.id("a-autoid-2-announce")).getText());
        } catch (Error e) {
            verificationErrors.append(e.toString());
        }

    }


    @Then("^: Complete test verify add book basket$")
    public void AddBasket_Verify() throws Exception {


    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}

