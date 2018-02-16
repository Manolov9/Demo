package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.fail;


public class MenBaseball extends Tools {
    public WebElement clearUsernameField() {
        return findElementBy(By.name("user"));
    }

    public WebElement getUsernameField() {
        return findElementBy(By.name("user"));
    }

    public WebElement clearPassField() {
        return findElementBy(By.name("pass"));
    }

    public WebElement getPassField() {
        return findElementBy(By.name("pass"));
    }

    public WebElement getLoginButton() {
        return findElementBy(By.cssSelector("input.form-control.btn.btn-default"));
    }

    public WebElement RebuildMasks() throws InterruptedException {


        return findElementBy(By.xpath("//button[@state='enabled']"));
    }

    public WebElement SaveMask() {
        return findElementBy(By.xpath("//*[contains(@id, 'svg-mask-save')]"));
    }

    public WebElement getAdminPage() {
        return findElementBy(By.linkText("Admin"));
    }

    public WebElement getLogoutButton() {
        return findElementBy(By.linkText("Sign Out"));
    }


    public void credentials(String user, String password) {
        clearUsernameField().clear();
        getUsernameField().click();
        getUsernameField().sendKeys(user);
        clearPassField().clear();
        getPassField().click();
        getPassField().sendKeys(password);
    }

    public void login() {
        getLoginButton().click();
    }

    public void logout() throws InterruptedException {
        getAdminPage().click();
        Thread.sleep(3000);
        getLogoutButton().click();
    }

    private boolean isElementPresent(By by) {
        try {
            getWebDriver();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
