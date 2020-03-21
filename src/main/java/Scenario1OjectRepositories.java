import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Scenario1OjectRepositories {
    private WebDriver driver;

    public Scenario1OjectRepositories(WebDriver driver) {

        this.driver = driver;
    }
    public WebElement getWomenCategory() {
        return reusableMethods.waitElementToBeClickable(driver, By.xpath("//a[@title='Women']"), 30);
    }

    public WebElement addButtonByPrice(String Price,String buttonName) {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//span[contains(text(),"+Price+")]/..//following-sibling::div[@class='button-container']//span[text()="+buttonName+"]"), 30);

    }

    public WebElement addCartProductHover(String Price) {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//div[@class='right-block']//div[@class='content_price']//span[contains(text(),"+Price+")]"), 30);

    }
    public WebElement addCartBtn() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//span[text()='Add to cart']"), 30);

    }

public WebElement proceedTochekout() {
    return reusableMethods.waitElementToPresence(driver, By.xpath("//*[contains(text(),'Proceed to checkout')]"), 30);

}
    public WebElement checkoutBtn() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//*[contains(@title,'Proceed to checkout')]"), 30);

    }
    public WebElement getCartSummaryTable() {
        return reusableMethods.waitElementToPresence(driver, By.id("cart_summary"), 30);

    }

    public WebElement EmailAddressInput() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//*[@id='email']"), 30);

    } public WebElement passwordInput() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//*[@id='passwd']"), 30);

    } public WebElement signInButton() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//*[@name='SubmitLogin']"), 30);

    }
    public WebElement addressInput() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//*[@name='address1']"), 30);

    }
    public WebElement cityInput() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//*[@name='city']"), 30);

    }

    public WebElement postcodeInput() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//*[@name='postcode']"), 30);

    }public WebElement homePhone() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//*[@name='phone']"), 30);

    }
    public WebElement mobilePhone() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//*[@name='phone_mobile']"), 30);

    }
    public WebElement aliasName() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//*[@name='alias']"), 30);

    }
    public WebElement saveBtn() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//*[@name='submitAddress']"), 30);

    }
    public WebElement getCartSummTermsOfServiceCheck() {
        return reusableMethods.waitElementToPresence(driver, By.id("cgv"), 30);
    }
    public WebElement getCartProceedBtnTwo() {
        return reusableMethods.waitElementToBeClickable(driver, By.xpath("//button[@type=\"submit\"]/span[contains(text(), \"Proceed to checkout\")]"), 30);
    }
    public WebElement CartSummPayByBankWire() {
        return reusableMethods.waitElementToBeClickable(driver, By.xpath("//a[@title=\"Pay by bank wire\"]"), 30);
    }
    public WebElement getCartPaymentConfirm() {
        return reusableMethods.waitElementToBeClickable(driver, By.xpath("//h3[contains(text(), \"Bank-wire payment.\")]"), 30);
    }

    public WebElement CartSummConfirmOrderBtn() {
        return reusableMethods.waitElementToBeClickable(driver, By.xpath("//button[@type=\"submit\"]/span[contains(text(), \"I confirm my order\")]"), 30);
    }
    public WebElement getCartSummSuccessMsg() {
        return reusableMethods.waitElementToPresence(driver, By.xpath("//p[contains(text(), \"Your order on My Store is complete.\")]"), 30);
    }








}
