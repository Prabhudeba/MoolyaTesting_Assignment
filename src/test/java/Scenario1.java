
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Scenario1 {
    private WebDriver driver;
    private Actions action;
    private Scenario1OjectRepositories scenario1;

    @Test
    public void setupURL() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
        driver=new ChromeDriver();
        action=new Actions(driver);
        String URL="http://automationpractice.com/";
        driver.get(URL);
    }
    @Test
    public void selectingToCart(){

        Assert.assertTrue(scenario1.getWomenCategory().isDisplayed());
        scenario1.getWomenCategory().click();
        action.moveToElement(scenario1.addCartProductHover("27")).perform();
        action.click(scenario1.addButtonByPrice("27","More")).build().perform();
    }

    @Test
    public void changeColorIfMore(){
        
        System.out.println("My commit-2");

    }

    @Test
    public void changeSIze(){

        System.out.println("My commit-2");

    }

    @Test
    public void addingToCart(){
        scenario1.addCartBtn().click();
        Assert.assertTrue(scenario1.proceedTochekout().isDisplayed(),"Successfully added to shopping cart page");
        scenario1.proceedTochekout().click();
        Assert.assertTrue(scenario1.getCartSummaryTable().isDisplayed());


    }

    @Test
    public void signInForm(){
        scenario1.EmailAddressInput().sendKeys("");
        scenario1.passwordInput().sendKeys("");
        scenario1.signInButton().click();

    }

    @Test
    public void addressFillup(){
        scenario1.addressInput().sendKeys("House-11");
        scenario1.cityInput().sendKeys("Bangalore");
        scenario1.postcodeInput().sendKeys("00000");
        scenario1.homePhone().sendKeys("9999999999");
        scenario1.mobilePhone().sendKeys("7977298253");
        Select sel=new Select(driver.findElement(By.id("id_state")));
        sel.selectByVisibleText("Arizona");
        scenario1.saveBtn().click();
    }

    @Test
    public void shippingForm(){
    scenario1.getCartSummTermsOfServiceCheck().click();
    scenario1.getCartProceedBtnTwo().click();
    }
    @Test
    public void paymentInformation() {
        scenario1.CartSummPayByBankWire().click();
        Assert.assertEquals(scenario1.getCartPaymentConfirm().getText(), "BANK-WIRE PAYMENT.");

    }
    @Test
    public void confirmOrder(){
        scenario1.CartSummConfirmOrderBtn().click();
        Assert.assertTrue(scenario1.getCartSummSuccessMsg().isDisplayed());
        Assert.assertEquals(scenario1.getCartSummSuccessMsg().getText(), "Your order on My Store is complete.");
    }








}
