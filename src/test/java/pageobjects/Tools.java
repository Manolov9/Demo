package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Tools {


    private WebDriver webDriver;
    private boolean acceptNextAlert = true;

    public Tools() {
        buildDriver();
    }

    private void buildDriver() {
        webDriver = new ChromeDriver();

        //webDriver = new FirefoxDriver(); //
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //webDriver.get("http://dev.embodee.com/gcomposer");
    }

    public void AcceptNextAlert() throws InterruptedException {
        acceptNextAlert = true;
        Thread.sleep(3000);
    }

    public void close() {
        webDriver.quit();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }


    public WebElement findElementBy(By by) {
        boolean f = true;
        int br = 0;
        WebDriverWait wait = new WebDriverWait(webDriver, 1);
        WebElement element = null;

        while (f) {
            br++;
            try {
                Thread.sleep(1000);
                element = wait.until(ExpectedConditions.elementToBeClickable(by));
                f = false;
                return element;
            } catch (Exception e) {
                if (br == 10) System.out.println(e);
            }
            if (br == 10) f = false;
        }

        return element;

    }


}
