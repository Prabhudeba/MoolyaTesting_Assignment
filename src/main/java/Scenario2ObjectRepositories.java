import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario2ObjectRepositories {

    private WebDriver driver;

    public Scenario2ObjectRepositories(WebDriver driver) {

        this.driver = driver;
    }
    public WebElement EmailField() {
        return reusableMethods.waitElementToPresence(driver, By.id("email"), 30);
    }

    public WebElement PasswordField() {
        return reusableMethods.waitElementToPresence(driver, By.id("passwd"), 30);
    }

    public WebElement signInBtn() {
        return reusableMethods.waitElementToBeClickable(driver, By.id("SubmitLogin"), 30);
    }

    public WebElement successfullyCreatedAccount() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//p[contains(text(), \"Welcome to your account.\")]"), 30);
    }

    public WebElement getAccountLogout() {
        return reusableMethods.waitElementToBeClickable(driver, By.xpath("//a[@title=\"Log me out\"]"), 30);
    }


    public WebElement signInBtn2() {
        return reusableMethods.waitElementToBeClickable(driver, By.xpath("//*[@title='Log in to your customer account']"), 30);
    }

}
